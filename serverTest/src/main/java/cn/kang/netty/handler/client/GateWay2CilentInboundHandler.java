package cn.kang.netty.handler.client;

import cn.kang.common.util.Log;
import cn.kang.netty.handler.server.ServerInboundHandler;
import cn.kang.proto.PBMessage;
import io.netty.channel.ChannelHandlerContext;

//与客户端连接处理
public class GateWay2CilentInboundHandler extends ServerInboundHandler {

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		PBMessage packet = (PBMessage) msg;
		// 数据包按协议号转发
//		ForwardRoute2ClientAction action = new ForwardRoute2ClientAction(packet, ctx.channel(), true);
//		action.getActionQueue().enqueue(action);

	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		try {
			// Log.error("客户端异常", cause);
			ctx.close();
			// System.err.println("客户端异常" + cause);
		} catch (Exception e) {
			Log.error("Con2CilentInboundHandler", e);
		}
	}

	@Override
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		// super.channelUnregistered(ctx);
		Log.error("-------------客户端断开连接-------------");
		// 从在线玩家列表中,将该user移除
//		if (ctx.channel().attr(AttributeKeySet.PLAYER_ID) != null && ctx.channel().attr(AttributeKeySet.PLAYER_ID).get() != null) {
//			long userId = ctx.channel().attr(AttributeKeySet.PLAYER_ID).get();
//			if (userId > 0) {
//				UserMgr.removeOnline(userId, ctx.channel());
//			}
//		}
		// 从临时玩家channel列表中，将该channel移除
//		if (ctx.channel().attr(AttributeKeySet.TEMP_USER_ID) != null && ctx.channel().attr(AttributeKeySet.TEMP_USER_ID).get() != null) {
//			long temp_userId = ctx.channel().attr(AttributeKeySet.TEMP_USER_ID).get();
//			if (temp_userId != 0) {
//				UserMgr.removeTempSession(temp_userId, ctx.channel());
//			}
//		}
	}
}
