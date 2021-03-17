package cn.kang.socket;

import cn.kang.proto.PBMessage;
import io.netty.channel.Channel;

public interface Command {

	public abstract void execute(Channel channel, PBMessage packet) throws Exception;

}
