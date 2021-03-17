package cn.kang.protocol;

/**
 * 发往网关服务器协议，范围25000-30000
 */
public interface GatewayProtocol {

	public static final short	G_LOGIN_GATEWAY			= 25001;// 登录第一步： 登录网关

	public static final short	G_USER_WAITE			= 25002;// 登录第三步：准备登录

	public static final short	G_PLAYER_LOGIN			= 25003;// 登录第四步：角色登录

	public static final short	G_PLAYER_LOGIN_OUT		= 25004;// ：角色退出

	public static final short	G_PLAYER_CREATE			= 25005;// 请求创建角色

	public static final short	G_PLAYER_CREATE_RESULT	= 25006;// 创建角色结果

	public static final short	G_BROADCAST_PACKET		= 25007;// 广播包

	public static final short	G_PING_PACKET			= 25008;// 接受客户端ping包

	public static final short	G_BROADCAST_SERVER		= 25009;// 全服广播

	public static final short	G_KICK_PLAYER			= 25010;// 踢人下线

	public static final short	G_KICK_ALL_PLAYER		= 25011;// 踢所有人下线

	public static final short	G_CLOSE_SERVER			= 25012;// 关服

	public static final short	G_CROSS_STATU			= 25013;// 跨服服务器状态

	public static final short	G_USER_CROSS_STATU		= 25014;// 玩家跨服状态
	public static final short	G_TRY_PING_CROSS		= 25015;// ping cross

	public static final short	GET_GATEWAY_USER_COUNT	= 25016;// 获取单个网关在线人数
	public static final short	G_PING_CHECK_PARAM1		= 25017;// 调整ping包检测参数

	public static final short	G_SIMPLE_MESSAGE		= 25018;// 玩家未注册角色前，弹出简单提示

}
