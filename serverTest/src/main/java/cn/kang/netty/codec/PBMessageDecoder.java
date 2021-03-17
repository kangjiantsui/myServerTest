package cn.kang.netty.codec;

import cn.kang.proto.PBMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.net.InetSocketAddress;
import java.util.List;

/**
 * 数据包解码器
 */

public class PBMessageDecoder extends ByteToMessageDecoder {
	public PBMessageDecoder() {

	}

	protected enum State {
		READ_HEADER , READ_LENGTH , READ_CODE , READ_PLAYER_ID , READ_KEY , READ_DATA
	}

	protected State	currentState	= State.READ_HEADER;

	protected short	headerFlag;
	protected int	lenght;
	protected short	code;
	protected long	playerId;
	protected int	key;

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (in.readableBytes() < PBMessage.HDR_SIZE) {
			return;
		}
		PBMessage message = PBMessage.buildPBMessage();
		int readIndex = in.readerIndex();
		switch (currentState) {
			case READ_HEADER:
				headerFlag = in.readShortLE();
				if (PBMessage.HEADER != headerFlag) {
					InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
					String clientIP = insocket.getAddress().getHostAddress();
					ctx.channel().close();
					return;
				} else {
					currentState = State.READ_LENGTH;
				}
			case READ_LENGTH:
				// 长度
				lenght = in.readIntLE();
				if (lenght < PBMessage.HDR_SIZE || lenght >= PBMessage.DATA_LENGTH_MAX) {
					// 非法的数据长度
					ctx.channel().close();
					return;
				}
				message.setLen(lenght);
				currentState = State.READ_CODE;
				// 剩余长度，是否足够
				if (lenght - 6 > in.readableBytes()) {
					// 数据还不够读取,等待下一次读取
					in.readerIndex(readIndex);
					currentState = State.READ_HEADER;
					return;
				}
			case READ_CODE:
				// 获取协议号
				code = in.readShortLE();
				message.setCode(code);
				currentState = State.READ_PLAYER_ID;
			case READ_PLAYER_ID:
				// 获取用户ID
				playerId = in.readLongLE();
				message.setPlayerId(playerId);
				currentState = State.READ_PLAYER_ID;
			case READ_KEY:
				if (!readKey(in, message)) {
					InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
					String clientIP = insocket.getAddress().getHostAddress();
					ctx.channel().close();
					return;
				}
			case READ_DATA:
				readData(in, message, out);
				break;
		}
	}

	/**
	 * 读取key
	 * 
	 * @param in
	 * @param message
	 */
	protected boolean readKey(ByteBuf in, PBMessage message) {
		key = in.readIntLE();
		message.setKey(key);
		return true;
	}

	/**
	 * 读取数据包
	 * 
	 * @param in
	 * @param message
	 * @param out
	 */
	protected void readData(ByteBuf in, PBMessage message, List<Object> out) {
		int pblen = message.getLen() - PBMessage.HDR_SIZE;
		byte[] bytes = new byte[pblen];
		in.readBytes(bytes, 0, pblen);
		message.setBytes(bytes);
		currentState = State.READ_HEADER;
		out.add(message);
	}
}
