package cn.kang.user;

import cn.kang.common.util.Log;
import cn.kang.constant.CrossState;
import cn.kang.netty.AttributeKeySet;
import cn.kang.netty.LinkedClient;
import cn.kang.proto.PBMessage;
import io.netty.channel.Channel;

/**
 * <pre>
 * 玩家对象
 * </pre>
 */
public class User {

	private final long			playerId;
	private Channel				channel;
	private long				lastSyncTime;
	private int					acceleratCount;
	private LinkedClient 		crossClient;
	private String				serverName;
	private volatile CrossState	crossState	= CrossState.NOT_LOGIN;
	private int					decodeIndex	= 1;

	public User(final long playerId, Channel channel) {
		this.playerId = playerId;
		this.channel = channel;
		if (channel != null) {
			this.channel.attr(AttributeKeySet.USER_ID).set(playerId);
		}
		lastSyncTime = System.currentTimeMillis();
		acceleratCount = 0;
	}

	public long getPlayerId() {
		return playerId;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public long getLastSyncTime() {
		return lastSyncTime;
	}

	public void setLastSyncTime(long lastSyncTime) {
		this.lastSyncTime = lastSyncTime;
	}

	public int getAcceleratCount() {
		return acceleratCount;
	}

	public void setAcceleratCount(int acceleratCount) {
		this.acceleratCount = acceleratCount;
	}

	public void addAcceleratCount() {
		acceleratCount++;
	}

	public LinkedClient getCrossClient() {
		return crossClient;
	}

	public void setCrossClient(LinkedClient crossClient) {
		this.crossClient = crossClient;
	}

	public void sendToUser(PBMessage packet) {
		if (packet == null) {
			return;
		}
		if (channel == null || channel.isActive() == false) {
			Log.error("playerId :" + this.playerId + "  连接断开" + channel.id().toString() + "  code :" + packet.getCode());
			return;
		}
		try {
			channel.write(packet);
			channel.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public CrossState getCrossState() {
		return crossState;
	}

	public void setCrossState(CrossState crossState) {
		this.crossState = crossState;
	}

	public int getIndex() {
		return decodeIndex;
	}

	public void stepIndex() {
		decodeIndex = decodeIndex + 1;
	}

}
