package cn.kang.netty.codec;

import cn.kang.proto.PBMessage;
import cn.kang.user.User;
import io.netty.buffer.ByteBuf;

import java.net.InetSocketAddress;

public class GateWayPBMessageDecoder extends PBMessageDecoder {

    @Override
    protected boolean readKey(ByteBuf in, PBMessage message) {
        // TODO Auto-generated method stub
        key = in.readIntLE();
        message.setKey(key);
        //应该是一个加密验证的方法
        if (message.getPlayerId() > 0) {
//			User user = UserMgr.getOnlineUser(message.getPlayerId());
//			int verfiyKey = ((message.getCode() + user.getIndex() + message.getLen()) * 22695477 + 1) % 100000007;
//			if (verfiyKey != message.getKey() && message.getKey() != 0) {
//				InetSocketAddress insocket = (InetSocketAddress) user.getChannel().remoteAddress();
//				//Log.error("the key is not vaild ! playerId = " + user.getPlayerId() + " - ip = " + insocket.getAddress().getHostAddress() + " code = " + message.getCode());
//				//踢掉用户 TODO 暂时先不踢
//				//user.getChannel().close();
//			}
//			user.stepIndex();
        }
        return true;
    }


//	/**
//	 * 读取数据包
//	 * 
//	 * @param in
//	 * @param message
//	 * @param out
//	 */
//	@Override
//	protected void readData(ByteBuf in, PBMessage message, List<Object> out) {
//		int pblen = message.getLen() - PBMessage.HDR_SIZE;
//		byte[] bytes = new byte[pblen];
//		in.readBytes(bytes, 0, pblen);
//		if(message.getPlayerId() > 0)
//		{
//			for(int i = 0; i<bytes.length; i++)
//			{
//				bytes[i] = (byte) (bytes[i] ^ message.getKey());
//			}
//		}
//		message.setBytes(bytes);
//		currentState = State.READ_HEADER;
//		out.add(message);
//	}
}
