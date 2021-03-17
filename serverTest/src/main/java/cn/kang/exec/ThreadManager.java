package cn.kang.exec;


import cn.kang.common.util.Log;

import java.util.Random;

/**
 * 线程管理类
 */
public class ThreadManager {

	static Random							r						= new Random();
	// 用户响应动作执行线程池
	public static ActionExecutor			actionExecutor;

	//// 用户响应动作执行线程池
	public static ActionExecutor			PlayerActionExecutor;

	// 用户响应动作执行队列
	private static AbstractActionQueue[]	ActionQueues			= new AbstractActionQueue[1000];

	private static AbstractActionQueue		registerSavaQueue;

	// 用户响应动作执行线程池
	public static ActionExecutor			monsterKillExecutor;
	// 击杀怪物队列
	private static AbstractActionQueue[]	monsterKillActionQueues	= new AbstractActionQueue[1000];

	public static AbstractActionQueue getActionRandom() {
		AbstractActionQueue queue = ActionQueues[(r.nextInt(ActionQueues.length))];
		if (queue == null) {
			Log.error("获取一个空的队列");
			return actionExecutor.getDefaultQueue();
		}
		return queue;
	}

	public static AbstractActionQueue getRegisterSavaQueue() {
		return registerSavaQueue;
	}

	public static AbstractActionQueue getUserQueue(long playerId) {
		return getUserQueue(playerId, 0);
	}

	public static AbstractActionQueue getMonsterKillUserQueue(long playerId) {
		int size = (int) (playerId % monsterKillActionQueues.length);
		return monsterKillActionQueues[size];
	}

	public static AbstractActionQueue getMonsterKillRandomQueue() {
		AbstractActionQueue queue = monsterKillActionQueues[(r.nextInt(monsterKillActionQueues.length))];
		if (queue == null) {
			Log.error("获取一个空的队列");
			return monsterKillExecutor.getDefaultQueue();
		}
		return queue;
	}

	public static AbstractActionQueue getUserQueue(long playerId, int type) {
		try {
			AbstractActionQueue queue = null;
			if (playerId <= 0) {
				if (type == 1) {
					return ActionQueues[0];
				} else {
					return ActionQueues[1];
				}
			} else {
				int size = (int) (playerId % ActionQueues.length);
				queue = ActionQueues[Math.min(2, size)];
			}
			if (queue == null) {
				Log.error("获取一个空的队列");
				return actionExecutor.getDefaultQueue();
			}
			return queue;
		} catch (Exception e) {
			Log.error("获取一个空的队列", e);
			return actionExecutor.getDefaultQueue();
		}
	}

	static {
		int corePoolSize = 32;
		int maxPoolSize = 64;
		int keepAliveTime = 5;
		int cacheSize = 128;
		actionExecutor = new ActionExecutor(corePoolSize, maxPoolSize, keepAliveTime, cacheSize, "WORD_ACTION_EXECUTOR");
		monsterKillExecutor = new ActionExecutor(corePoolSize * 2, maxPoolSize * 2, keepAliveTime, cacheSize, "KILL_MOUSTER_ACTION_EXECUTOR");
		PlayerActionExecutor = new ActionExecutor(corePoolSize, maxPoolSize, keepAliveTime, cacheSize, "PLAYER_ACTION_EXECUTOR");

		for (int i = 0; i < ActionQueues.length; i++) {
			AbstractActionQueue actionQueue = new AbstractActionQueue(actionExecutor);
			ActionQueues[i] = actionQueue;
		}
		for (int i = 0; i < monsterKillActionQueues.length; i++) {
			AbstractActionQueue actionQueue = new AbstractActionQueue(monsterKillExecutor);
			monsterKillActionQueues[i] = actionQueue;
		}

		registerSavaQueue = new AbstractActionQueue(actionExecutor);
	}

	// 用户请求动作执行线程池
	public static CmdExecutor				cmdExecutor;
	// 用户响应动作执行队列
	private static AbstractCmdTaskQueue[]	cmdQueues	= new AbstractCmdTaskQueue[1000];

	static {
		int corePoolSize = 8;
		int maxPoolSize = 32;
		int keepAliveTime = 5;
		int cacheSize = 64;
		cmdExecutor = new CmdExecutor(corePoolSize, maxPoolSize, keepAliveTime, cacheSize, "WORD_CMD_TASK_EXECUTOR");

		for (int i = 0; i < ActionQueues.length; i++) {
			AbstractCmdTaskQueue cmdQueue = new AbstractCmdTaskQueue(cmdExecutor);
			cmdQueues[i] = cmdQueue;
		}
	}

	public static AbstractCmdTaskQueue getCmdRandom() {
		AbstractCmdTaskQueue queue = cmdQueues[(r.nextInt(cmdQueues.length))];
		if (queue == null) {
			Log.error("获取一个空的队列");
			return cmdExecutor.getDefaultQueue();
		}
		return queue;
	}

	public static AbstractCmdTaskQueue getCmdRandom(long playerId) {
		if (playerId < 0) {
			return cmdExecutor.getDefaultQueue();
		}
		int size = (int) (playerId % cmdQueues.length);
		try {
			AbstractCmdTaskQueue queue = cmdQueues[size];
			if (queue == null) {
				Log.error("获取一个空的队列");
				return cmdExecutor.getDefaultQueue();
			} else {
				return queue;
			}
		} catch (Exception e) {
			Log.error("获取一个空的队列", e);
		}
		return cmdExecutor.getDefaultQueue();
	}

	// 执行战斗线程池
	public static ActionExecutor battleExecutor;
	static {
		int corePoolSize = 8;
		int maxPoolSize = 32;
		int keepAliveTime = 5;
		int cacheSize = 64;
		battleExecutor = new ActionExecutor(corePoolSize, maxPoolSize, keepAliveTime, cacheSize, "WORD_BATTLE_EXECUTOR");
	}
}
