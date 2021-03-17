package cn.kang.netty.handler.server;

import cn.kang.protocol.Protocol;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.Attribute;

import java.net.InetSocketAddress;
import java.util.Collection;

public class ServerInboundHandler extends ChannelInboundHandlerAdapter {
	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		ctx.close();
		cause.printStackTrace();
	}

//	protected boolean authentication(Channel channel, short code) {
//		if (code != Protocol.C_REGISTER && code != Protocol.S_REGISTER && code != Protocol.CR_REGISTER && code != Protocol.C_CROSS_STATU) {
//			Attribute<Long> gateWay_id = channel.attr(AttributeKeySet.GATEWAY_ID);
//			if (gateWay_id == null) {
//				Log.error("获取到非法的连接信息");
//				return false;
//			}
//			if (gateWay_id.get() == null || gateWay_id.get() != ServerRegisterCmd.GATEWAY_ID) {
//				Log.error("获取到非法的连接信息" + gateWay_id.get() + " code :" + code);
//				return false;
//			}
//			return true;
//		} else {
//			InetSocketAddress insocket = (InetSocketAddress) channel.remoteAddress();
//			String clientIP = insocket.getAddress().getHostAddress();
//			return checkIp(clientIP);
//		}
//	}

	// 访问IP限制
//	private static boolean checkIp(String ip) {
//		try {
//			if (StringUtils.isNullOrEmpty(ip)) {
//				return false;
//			}
//			if (ip.equals("127.0.0.1")) {
//				return true;
//			}
//			Collection<NetConfigXml> gateWayConfigs = NetConfigSet.getNetConfigXml(ServerType.GATEWAY);
//			for (NetConfigXml config : gateWayConfigs) {
//				if (ip.equals(config.getAddress())) {
//					return true;
//				}
//			}
//			return false;
//		} catch (Exception e) {
//			Log.error("检查IP异常:" + ip, e);
//			return false;
//		}
//	}
}
