package cn.kang.protocol;

/**
 * 发往跨服服务器协议，范围28001-29000
 */
public interface CrossProtocol {
	public static final short	CR_REGISTER						= 28001;	// 网关注册
	public static final short	CR_TRY_PING						= 28002;	// center服尝试ping自己的跨服
	public static final short	CR_LOGIN_IN						= 28003;	// 简单数据登录跨服服务器
	public static final short	CR_BATTLE_LOGIN_IN				= 28004;	// 登录到跨服的战斗场景
	public static final short	CR_LOGIN_OUT					= 28005;	// 登出跨服服务器
	public static final short	CR_WORD_STATU					= 28006;	// 跨服状态
	public static final short	CR_ENTERSCENE					= 28007;	// 登录跨服地图

	/** 同步分身数据 */
	public static final short	CR_SYNC_AVATAR_DATA				= 28008;
	public static final short	CR_PROPERTY_UPDATE				= 28009;	// 玩家所有战斗属性更新
	public static final short	CR_ATTRIBUTE_UPDATE				= 28010;	// 玩家属性更新
	public static final short	CR_GET_CROSS_COUNT				= 28011;	// 获取玩家数量
	public static final short	CR_RELOAD_TEMPLATE				= 28012;	// 重载系统配置
	public static final short	CR_ACTIVITY_JOIN				= 28013;	// 参加跨服活动
	/**
	 * 法定已装备禁制改变
	 */
	public static final short	CR_MAGICWP_DATA_UPDATE			= 28014;

	/** 跨服服务器暂停服务 */
	public static final short	CR_OUT_OF_SERVICE				= 28015;

	public static final short	CR_ROOM_RECRUIT_RESULT			= 28103;
	/** 创建房间 */
	public static final short	CR_REQ_CREATE_ROOM				= 28104;
	/** 获取房间列表 */
	public static final short	CR_REQ_ROOM_LIST				= 28105;
	/** 房间操作消息 */
	public static final short	CR_ROOM_OPTION					= 28106;
	/** 邀请玩家加入房间 */
	public static final short	CR_INVITATION_JOIN_ROOM			= 28107;
	/** 发送跨服聊天 */
	public static final short	CR_SEND_CROSS_CHAT				= 28108;

	/** 玩家所有信息更新 */
	public static final short	CR_PLAYER_UPDATE				= 28109;

	/** DEBUG代码 */
	public static final short	CR_DEBUG_CMD					= 28110;

	/** 房间内镜像助战 */
	public static final short	CR_IMAGE_COMBAT					= 28111;

	/** 请求跨服活动排行榜信息 */
	public static final short	CR_REQ_ACTIVITY_RANK_INFO		= 28112;

	/** 日志汇集 */
	public static final short	CR_COLLECTION_LOG				= 28113;

	/** 同步分身阵型 */
	public static final short	CR_SYNC_AVATAR_FORMATION		= 28114;

	// ===========================>拉取其他用户详细<===================
	public static final short	CR_OTHER_RANK_INFO				= 28199;	// 其他用户排行榜页面信息
	public static final short	CR_OTHER_ESCORT_IFNO			= 28200;	// 其他用户护法信息
	public static final short	CR_OTHER_INFO_MSG				= 28201;	// 获取其他玩家信息
	public static final short	CR_OTHER_EQUIPMENT_IFNO			= 28202;	// 其他用户装备信息
	public static final short	CR_OTHER_MAGICWP_IFNO			= 28203;	// 其他用户法宝信息
	public static final short	CR_OTHER_MOUNT_IFNO				= 28204;	// 其他用户坐骑信息
	public static final short	CR_OTHER_PET_IFNO				= 28205;	// 其他用户宠物信息
	public static final short	CR_OTHER_SOUL_IFNO				= 28206;	// 其他用户魂幡信息

	public static final short	CR_RENAME_UPDATE				= 28207;	// 玩家改名更新
	public static final short	CR_PVPDUOQI_SCORE				= 28208;	// 请求pvp夺旗积分信息
	public static final short	CR_PVPDUIQI_HAND_BOX			= 28209;	// pvp夺旗上交宝箱
	public static final short	CR_CITY_WAR_UDPATE				= 28210;	// 城战数据更新
	public static final short	CR_PVPDUIQI_GET_PANEL_INFO		= 28211;	// pvp夺旗请求面板信息
	public static final short	CR_GUILD_LAND_REQ				= 28212;	// 门派领地战请求

	// public static final short CR_MATCH_SCORE_ALL = 28213; 开服后请求当前赛季积分

	public static final short	CR_CROSS_MATCH_SCORE_ADD		= 28214;	// center服告诉跨服有门派添加积分

	public static final short	CR_GUILD_LAND_CHECK				= 28215;	// 活动结束但没收到完成消息时去跨服重拉数据

	public static final short	CR_CHAT_CROSS					= 28216;	// 跨服聊天

	public static final short	CR_NEW_SERVER_MATCH				= 28217;	// 新服自动开启赛季

	/** 爬塔战场请求传送 */
	public static final short	CR_TOWER_FIGHT_TRANSFER			= 28218;

	/** 师徒系统请求 */
	public static final short	CR_MENTORSHIP_REQ				= 28219;

	// ===========================>跨服仙府争锋<===================
	public static final short	CR_PVP_1V1_OPTION				= 28220;	// 1v1操作

	public static final short	CR_SYNC_SERVER_AVG_FIGHT		= 28221;	// 同步服务器平均战力

	public static final short	CR_SERVER_CROSS_MATCH_INIT		= 28222;	// 本地服务器来跨服请求赛季信息

	public static final short	CR_RELATION_INTIMACY			= 28223;	// 通知跨服服务器副本房间的好友亲密度关系

	public static final short	CR_CROSS_BOSS					= 28224;	// 跨服首领

	public static final short	CR_PVP_1V1_OLD_OPTION			= 28225;	// 1v1操作

	public static final short	CR_BOSS_SOAR					= 28226;	// 跨服BOSS飞升活动请求

	public static final short	CR_TRADE_CROSS_INNER			= 28227;	// 跨服交易内部协议

	public static final short	CR_TRADE_PURCHASE_CROSS_INNER	= 28228;	// 跨服交易求购内部协议

	public static final short	CR_CROSS_LAIR					= 28229;	// 跨服VIP首领
	// ==========================>跨服心魔活动<======================
	public static final short	CR_SYNC_ROBOT_DATA				= 28231;	// 跨服心魔数据
	public static final short	CR_SYNC_REWARD_STATU			= 28232;	// 跨服心魔奖励确认

	// ===========================>跨服夫妻2v2比赛<===================

	public static final short	CR_MARRIAGE_2V2_OPTION			= 28230;	// 夫妻请求操作

	// ==========================>段位<======================
	/** 请求段位相关信息 */
	public static final short	CR_REQ_QUALIFYING_INFO			= 28241;
	/** 收到中心服务器发送奖励成功 */
	public static final short	CR_QUALIFYING_AWARD_SUCCESS		= 28242;
	/** 增加段位积分 */
	public static final short	CR_ADD_DUANWEI					= 28243;

	/** 按类型增加段位积分 */
	public static final short	CR_ADD_DUANWEI_TYPE				= 28244;

	// ==========================>吃鸡战场<======================
	public static final short	CR_REQ_SET_BORN_POS				= 28251;	// 请求设置玩家出生点
	public static final short	CR_REQ_WAY_OPTION				= 28252;	// 吃鸡战场请求操作信息

	// ==========================>同步服务器开服时间<======================
	public static final short	CR_SYNC_SERVER_START_TIME		= 28253;	// 请求设置玩家出生点

	// ==========================>镖车相关<======================
	public static final short	CR_CREATE_SEASON_TRUCK			= 28254;	// center服请求创建镖车

	public static final short	CR_CITY_WAR_CALL				= 28255;	// 客户端城战请求召唤

	public static final short	CR_CITY_WAR_CALL_INNER			= 28256;	// 内部城战请求召唤

	public static final short	CR_CITY_WAR_GUILD_LEAD			= 28257;	// 城战指挥

	public static final short	CR_CHILD_REARUIT				= 28258;	// 孩子招募

	public static final short	CR_CHILD_OPTION					= 28259;	// 孩子操作

	public static final short	CR_CHILD_MARRIAGE				= 28260;	// 孩子提亲

	public static final short	CR_DUANWEI_BUY					= 28261;	// 段位商店购买

	public static final short	CR_CITYWAR_SEED_GUILD			= 28262;	// 城战初始化种子门派

	public static final short	CR_CHAT_CROSS_NO_SENDER			= 28263;	// 跨服聊天

	public static final short	CR_CROSS_TERRITORY_REQ			= 28264;	// 跨服领地战请求

	public static final short	CR_CROSS_TERRITORY_INNER		= 28265;	// 跨服领地战内部协议

	public static final short	CR_CROSS_GROUP_BOSS				= 28266;	// 跨服分组首领请求

	public static final short	CR_CROSS_GROUP_BOSS_INNER		= 28267;	// 跨服分组首领服务器内部协议

	public static final short	CR_CROSS_TEAM					= 28268;	// 跨服组队请求协议

	public static final short	CR_CROSS_LAND					= 28269;	// 跨服国战请求协议

	public static final short	CR_CROSS_LAND_INNER				= 28270;	// 跨服国战服务器内部协议

	// =====================更新战斗模式==================================
	public static final short	CR_CHANGE_BATTLE_MODE			= 28271;	// 更新跨服战斗模式
	// =====================跨服职业变更==================================
	public static final short	CR_CHANGE_TRANSFER_JOB			= 28272;

	public static final short	CR_MENTORSHIP_INNER				= 28273;	// 师徒系统内部消息

	public static final short	CR_SYN_ARES_INFO				= 28274;	// 同步战胜榜信息

	public static final short	CR_WORLD_LEV					= 28275;	// 同步全服世界等级

	// ===========================>拉取其他用户详细<===================
	public static final short	CR_OTHER_AVATAR_INFO			= 28276;	// 其他用户分身信息
	public static final short	CR_OTHER_SKILL_INFO				= 28277;	// 其他用户技能信息
	public static final short	CR_OTHER_RUNES_INFO				= 28278;	// 其他用户神纹信息
	public static final short	CR_FIGHT_COMPARE				= 28279;	// 其他用户战力信息

	// ===========================>PPT消息<===================
	/** 跨服中PPT活动中，玩家请求移动 */
	public static final short	CR_PPT_PLAYER_MOVE_REQ			= 28301;
	/** 跨服中PPT活动中，玩家请求同步自己位置 */
	public static final short	CR_PPT_PLAYER_SYNC_REQ			= 28302;
	/** 跨服中PPT活动中，玩家操作请求 */
	public static final short	CR_PPT_OPTION_REQ				= 28303;

	// ===========================>战报操作<===================
	/** 战斗统计请求操作 */
	public static final short	CR_BATTLE_REPORT_OPTION			= 28311;

	// ========================门派护卫================================
	/** 同步护卫系统的属性 */
	public static final short	CR_SYNC_GUILD_ESCORT_PROPERTY	= 28315;
	/** 同步护卫系统的任务状态 **/
	public static final short	CR_SYNC_GUILD_ESCORT_TASK_STATU	= 28316;
	/** 设置某个玩家的个人段位信息 */
	public static final short	CR_SET_PLAYER_QUALITY			= 28317;
	/** 请求某个玩家的星甲激活状态 */
	public static final short	CR_SYNC_GUILD_ESCORT_OPEN_STATU	= 28318;
	/** 获取房间列表(组队形式) */
	public static final short	CR_REQ_TEAM_ROOM_LIST			= 28319;

	// ========================跨服达人================================
	/** center服定期向跨服同步达人的积分数据 */
	public static final short	CR_WEEK_MASTER_RANK_INFO_LIST	= 28330;
	/** center服向跨服发送达人操作 */
	public static final short	CR_WEEK_MASTER_OPTION_INNER		= 28331;

	// ==========================跨服赛季修改=================================
	/** 请求跨服赛季日志消息 */
	public static final short	CR_CROSS_MATCH_LOG_REQ			= 28332;
	/**
	 * 客户端请求跨服赛季排行
	 */
	public static final short	CR_CROSS_MATCH_RANK_REQ			= 28333;

	/**
	 * 门派奖励确认
	 */
	public static final short	CR_CROSS_REWARD_ACK				= 28334;

	/** 遗迹战场操作 */
	public static final short	CR_CROSS_GROUP_OPTION			= 28335;
	/** 遗迹战场内部协议 */
	public static final short	CR_CROSS_GROUP_INNER			= 28336;
	/** 遗迹战场拍卖操作 */
	public static final short	CR_CROSS_AUCTION_OPTION			= 28337;
	/** 战场拍卖内部协议 */
	public static final short	CR_CROSS_AUCTION_INNER			= 28338;
	/** 跨服聊天消息删除 */
	public static final short	CR_CHAT_CROSS_DELETE			= 28339;
	/** 跨服个人比武 */
	public static final short CR_PERSONAL_CONTEST_OPTION = 28340;
}
