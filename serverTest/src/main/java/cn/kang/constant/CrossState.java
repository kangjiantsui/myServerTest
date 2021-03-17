package cn.kang.constant;

import java.util.HashMap;
import java.util.Map;

public enum CrossState {
	NOT_LOGIN ( "未登陆跨服" , 1000 ) , DATA_LOGIN ( "数据登录上跨服服务器" , 1001 ) , IN_ROOM ( "跨服组队中" , 1002 ) , FIELD_LOGIN ( "跨服场景中" , 1003 ) , BATTLER_OYALE_STATU ( "吃鸡状态" , 1004 ),;
	private String							des;
	private int								code;

	private static Map<Integer, CrossState>	map	= new HashMap<>();

	static {
		CrossState[] states = CrossState.values();
		for (CrossState state : states) {
			map.put(state.getCode(), state);
		}
	}

	public static CrossState get(int code) {
		return map.get(code);
	}

	private CrossState(String des, int code) {
		this.des = des;
		this.code = code;
	}

	public int getCode() {
		return this.code;
	}

	public String toStirng() {
		return des;
	}
}
