package cn.kang.netty.handler.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;

//与客户端连接处理类
public class GateWayt2ClientOutboundHandler extends ServerOutboundHandler {
	@Override
	public void disconnect(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
		// 从在线玩家列表中,将该user移除
//		if (ctx.channel().attr(AttributeKeySet.PLAYER_ID) != null) {
//			long userId = ctx.channel().attr(AttributeKeySet.PLAYER_ID).get();
//			if (userId != 0) {
//				UserMgr.removeOnline(userId, ctx.channel());
//			}
//		}
		// 从临时玩家channel列表中，将该channel移除
//		if (ctx.channel().attr(AttributeKeySet.TEMP_USER_ID) != null) {
//			long temp_userId = ctx.channel().attr(AttributeKeySet.TEMP_USER_ID).get();
//			if (temp_userId != 0) {
//				UserMgr.removeTempSession(temp_userId, ctx.channel());
//			}
//		}
	}
}
