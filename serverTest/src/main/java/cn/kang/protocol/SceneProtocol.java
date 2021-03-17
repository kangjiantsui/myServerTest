package cn.kang.protocol;

/**
 * 发往场景服务器协议，20001-25000
 */

public interface SceneProtocol {
	public static final short	S_LOGIN_IN							= 20001;	// 登录场景服务器
	public static final short	S_LOGIN_OUT							= 20002;	// 退出
																				// 场景服务器

	public static final short	S_REGISTER							= 20003;	// 网关注册
	public static final short	S_ONLY_LOGIN_OUT					= 20004;	// 仅退出scene服务器

	public static final short	S_KICK_ALL_PLAYER					= 20005;	// 踢掉所有玩家

	public static final short	S_CLOSE_SERVER						= 20006;	// 关闭进程

	public static final short	S_CENTER_START_COMPLATE				= 20007;	// 收到center开启成功

	public static final short	S_STOP_SERVER_SAVEDATA				= 20008;	// 关服前结算系统数据
	public static final short	S_WORD_STATU						= 20009;	// 世界状态

	public static final short	S_ENTERSCENE						= 20011;	// 进入场景
	public static final short	S_REQ_MOVE							= 20012;	// 请求移动
	public static final short	S_REQ_SYNC_P						= 20013;	// 同步位置

	public static final short	S_REQ_ACTION						= 20015;	// 请求Action

	public static final short	S_REQ_STOP							= 20018;	// 玩家停止移动

	public static final short	S_REQ_PLAYER_DETAIL					= 20021;	// 玩家详细数据
	public static final short	S_RELIEVE_PROTECTION				= 20022;	// 玩家进入场景成功,取消保护

	public static final short	S_TOUCH_POINT						= 20023;	// 玩家接触到地图上的节点(传送阵)

	// ===========================>battle<==============================
	public static final short	S_ARMY_ATTACK						= 20024;	// 玩家请求攻击
	// ===========================>end<==============================

	public static final short	S_PROPERTY_UPDATE					= 20025;	// 玩家所有战斗属性更新

	public static final short	S_SCRIPT_RELOAD						= 20026;	// 重新加载脚本

	public static final short	S_TEMPLETE_RELOAD					= 20027;	// 重新加载模板配置

	public static final short	S_DROP_PICKUP						= 20028;	// 掉落物拾取

	public static final short	S_DROP_PICKUP_RESULT				= 20029;	// 掉落物品背包添加结果

	public static final short	S_PET_INFO_UPDATE					= 20030;	// 通知场景中宠物信息更新

	public static final short	S_PLAYER_CALL_REQ_MOVE				= 20031;	// 角色召唤物请求移动

	public static final short	S_ATTRIBUTE_UPDATE					= 20032;	// 玩家属性更新

	public static final short	S_PLAYER_MOUNT_STATE_REQ			= 20033;	// 请求上下坐骑
	public static final short	S_PLAYER_UPDATE						= 20034;	// 玩家数据更新

	public static final short	S_PLAYER_MANA_UPDATE				= 20035;	// 玩家灵力更新

	public static final short	S_PLAYER_SOUL_BLOOD_ADD				= 20036;	// 玩家魂血回复

	public static final short	S_ARMY_TEMPORARY_LEAVE				= 20037;	// 玩家暂离场景服
	public static final short	S_ARMY_REBACK						= 20038;	// 玩家回归场景服
	public static final short	S_DEBUG_CMD							= 20039;	// DEBUG代码

	public static final short	S_AVATAR_CHANGE						= 20040;	// 分身切换

	// ===========================>campaign<=========================
	public static final short	S_CREATE_CAMPAIGN					= 20050;	// 请求创建副本
	public static final short	S_CAMPAIGN_OPTION					= 20051;	// 副本操作
	// public static final short S_CREATE_CAMPAIGN_BY_NPC = 20052; //
	// 根据NPCID创建副本
	public static final short	S_CREATE_PLOT						= 20053;	// 创建剧情人物
	public static final short	S_CREATE_SYSTEM_CAMPAIGN			= 20054;	// 系统创建副本
	public static final short	S_CAMPAIGN_SYSTEM_OPTION			= 20055;	// 系统副本操作
	public static final short	S_CAMPAIGN_EXP_STATISTICS			= 20056;	// 副本经验统计

	public static final short	S_REMOVE_BUFF_BY_ID					= 20057;	// 移除一个指定的BUFF

	public static final short	S_CUR_POS_WARING_SKILL				= 20058;	// 同步自己位置，请求结算技能伤害

	public static final short	S_CAMPAIGN_PUBLIC_EXP_ENTER			= 20059;	// 进入练功秘境

	// DEBUG

	// ===========================>end<==============================
	public static final short	S_PLAYER_REVIVAL					= 20101;	// 复活
	public static final short	S_EQUIPMENT_APPEARANCE_BUFF			= 20102;	// 装备buff

	/** 被动光环buff的进出操作 */
	public static final short	S_AUREOLE_SOURCE_BUFFER_OP			= 20103;

	/** 请求掉落信息 */
	public static final short	S_GET_DROP_RECORD					= 20104;

	/** 进入新年活动副本 */
	public static final short	S_NEW_YEAR_CAMPAIGN_JOIN			= 20105;

	/** 玩家跟同队中的好友情义值 */
	public static final short	S_RELATION_INTIMACY					= 20106;

	// =============================门派活动==============================================
	/** 门派活动请求pvp夺旗积分信息 */
	public static final short	S_GUILD_PVPDUOQI_SCORE				= 20107;
	/** 门派活动上交宝箱 */
	public static final short	S_GUILD_PVPDUIQI_HAND_BOX			= 20108;
	/** 门派活动pvp夺旗请求面板信息 */
	public static final short	S_GUILD_PVPDUIQI_GET_PANEL_INFO		= 20109;
	
	public static final short	S_NEW_YEAR_BEAST					= 20110;
	
	public static final short	S_NEW_YEAR_BEAST_OPTION				= 20111;

	// =============================战报数据记录==============================================
	/** 战斗统计请求操作 */
	public static final short	S_BATTLE_REPORT_OPTION				= 20121;

	// ============================>采集<=====================================
	/** 采集 */
	public static final short	S_REQ_GATHER						= 20500;
	/** 队伍信息 --建队 */
	public static final short	S_TEAM_INFO							= 20501;
	/** 入队 */
	public static final short	S_TEAM_ADD							= 20502;
	/** 离队 */
	public static final short	S_TEAM_LEAVE						= 20503;
	/** 队长变更 */
	public static final short	S_TEAM_LEADER_CHANE					= 20504;
	/** 队消毁 */
	public static final short	S_TEAM_DESTROY						= 20506;
	/** 创建一个属于个人的私有怪物 */
	public static final short	S_CREATE_PIRVATE_MONSTER			= 20507;
	/** 查询是否存在私有怪物 */
	public static final short	S_SEARCH_PRIVATE_MONSTER			= 20508;
	/** 请求队伍信息 */
	public static final short	S_REQ_TEAM_INFO						= 20509;

	// =========================>同步战斗模式<===============================

	/** 聊天消息内部通讯，通知场景服发给所在场景所有玩家 */
	public static final short	S_CHAT_INNER_SEND					= 20510;

	/** 怪物当前位置同步 */
	public static final short	S_MONSTER_POS_SYNC					= 20511;

	/** 玩家创建陷阱 */
	public static final short	S_CREATE_SNARE						= 20512;

	/** 陷阱操作 */
	public static final short	S_TOUCHU_SNARE_STATU				= 20513;
	// =============================>魂幡融合技能<=========================
	/**
	 * 魂幡融合技能更新同步
	 */
	public static final short	S_REQ_SOUL_FUSESKILL_UPDATE			= 20514;
	/** 魂幡数更新 */
	public static final short	S_REQ_SOUL_EXP						= 20515;

	/** 挑战副本服务器内部消息 */
	public static final short	S_CHALLENGE_CAMPAIGN_INNER			= 20516;

	/** 双人坐骑请求 */
	public static final short	S_DOUBLE_MOUNT_REQ					= 20517;

	/** 法宝信息更新 */
	public static final short	S_MAGICWP_SKILL_UPDATE				= 20518;

	/** 同步掉落限制 */
	public static final short	S_SYNC_DROP_LIMIT					= 20519;

	// ==========================门派护卫=================================
	/** 同步护卫系统的属性 **/
	public static final short	S_SYNC_GUILD_ESCORT_PROPERTY		= 20525;
	/** 同步护卫系统的任务状态 **/
	public static final short	S_SYNC_GUILD_ESCORT_TASK_STATU		= 20526;
	/** 星卫状态同步 */
	public static final short	S_ESCORT_EQUIPMENT_PLAYER_STATU		= 20527;

	/** 玩家简单信息 */
	public static final short	S_RESP_PLAYER_SIMPLE				= 20528;

	/** 离队(玩家) */
	public static final short	S_TEAM_LEAVE_FOR_PLAYER				= 20600;
	/** 变更战斗模式 */
	public static final short	S_BATTLE_MODE						= 20601;

	// ===================================================================
	/** 请求创建天逆珠秘境副本 **/
	public static final short	S_CREATE_INVERSE_BEAD_CAMPAIGN		= 20602;
	/** 怪物 **/
	public static final short	S_CREATE_INVERSE_SYNC_MONSTER		= 20603;

	// =============================>运镖系统<=========================
	/** 客户端请求创建镖车 */
	public static final short	S_REQ_TRUCK_CREATE					= 20701;
	/** 请求镖车到达检查点 */
	public static final short	S_REQ_TRUCK_ARRIALCHECKPOINT		= 20702;
	/** 镖车相关Action */
	public static final short	S_REQ_TRUCK_ACTION					= 20703;
	/** 镖车请求移动 */
	public static final short	S_REQ_TRUCK_MOVE					= 20704;
	/** 镖车同步位置点 */
	public static final short	S_REQ_TRUCK_SYNCPOS					= 20705;
	/** 镖车停止移动 */
	public static final short	S_REQ_TRUCK_STOP					= 20706;
	/** 镖车数据 */
	public static final short	S_RESP_TRUCK_INFO					= 20710;
	/** 内部请求创建镖车 */
	public static final short	S_REQ_TRUCK_CREATE_C				= 20717;
	/** 镖车吸取灵力 */
	public static final short	S_REQ_ABSORB_MANA					= 20718;
	/** 连接镖车 */
	public static final short	S_REQ_TRUCK_LINK					= 20719;

	/** 境界职业内部协议 */
	public static final short	S_STATE_INNER						= 20720;

	/** 请求运镖结算 */
	public static final short	S_REQ_TRUCK_SETTLEMENT				= 20722;

	/**
	 * 添加BUFF列表
	 */
	public static final short	S_ADD_BUFF_LIST						= 20723;

	/** 进入转职副本 */
	public static final short	S_STATE_CAMPAIGN_INNER				= 20724;

	/** 切换玩家流派 */
	public static final short	S_CHANGE_SECT						= 20725;
	/** 战神榜一键跳过 */
	public static final short	S_CREATE_ARES_RANK_SKIP				= 20736;

	/** 战神榜挑战 */
	public static final short	S_CREATE_ARES_RANK_BATTLE			= 20737;

	// =============================>分身<=========================
	/** 同步分身数据 */
	public static final short	S_SYNC_AVATAR_DATA					= 20738;
	/** 同步修改灵气 */
	public static final short	S_RE_WRITE_AVATAR_ENERGY			= 20739;
	// ==================================>境界<==========================
	/** 战场挑战 */
	public static final short	S_CREATE_ARENA_BATTLE				= 20740;
	/** 客户端控制机器人攻击 */
	public static final short	S_ROBOT_ATTACK						= 20741;

	/**
	 * 创建境界副本
	 */
	public static final short	S_STATE_TRANSFER_JOB_EFFECTS		= 20742;

	/**
	 * 添加BUFF
	 */
	public static final short	S_ADD_BUFF							= 20743;

	/** 创建1V1副本 */
	public static final short	S_CREATE_1V1_BATTLE					= 20744;

	/**
	 * 帮派夺权挑战
	 */
	public static final short	S_GUILD_SEIZE_CHALLENGE				= 20745;

	/** 同步分身阵型 */
	public static final short	S_SYNC_AVATAR_FOMATION				= 20762;

	/**
	 * 删除buff
	 */
	public static final short	S_REMOVE_BUFF						= 20789;

	/**
	 * 玩家帮派更新
	 */
	public static final short	S_PLAYER_GUILD_UPDATE				= 20746;

	/**
	 * 客户端境界副本中的任务操作
	 */
	public static final short	S_STATE_CAMPAIGN_TASK_OP			= 20747;

	/**
	 * 请求野外BOSS信息
	 */
	public static final short	S_BOSS_INNER_SCENE					= 20748;

	/**
	 * 实体传送门触发
	 */
	public static final short	S_TRANSFER_TRIGGER					= 20749;

	/**
	 * 折扣同步
	 */
	public static final short	S_DISCOUNT_LIST						= 20750;

	/**
	 * 获取玩家在世界BOSS夺宝中的箱子数量
	 */
	public static final short	S_TREASURE_COUNT_REQ				= 20751;
	/**
	 * 移动到某种怪附近
	 */
	public static final short	S_NEARMONSTER						= 20752;

	/**
	 * 法定已装备禁制改变
	 */
	public static final short	S_MAGICWP_DATA_UPDATE				= 20753;

	/**
	 * 客户端激活副本节点
	 */
	public static final short	S_ACLIVE_CAMPAING_NODE				= 20754;

	/**
	 * 剧情怪物锁定/解锁
	 */
	public static final short	S_PLOT_MONSTER_LOCK					= 20755;

	/**
	 * GM刷指定怪物
	 */
	public static final short	S_CREATE_MONSTER					= 20756;

	/**
	 * 门派领地战阶段更新
	 */
	public static final short	S_GUILDLAND_STATE					= 20757;

	/**
	 * 门派领地信息初始化
	 */
	public static final short	S_GUILDLAND_INIT					= 20758;

	/**
	 * 客户端请求门派领地操作
	 */
	public static final short	S_GUILDLAND_REQ						= 20759;

	/**
	 * 通知scene服挑战心魔开始
	 */
	public static final short	S_CHALLENGE_DEMON					= 20760;
	/**
	 * 心魔机器人属性同步
	 */
	public static final short	S_CHALLENGE_DEMON_SYS_RANK			= 20761;

	// /**
	// * 请求BOSS详情
	// */
	// public static final short S_FIELD_BOSS_INFO_REQ = 20761;

	/** 强制结束所有PVP1v1副本 */
	public static final short	S_FORCE_STOP_1V1_BATTLE				= 20765;

	/**
	 * 请求回城
	 */
	public static final short	S_REQ_BACK_CITY						= 20766;

	/**
	 * 掉落装备
	 */
	public static final short	S_DROP_EQUIP						= 20767;

	/**
	 * 改名后更新
	 */
	public static final short	S_RENAME_UPDATE						= 20768;

	/**
	 * 中心服通知传送至其他人物身边
	 */
	public static final short	S_DELIVER_TO_PLAYER					= 20769;

	/**
	 * 进入结婚副本场景
	 */
	public static final short	S_ENTER_MARRIAGE_SCENE				= 20770;
	/**
	 * 结婚副本操作
	 */
	public static final short	S_MARRIAGE_CAMPAGIN_OP				= 20771;
	/**
	 * 城战操作请求
	 */
	public static final short	S_CITY_WAR_REQ						= 20772;

	/**
	 * 请求结婚红包数据
	 */
	public static final short	S_MARRIAGE_RED_PACKET				= 20773;

	/**
	 * 城战center通知scene
	 */
	public static final short	S_CITY_WAR_INNER					= 20774;

	/**
	 * 通知玩家结婚对象改变
	 */
	public static final short	S_SYNC_MARRIAGE_APP					= 20775;

	/**
	 * 城战活动城主特殊技能请求
	 */
	public static final short	S_CITY_WAR_SKILL					= 20776;

	/**
	 * 城战活动叛徒消息
	 */
	public static final short	S_CITY_WAR_TRAITOR					= 20777;

	/**
	 * 门派活动服务器内部消息
	 */
	public static final short	S_GUILD_ACTIVITY_INNER				= 20778;

	/**
	 * TODO 功能已经去掉 装备特技buff服务器内部消息 public static final short
	 * S_EQUIP_STUNT_BUFF_INNER = 20779;
	 */
	/**
	 * 装备套装BUFF服务器内部消息
	 */
	public static final short	S_EQUIP_SUIT_BUFF_INNER				= 20780;

	/**
	 * 师徒副本秘境
	 */
	public static final short	S_MENTORSHIP_INNER					= 20781;

	/**
	 * 同步服务器开服时间合服时间到场景服
	 */
	public static final short	S_SYNC_SERVER_TIME					= 20782;

	/**
	 * 仙灵秘境请求协议
	 */
	public static final short	S_SECRET_REQ						= 20783;

	/**
	 * 同步领地boss战信息到scene服
	 */
	public static final short	S_LAND_BOSS_INFO					= 20784;

	/**
	 * 领地BOSS战center服通知scene服
	 */
	public static final short	S_LAND_BOSS_INNER					= 20785;

	/**
	 * 通知scene服本服领地战全部结束
	 */
	public static final short	S_LAND_BOSS_ALLOVER					= 20786;

	/**
	 * 跨服领地战分组世界等级同步场景服
	 */
	public static final short	S_CROSS_TERRITORY_WORLD_LEV			= 20787;

	/**
	 * 传送
	 */
	public static final short	S_CHUAN_SONG						= 20790;
	/**
	 * 请求是否有人在结婚
	 */
	public static final short	S_GET_WHETHER_WEDDING				= 20791;

	/**
	 * 通知scene服玩家参与活动
	 */
	public static final short	S_ACTIVITY_JOIN						= 20792;

	/** 夫妻副本断开连线 */
	public static final short	S_COUPLE_CAMPAIGN_BREAK_LINE		= 20793;

	/** 开始结婚 */
	public static final short	S_START_MARRIAGE					= 20794;

	/** 婚车到达路点 */
	public static final short	S_MARRIAGE_REACH_CHECKPOINT			= 20795;

	/** 获取喜糖奖励 */

	public static final short	S_MARRIAGE_GET_CANDY				= 20796;
	/** 婚车请求移动 */
	public static final short	S_REQ_WEDDINGCAR_MOVE				= 20797;
	/** 婚车同步位置点 */
	public static final short	S_REQ_WEDDINGCAR_SYNCPOS			= 20798;
	/** 婚车停止移动 */
	public static final short	S_REQ_WEDDINGCAR_STOP				= 20799;
	/** 请求婚车消息 */
	public static final short	S_REQ_WEDDINGCAR_INFO				= 20800;
	/** center服同步结婚关系 */
	public static final short	S_SYNCHRONOUS_MARRIAGE_RELATION		= 20801;
	/** center服同步首充副本收益 */
	public static final short	S_SYNCHRONOUS_DAILY_FIRST_CHARGE	= 20802;
	/** 技能特效同步 */
	public static final short	S_SKILL_EFFECT						= 20803;
	/** 切换地图并运镖 */
	public static final short	S_CHANGE_MAP_AND_TRUCK				= 20804;
	/** 登录时候检测个人运镖 */
	public static final short	S_LOGIN_CHECK_TRUCK					= 20805;
	/** center通知加运镖支援buf */
	public static final short	S_TRUCK_HELP_BUFFER					= 20806;
	/** 客户端获取守护可找回的物品数量 */
	// public static final short S_CAMPAIGN_GRADE_RETRIEVE = 20807;
	/** 组队副本同意/拒绝进入副本 */
	public static final short	S_TEAM_CAMPAIGN_RESP				= 20808;
	/** 请求使用回复类药水 */
	public static final short	S_USE_RECOVERY_ITEM					= 20809;
	/** 使用回复类药水产生效果 */
	public static final short	S_USE_RECOVERY_ITEM_SUCCESS			= 20810;
	/** 开启限时boss副本 */
	public static final short	S_OPEN_PROMOTION_BOSS				= 20811;

	/** 通知scene服使用玩具 */
	public static final short	S_USE_TOY							= 20812;
	/** 玩家请求玩玩具 */
	public static final short	S_TOY_OPTION						= 20813;
	/** 通知scene服金鸡快跑开始 */
	public static final short	S_JIN_JI_RUN						= 20814;
	/** 玩家加入金鸡快跑副本 */
	public static final short	S_JIN_JI_JOIN						= 20815;
	/** 主动销毁婚车 */
	public static final short	S_DESTORY_WEDDING_CAR				= 20816;
	/** 发起或者同意/拒绝跳过结婚游街 */
	public static final short	S_SKIP_WEDDING_CAR					= 20817;
	/** 请求婚宴品菜信息 */
	public static final short	S_MARRIAGE_CAMPAGIN_FOOD			= 20818;
	/** 坐骑服务器内部消息 */
	public static final short	S_PLAYER_MOUNT_INNER				= 20819;
	/** BOSS活动服务器内部消息 */
	public static final short	S_OPERATE_BOSS_INNER				= 20820;

	/** BOSS活动服务器内部消息 */
	public static final short	S_SYNC_QUALITY_GROUP				= 20821;

	/** 请求当前地图BOSS血量 */
	public static final short	S_BOSS_HP_REQ						= 20822;
	/** 玩家装配的称号 */
	public static final short	S_APPELL_DISPLAY_LIST				= 20823;

	/** 请求同场景的玩家列表 */
	public static final short	S_SAME_FIELD_PLAYER_LIST			= 20824;

	/** 分身觉醒信息更新 */
	public static final short	S_AVATAR_AWAKE_UPDATE				= 20830;

}
