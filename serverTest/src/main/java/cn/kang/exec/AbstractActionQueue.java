package cn.kang.exec;


import cn.kang.common.util.Log;
import cn.kang.common.util.ThreadSafeRandom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AbstractActionQueue implements ActionQueue {

	private Queue<Action>	queue;
	private ActionExecutor	executor;

	public AbstractActionQueue(ActionExecutor executor) {
		this.executor = executor;
		queue = new LinkedList<Action>();
	}

	public AbstractActionQueue(ActionExecutor executor, Queue<Action> queue) {
		this.executor = executor;
		this.queue = queue;
	}

	public ActionQueue getActionQueue() {
		return this;
	}

	public Queue<Action> getQueue() {
		return queue;
	}

	public void enDelayQueue(DelayAction delayAction) {
		executor.enDelayQueue(delayAction);
	}

	public void enqueue(Action action) {
		boolean canExec = false;
		synchronized (queue) {
			queue.add(action);
			if (queue.size() == 1) {
				canExec = true;
			} else if (queue.size() > 100) {
				if (ThreadSafeRandom.getInstance().next(5000) <= queue.size()) {
					Log.warn(action.toString() + " queue size : " + queue.size());
				}
				if (queue.size() >= 5000) {
					Log.error("action队列过大:" + action.toString() + " queue size : " + queue.size());
					String str = "";
					boolean clear = true;
					for (Action a : queue) {
						if (a.getType() != 0) {
							clear = false;
							break;
						}
						str += a.toString() + " | ";
					}
					Log.error(str);
					if (clear) {
						clear();
					}
				}
			}
		}

		if (canExec) {
			executor.execute(action);
		}
	}

	public void dequeue(Action action) {
		Action nextAction = null;
		synchronized (queue) {
			if (queue.size() == 0) {
				Log.error("queue.size() is 0." + action.getClass().getName());
				return;
			}
			Action temp = queue.remove();
			if (temp != action) {
				Log.error("action queue error. temp " + temp.toString() + ", action : " + action.toString());
			}
			if (queue.size() != 0) {
				nextAction = queue.peek();
			}
		}

		if (nextAction != null) {
			executor.execute(nextAction);
		}
	}

	public void clear() {
		synchronized (queue) {
			new OutSizeThread(new ArrayList<Action>(queue)).start();
			queue.clear();
		}
	}

	static class OutSizeThread extends Thread {
		List<Action> actions;

		public OutSizeThread(List<Action> actions) {
			this.actions = actions;
		}

		public void run() {
			for (Action action : actions) {
				action.execute();
			}
		}
	}

}
