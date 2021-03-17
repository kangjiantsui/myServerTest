
package cn.kang.protocol;

/**
 * 发往center_server，范围 10001 - 20000 10500---10600 11000-12000: 由范加伟使用
 * 10100---10300：由郭小帆使用 10300---10500 由hw使用 10701---10800
 * 
 */
public interface CenterProtocol {

	public static final short	C_REGISTER							= 10001;	//
	public static final short	C_LOGIN_KEY							= 10002;	// 登录第二步，验证KEY，验证通过，则返回角色列表
	public static final short	C_PLAYER_LOGIN						= 10003;	// 登录第五步，加载基础信息
	public static final short	C_PLAYER_DATA						= 10004;	// 登陆第六步：加载玩家数据(客户端分状态多次加载)
	public static final short	C_PLAYER_OUT						= 10005;	// 退出
	public static final short	C_PLAYER_CREATE						= 10006;	// 创建角色
	public static final short	C_PLAYER_RELOAD_SCENCE_DATA			= 10007;	// 回写scene服务器数据
	public static final short	C_PLAYER_KILL_MONSTER				= 10008;	// 收到scene服杀怪通知
	public static final short	C_PLAYER_UPDATA_PRO					= 10009;	// 收到scene服属性修改
	public static final short	C_SCENE_LOGIN_SUCCESS				= 10010;	// 场景服务器登录成功

	public static final short	C_SCENE_START_COMPLATE				= 10011;	// 收到scene服启动成功
	public static final short	C_SCENE_HAPPEN_EVENT				= 10012;	// 收到scene服触发的事件

	public static final short	C_PLAYER_UPDATE_CURRENCY			= 10013;	// 收到scene服货币数量修改
	public static final short	C_PLAYER_UPDATE_ITEM				= 10014;	// 收到scene服物品数量修改

	public static final short	C_STOP_SERVER_SAVEDATA				= 10015;	// 收到scene服关服前保存数据完成

	public static final short	C_PLAYER_DIE						= 10016;	// 收到scene服通知玩家被击杀
	public static final short	C_CROSS_STATU						= 10017;	// 跨服服务器状态
	public static final short	C_CROSS_LOGIN_SUCCESS				= 10018;	// 跨服服务器登录成功
	public static final short	C_PLAYER_CROSS_STATU				= 10019;	// 玩家服务器状态
	public static final short	C_USER_BEHAVIOR_LOG					= 10020;	// 玩家行为日志
	public static final short	C_CROSS_PULL_IN_CAMPAING			= 10021;	// 玩家拉入跨服服务器
	public static final short	C_CROSS_CAMPAIGN_RELOGIN_FAIL		= 10022;	// 玩家重登跨服服务器失败
	public static final short	C_SINGLE_SERVER_USER_COUNT			= 10023;	// 玩家在指定服务器中中数量
	public static final short	C_CROSS_PULL_IN_ACTIVITY			= 10024;	// 玩家拉入跨服服务器活动
	public static final short	C_CROSS_PLAYER_KILL_MONSTER			= 10025;	// 收到cross服杀怪通知

	public static final short	C_SYNC_DROP_LIMIT					= 10026;	// 同步掉落限制

	public static final short	C_SERVER_TEMPLEAVE					= 10027;	// scene服暂离成功

	public static final short	C_PLAYER_DIE_TO_PLAYER				= 10028;	// 本来直接发向客服端的协议,转发到center服做处理

	public static final short	C_CROSS_OUT_OF_SERVICE				= 10029;	// 跨服通知本服预关服状态

	public static final short	C_BOSS_OWNER_CARD_NOTIC				= 10030;	// 收到boss归属卡通知
	// =========================>坐骑<===================================
	/** 获取坐骑信息 */
	public static short			C_MOUNT_GETINFO						= 10101;
	/** 坐骑升级 */
	public static short			C_MOUNT_LEVEL_UP					= 10102;
	/** 清除坐骑升级CD */
	public static short			C_MOUNT_LEVELUPCD_CLEAR				= 10103;
	/** 坐骑升阶 */
	public static short			C_MOUNT_GRADE_UP					= 10104;
	/** 坐骑装备升级 */
	public static short			C_MOUNT_EQUIP_UP					= 10105;
	/** 使用坐骑属性丹 */
	public static short			C_MOUNT_DAN_USE						= 10106;
	/** 选择当前使用的坐骑出战 */
	public static short			C_MOUNT_FIGHT_CHOOSE				= 10107;
	/** 坐骑神兵升阶 */
	public static short			C_MOUNT_WEAPON_UP					= 10108;
	/** 已获得的特殊坐骑 */
	public static short			C_MOUNT_SPECIAL_GET					= 10109;
	/** 请求坐骑升阶 */
	public static short			C_MOUNT_START_UP					= 10110;
	// =========================><===================================

	/** 请求使用属性丹 */
	public static short			C_MAGICWP_DAN_USE					= 10116;
	// =========================>战斗统计请求操作 <===================================
	/** 战斗统计请求操作 */
	public static final short	C_BATTLE_REPORT_OPTION				= 10121;

	// =========================>宠物<===================================
	/** 获取宠物信息 */
	// public static short C_PET_GETINFO = 10126;
	/** 宠物激活 */
	// public static short C_PET_ACTIVATE = 10127;
	/** 请求宠物出战 */
	// public static short C_PET_FIGHT = 10128;
	/** 请求宠物提升资质 */
	// public static short C_PET_TALENT_UP = 10129;
	/** 请求宠物升级 */
	// public static short C_PET_LEVEL_UP = 10130;
	/** 请求宠物炼体 */
	// public static short C_PET_PHYSIQUE_UP = 10131;
	/** 请求宠物品质提升 */
	// public static short C_PET_QUALITY_UP = 10132;
	/** 请求宠物升阶 */
	// public static short C_PET_GRADE_UP = 10133;
	/** 请求宠物总属性 */
	// public static short C_PET_GETTOTALATT = 10134;
	/** 请求宠物炼魂 */
	// public static short C_PET_SOUL_UP = 10135;
	/** 请求宠物技能激活 */
	// public static short C_PET_SKILL_ACTIVATE = 10136;
	/** 请求宠物技能解封 */
	// public static short C_PET_SKILL_OPEN = 10137;
	/** 请求宠物技能升级 */
	// public static short C_PET_SKILL_UP = 10138;
	/** 请求宠物技能装备 */
	// public static short C_PET_SKILL_EQUIP = 10139;
	/** 请求宠物技能更新 */
	// public static short C_PET_SKILL_UPDATE = 10140;
	/** 请求宠物技能装备格解锁 */
	// public static short C_PET_SKILL_SLOT_UNLOCK = 10141;
	// =========================><===================================

	// ========================>物品BEGIN<=================================
	/** 使用物品 */
	public static short			C_ITEM_USE							= 10142;
	/** 使用装备 */
	public static short			C_EQUIMPENT_OPTION					= 10143;
	/** 物品删除 */
	public static short			C_ITEM_DELETE						= 10144;
	/** 请求物品详细信息 */
	public static short			C_ITEM_FULL_INFO					= 10145;

	// =========================>物品END<===================================

	/** 掉落物拾取 */
	public static short			C_DROP_PICKUP						= 10146;

	/** 聊天发送消息 */
	public static short			C_CHAT_SEND							= 10147;
	/** 获取聊天记录 */
	public static short			C_CHAT_HISTORY_REQ					= 10148;

	/** 背包格子解锁 */
	public static short			C_BAG_GRID_UNLOCK					= 10149;

	// =========================>装备成长================================0
	/** 装备栏信息 */
	public static short			C_EQUIPBAR_INFO						= 10150;

	/** 装备信息 */
	public static short			C_EQUIP_INFO						= 10151;

	/** 属性购买 */
	public static short			C_PROPERTY_BUY						= 10153;

	/** 玩家灵力回写 */
	public static short			C_PLAYER_MANA_WRITEBACK				= 10154;

	// =========================>神器成长<==============================
	/** 神器操作请求 */
	public static short			C_ARTIFACT_REQ						= 10155;

	// =========================>帮派<==============================
	/** 门派创建 */
	public static short			C_GUILD_CREATE						= 10156;
	/** 门派操作请求 */
	public static short			C_GUILD_ACTION_REQ					= 10157;

	/** 帮派仓库操作请求 */
	public static short			C_GUILD_WAREHOUSE_REQ				= 10158;

	/** 帮派夺权挑战结果 */
	public static short			C_GUILD_SEIZE_RESULT				= 10159;

	// ==========================野外BOSS========================================
	/** boss系统服务器内部消息 */
	public static short			C_BOSS_INNER						= 10160;

	// /** scene服通知BOSS状态改变，通知关注的人 */
	// public static short C_BOSS_STATE_UPDATE = 10161;

	/** 世界BOSS夺宝活动奖励 */
	public static short			C_WORLD_BOSS_TREASURE_AWARD			= 10162;

	/** 场景服请求发送公告 */
	public static short			C_CHAT_SCENE_SEND					= 10163;

	/** 请求更新掩码 */
	public static short			C_MASK_CODE_UPDATE					= 10164;

	/** 物品出售 */
	public static short			C_SELL_ITEM							= 10165;

	/** 指引标记 */
	public static short			C_GUIDE_MARK						= 10166;

	/** 参与活动 */
	public static short			C_ACTIVITY_JOIN						= 10167;

	/** 物品其他操作 */
	public static short			C_ITEM_OTHER_OPTION					= 10168;

	/** 系统开放 */
	public static short			C_PLOT_MARK							= 10169;

	/** 野外BOSS状态更新 */
	public static short			C_FIELD_BOSS_UPDATE					= 10170;

	/** 门派领地战相关请求 */
	public static short			C_GUILDLAND_REQ						= 10171;

	/** 门派领地状态回写 */
	public static short			C_GUILDLAND_STATE					= 10172;

	/** 请求优惠列表 */
	public static short			C_DISCOUNT_REQ						= 10173;

	/** 挑战心魔完成 */
	public static short			C_CHALLENGE_DEMON_COMPLATE			= 10174;

	/** 物品合成 */
	public static short			C_ITEM_COMPOSE_REQ					= 10175;

	/** 找回系统操作请求 */
	public static short			C_RETRIEVE_OPTION_REQ				= 10176;

	/** 渡劫帮助请求 */
	public static short			C_STATE_CAMPAIGN_HELP_REQ			= 10177;

	/** 领取媒体卡 */
	public static short			C_MEDIA_CARD_REWARD					= 10178;
	/**
	 * 掉落装备
	 */
	public static final short	C_DROP_EQUIP						= 10179;
	/**
	 * 装备栏宝石操作
	 */
	public static final short	C_EQUIP_BAR_STONE_REQ				= 10180;
	/**
	 * 请求改名
	 */
	public static final short	C_RENAME_REQ						= 10181;

	/**
	 * 交易系统操作
	 */
	public static final short	C_TRADE_REQ							= 10182;

	/**
	 * 交易商品列表查询
	 */
	public static final short	C_TRADE_QUERY						= 10183;

	/**
	 * 请求物品指导价格
	 */
	public static final short	C_TRADE_GUIDE_PRICE					= 10184;

	/**
	 * 请求交易日志列表
	 */
	public static final short	C_TRADE_LOG_REQ						= 10185;

	/**
	 * 离线经验消息
	 */
	public static final short	C_OFFLINE_EXP						= 10186;

	/**
	 * 请求库存
	 */
	public static final short	C_TRADE_STOCK_REQ					= 10187;

	/** 物品分解 */
	public static short			C_ITEM_RESOLVE						= 10188;

	/**
	 * 城战完成
	 */
	public static final short	C_CITY_WAR_COMPLETE					= 10189;

	/**
	 * 活动外真实城主信息请求
	 */
	public static final short	C_CITY_REAL_LORD_REQ				= 10190;

	/**
	 * 城主请求禁言
	 */
	public static final short	C_LORD_GAG							= 10191;

	/**
	 * scene服消耗货币
	 */
	public static final short	C_SCENE_COST_CURRENCY				= 10192;

	/**
	 * 城战内部消息
	 */
	public static final short	C_CITY_WAR_INNER					= 10193;

	/**
	 * 分享操作请求
	 */
	public static final short	C_SHARE_REQ							= 10194;

	/**
	 * 跨服通知当前赛季积分更新
	 * 
	 * public static final short C_CROSS_MATCH_SCORE = 10195;
	 */

	/**
	 * 客户端请求跨服赛季排行
	 */
	public static final short	C_CROSS_MATCH_RANK_REQ				= 10196;

	/**
	 * 客户端请求当前服务器当前赛季信息
	 */
	public static final short	C_CROSS_MATCH_SEASON_INFO			= 10197;

	/** 跨服门派改名 */
	public static final short	C_CROSS_GUILD_RENAME				= 10198;

	/** 挑战副本请求 */
	public static final short	C_CHALLENGE_REQ						= 10199;

	/** 挑战副本服务器内部消息 */
	public static final short	C_CHALLENGE_CAMPAIGN_INNER			= 10200;

	// =========================>时装<===================================
	/** 获取时装信息 */
	public static short			C_FASHION_GET						= 10201;
	/** 时装穿上 */
	public static short			C_FASHION_EQUIP						= 10202;
	/** 时装脱下 */
	public static short			C_FASHION_UNEQUIP					= 10203;
	/** 时装进阶 */
	public static short			C_FASHION_GRADE_UP					= 10204;
	/** 开关操作 */
	public static short			C_SWITCH_OPTION						= 10206;

	/** 门派休闲活动请求消息 */
	public static final short	C_GUILD_CASUAL_ACTIVITY_REQ			= 10207;

	/** 门派休闲活动服务器内部消息 */
	public static final short	C_GUILD_ACTIVITY_INNER				= 10208;

	/** 请求跨服赛季日志消息 */
	public static final short	C_CROSS_MATCH_LOG_REQ				= 10210;

	/** 玩家施放技能回写center */
	public static final short	C_PLAYER_USE_SKILL					= 10211;

	/** 去跨服检查领地数据回复 */
	public static final short	C_GUILD_LAND_CHECK					= 10212;

	/** 收到跨服聊天 */
	public static final short	C_CHAT_CROSS						= 10214;

	/** 门派装备仓库请求 */
	public static final short	C_GUILD_EQUIP_REQ					= 10215;

	// =========================>FB奖励操作<===================================
	public static final short	C_FB_OPTION							= 10216;

	/** 悟道系统请求 */
	public static final short	C_TAOIST_REQ						= 10217;

	/** 通用的短协议 */
	public static final short	C_COMMON_SMALL_ACTION				= 10218;

	/** 爬塔战场内部协议 */
	public static final short	C_TOWER_FIGHT_INNER					= 10219;

	/** 爬塔战场内部协议发奖励 */
	public static final short	C_TOWER_FIGHT_REWARD				= 10220;

	/** 装备特技请求 */
	public static final short	C_EQUIP_STUNT						= 10221;

	/** 师徒系统请求 */
	public static final short	C_MENTORSHIP_REQ					= 10222;

	/** scene服通知center副本完成 */
	public static final short	C_MENTORSHIP_INNER					= 10223;

	/** BOSS系统请求 */
	public static final short	C_BOSS_REQ							= 10224;

	/** 装备套装操作 */
	public static final short	C_EQUIP_SUIT_REQ					= 10225;

	/** 交易系统求购功能操作请求 */
	public static final short	C_TRADE_PURCHASE_REQ				= 10226;

	/** 交易系统求购功能列表查询 */
	public static final short	C_TRADE_PURCHASE_QUERY				= 10227;

	/** 装备附魔 */
	public static final short	C_EQUIP_ATTACH						= 10228;

	/** 爬塔战场奖励请求 */
	public static final short	C_TOWER_FIGHT						= 10229;

	/** 悬赏系统请求 */
	public static final short	C_OFFER_REQ							= 10230;

	/** 门派结盟请求 */
	public static final short	C_GUILD_ALLIANCE					= 10231;

	/** 飞升之地门派内部协议 */
	public static final short	C_BOSS_SOAR_INNER					= 10232;

	/** 赛季中玩家获得功勋 */
	public static final short	C_MATCH_PLAYER_ADD_SCORE			= 10233;

	/** 跨服交易服务器内部协议 */
	public static final short	C_TRADE_CROSS_INNER					= 10234;

	/** 跨服交易求购服务器内部协议 */
	public static final short	C_TRADE_PURCHASE_CROSS_INNER		= 10235;

	/** 龙纹系统 */
	public static final short	C_DRAGON_REQ						= 10236;

	/** 脱单宣言请求 */
	public static final short	C_MARRIAGE_NOTICE					= 10237;

	/** 队长集结 */
	public static final short	C_TEAM_CALL							= 10238;

	/** 门派仓库奖励操作请求 */
	public static final short	C_GUILD_WAREHOUSE_REWARD_REQ		= 10239;

	// ===========================门派护卫系统=================================
	/** 门派护卫系统，职位相关请求操作 */
	public static final short	C_GUILD_ESCORT_JOB_REQ				= 10240;
	/** 门派护卫系统，护卫装备相关请求操作 */
	public static final short	C_GUILD_ESCORT_EQUIPMENT_REQ		= 10241;
	/** 星卫状态同步 */
	public static final short	C_ESCORT_EQUIPMENT_PLAYER_STATU		= 10242;

	/** 副本完成内部协议 */
	public static final short	C_CAMPAIGN_SUCCESS					= 10243;

	/** 玩家请求转发 */
	public static final short	C_PLAYER_FORWARD					= 10244;

	/** 本服领地BOSS战请求 */
	public static final short	C_LAND_BOSS_REQ						= 10245;

	/** 跨服领地战内部协议 */
	public static final short	C_CROSS_TERRITORY_INNER				= 10246;

	/** 跨服领地战内部协议 */
	public static final short	C_CROSS_TERRITORY_WORLD_LEV			= 10247;

	/** 跨服分组首领服务器内部协议 */
	public static final short	C_CROSS_GROUP_BOSS_INNER			= 10248;

	/** 跨服国战服务器内部协议 */
	public static final short	C_CROSS_LAND_INNER					= 10249;

	/** 商城购物车请求 */
	public static final short	C_SHOP_CART_REQ						= 10250;

	/** 新通行证请求 */
	public static final short	C_PASSPORT_REQ						= 10251;

	// ===========================跨服賽季=================================
	/**
	 * 跨服赛季排名奖励
	 */
	public static final short	C_CROSS_MATCH_REWARD_INNER			= 10260;

	// =========================>英雄基础技能<===================================
	/** 获取英雄技能信息 */
	public static short			C_HERO_GETSKILLINFO					= 10301;
	/** 英雄技能升级 */
	public static short			C_HERO_UPSKILL						= 10302;
	/** 获取技能总属性 */
	public static short			C_HERO_GETSKILLTOLPRO				= 10303;
	/** 升级技能阶段 */
	public static short			C_HERO_UPHEROSTAGECMD				= 10304;
	/** 一键英雄被动技能升级 */
	public static short			C_HERO_ONKEYUPSKILL					= 10305;

	// =========================><===================================
	/** 系统BUFF操作 */
	public static final short	C_PERSISTENT_BUF_OPTION				= 10306;

	/** 消耗亲密度或情义值 */
	public static final short	C_CONSUME_INTIMACY					= 10307;

	/** 添加经验属性的战斗BUFF */
	public static final short	C_BATTLE_BUFF_ADD_EXP				= 10308;

	/** 立即复活 */
	public static final short	C_PLAYER_REVIVAL					= 10401;
	// =========================>战斗模式<===============================
	/** 变更战斗模式 */
	public static final short	C_BATTLE_MODE						= 10501;
	/** 为sence提供的变更战斗模式 */
	public static final short	C_INNER_BATTLE_MODE					= 10502;
	// ===========================>邮件<==============================
	/** 获取邮件数量 */
	public static final short	C_REQ_GETEMAILS_NUM					= 10505;
	/** 获取指定邮件详细信息 */
	public static final short	C_REQ_GETEMAILINFOBYINDEX			= 10506;
	/** 设置邮件已读 */
	public static final short	C_REQ_SETEMAILREADER				= 10507;
	/** 提取附件 */
	public static final short	C_REQ_GETEMAILATTACKMENT			= 10508;
	/** 一键提取所有邮件附件 */
	public static final short	C_REQ_GETEMAILATTACHMENTBATCH		= 10509;
	/** 删除邮件 */
	public static final short	C_REQ_DELEMAIL						= 10510;
	/** 批量删除邮件 */
	public static final short	C_REQ_DELEMAIL_BATCH				= 10511;
	// ========================><=========================================

	// ==========================>好友<========================================
	/** 获取好友列表 */
	public static final short	C_REQ_GETFRIENDS					= 10512;
	/** 添加好友 */
	public static final short	C_REQ_ADDFRIEND						= 10513;
	/** 通过角色名查询角色信息 */
	public static final short	C_REQ_QUERYROLEBYNAME				= 10514;
	/** 获取最近联系人列表 */
	public static final short	C_REQ_GETRECENTLYLINKMANS			= 10515;
	/** 删除好友 */
	public static final short	C_REQ_DELFRIEND						= 10516;
	/** 获取推荐好友 */
	public static final short	C_REQ_GETRECOMMENDFRIENDS			= 10517;

	// ========================><=========================================

	// ==========================>地图<========================================
	/** 请求变更场景 */
	public static final short	C_CHANGE_MAP						= 10518;
	/** 申请场景入场结果 */
	public static final short	C_ENTER_SENCE_MAP_RESULT			= 10519;
	/** 客户端进入场景结果 */
	@Deprecated
	public static final short	C_ENTER_MAP_RESULT					= 10520;
	/** scene服务器创建地图 */
	public static final short	C_SCENE_CREATE_MAP					= 10524;
	/** scene服务器销毁地图 */
	public static final short	C_SCENE_CREATE_DESTORY				= 10525;

	// ========================><=========================================
	// ========================>战神榜<=====================================
	/** 比赛结果 */
	public static final short	C_ARES_RANK_RESULT					= 10570;
	/** 战神榜操作 */
	public static final short	C_ARES_RANK_OPTION					= 10571;

	// ========================><=========================================

	// =========================>NPC商店<===================================
	/** 获取NPC商店信息 */
	public static final short	C_REQ_GETNPCSHOPINFO				= 10521;
	/** 购买NPC商店物品 */
	public static final short	C_REQ_BUYGOODS						= 10522;
	/** 请求单个NPC商店商品信息 */
	public static final short	C_REQ_GET_INFO_BYID					= 10523;

	// ========================><=========================================

	// =========================>npc对话<===================================
	/** 打开NPC对话 */
	public static final short	C_REQ_OPENNPCDIALOG					= 10527;
	/** NPC对话选项 */
	public static final short	C_REQ_NPCDIALOGSELECT				= 10528;
	// ========================><=========================================

	// =============================>任务<======================================
	/** 获取任务列表 */
	public static final short	C_REQ_TASKLIST						= 10529;
	/**
	 * 任务操作
	 */
	public static final short	C_REQ_TASKOPERATE					= 10530;

	/** 设置任务失败回复 -------------------------------------------此处存在BUG，客户端不停请求 */
	public static final short	C_REQ_SETTASKFAIL					= 10531;
	/**
	 * 设置NPC对话任务完成
	 */
	public static final short	C_REQ_SETNPCDIALOG					= 10532;

	/** 回应查找怪物结果 */
	public static final short	C_INNER_SEARCH_MONSTER				= 10549;
	// ==========================>采集+触发点<=====================================

	/** 触发点 */
	public static final short	C_REQ_TRIGGER						= 10534;

	// ==================================================================
	// =========================>组队<=====================================
	/** 创建队伍 */
	public static final short	C_REQ_CREATE_TEAM					= 10535;
	/** 申请入队 */
	public static final short	C_REQ_APPLY_TO_TEAM					= 10536;
	/** 队长获取申请队列 */
	public static final short	C_REQ_GET_APPLY_LIST				= 10537;
	/** 队长同意/拒绝入队 */
	public static final short	C_REQ_AGREE_TO_TEAM					= 10538;
	/** 队长邀请入队 */
	public static final short	C_REQ_INVITE_TO_TEAM				= 10539;
	/** 接受队长的邀请 */
	public static final short	C_REQ_AGREE_INVITE					= 10540;
	/** 队长主动移交自己队长的职位 */
	public static final short	C_REQ_TEAM_CHANGE_LEADER			= 10541;
	/** 离队 */
	public static final short	C_REQ_TEAM_LEAVE					= 10542;
	/** 踢人 */
	public static final short	C_REQ_TEAM_KICK						= 10543;
	/** 队长设置队伍副本目标 */
	public static final short	C_REQ_TEAM_SET_TARGET				= 10544;
	/** 按照队伍副本目标类型查找队伍列表 */
	public static final short	C_ERQ_GET_TEAM_LIST					= 10545;
	/** 匹配 */
	public static final short	C_ERQ_MATCH_TEAM_TARGET				= 10546;
	/**
	 * 队长清空申请列表
	 */
	public static final short	C_REQ_TEAM_CLEAR_APPLY_LIST			= 10547;
	/** 取消匹配 */
	public static final short	C_REQ_TEAM_CLEAR_MATCH				= 10548;

	/** 任务小飞鞋 */
	public static final short	C_REQ_TASK_CHANGEMAP				= 10552;

	// ==================================================================

	/** 成员一般操作 */
	public static final short	C_MEMBER_COMMON_OPTION				= 10550;
	/** 开始劫镖或者护镖 退出队伍 */
	public static final short	C_START_TRUCK_QUIT_TEAM				= 10554;
	// =================================================================
	/** 商城信息请求 */
	public static final short	C_REQ_MALL_INFO						= 10551;

	/** 请求简单快照信息 */
	public static final short	C_REQ_PLAYER_SIMPLE					= 10553;
	// ==================================================================
	// ============================空间====================================
	/** 获取空间信息 */
	public static final short	C_REQ_GET_SPACE_INFO				= 10556;
	/** 请求空间留言信息 */
	public static final short	C_REQ_GET_SPACE_MESSAGE				= 10557;
	/** 操作日志 */
	public static final short	C_REQ_GET_SPACE_ACTION_LOG			= 10558;
	/** 修改自己空间信息 */
	public static final short	C_REQ_ENDIT_INFO					= 10559;

	// =========================>副本<===================================
	/** 创建副本 */
	public static final short	C_CREATE_CAMPAIGN					= 10601;

	/** 副本创建结果 */
	public static final short	C_CREATE_CAM_RESULT					= 10602;

	/** 退出副本 */
	public static final short	C_QUIT_CAMPAIGN						= 10603;

	/** 进入副本结果 */
	public static final short	C_ENTER_SENCE_CAMPAIGN_RESULT		= 10604;

	/** 返回副本 */
	public static final short	C_BACK_CAMPAIGN						= 10605;

	/** 副本操作 */
	public static final short	C_CAMPAIGN_OPTION					= 10606;

	/** 玩家副本状态 */
	public static final short	C_CAMPAIGN_STATU					= 10607;

	/** 经验、灵石副本扫荡操作 */
	public static final short	C_CAMPAIGN_BEFORE_SWEEP				= 10600;

	// ========================><=========================================

	// ========================>玩家详细信息<=================================
	/** 获取其他玩家详细信息 */
	public static final short	C_GET_OTHER_INFO					= 10608;
	// ========================><=========================================

	// ========================>竞技场<=====================================
	/** 竞技场操作 */
	public static final short	C_DEKARON_OPTION					= 10609;
	/** 比赛结果 */
	public static final short	C_ARENA_RESULT						= 10610;

	// ========================><=========================================

	// ========================>PvP1v1<=====================================
	/** 1v1操作 */
	public static final short	C_PVP_1V1_OPTION					= 10611;
	/** 战斗结果 */
	public static final short	C_PVP_1V1_BATTLE_RESULT				= 10612;
	public static final short	C_PVP_1V1_OLD_OPTION				= 10624;

	// ========================><=========================================
	// ========================>分身操作<====================================
	/** 分身操作 */
	public static final short	C_AVATAR_OPTION						= 10613;

	/** 玩家部分花费回写----仙力 */
	public static short			C_AVATAR_ENERGY_COST				= 10614;
	/** 通关分身副本通知center */
	public static final short	C_PASS_CAMPAIGN_N2CENTER			= 10615;

	/** 副本创建成功返回给center服,扣次数 */
	public static final short	C_CAMPAIGN_CREATE_RESULT			= 10616;

	/** 分身阵型编辑 */
	public static short			C_AVATAR_FORMATION_EDIT				= 10617;

	/** 购买副本收益 */
	public static final short	C_CAMPAIGN_BUY_HARVEST				= 10618;
	// ========================><=========================================

	// ========================>运营活动begin<===============================
	/** 跨服排行活动操作协议 */
	public static final short	C_PROMOTION_CROSS_RANK_OPTIONAL		= 10619;
	/** 运营活动操作协议 */
	public static final short	C_PROMOTION_ACTIVITY_OPTIONAL		= 10620;
	// ========================>运营活动end<=================================

	/** 仙府争锋奖励 */
	public static final short	C_PVP_1V1_REWARD					= 10621;

	/** 运营活动_跨年活动采集回调 */
	public static final short	C_NEW_YEAR_WELCOME_GATHER			= 10622;

	// ========================>分身<=================================
	/** 分身操作 */
	public static final short	C_AVATAR_FIGHT_CALL_BACK			= 10623;

	/** 仙府争锋奖励 */
	public static final short	C_PVP_1V1_OLD_REWARD				= 10625;
	/** 嘉年华活动请求操作 */
	public static final short	C_CARNIVAL_OPTION					= 10626;
	/** 门派返利活动操作请求 */
	public static final short	C_GUILD_REBATE						= 10627;
	// =========================>天逆珠<===============================InverseBead
	/** 天逆珠五行升级 ***/
	public static final short	C_INVERSE_BEAD_UP					= 10701;
	/** 获取天逆珠五行 ***/
	public static final short	C_INVERSE_BEAD_GET					= 10702;
	/** 请求创建天逆珠逆境 **/
	public static final short	C_CREATE_INVERSE_BEAD_CAMPAIGN		= 10703;
	/** 同步过关节点 **/
	public static final short	C_CREATE_INVERSE_SYNC_MONSTER		= 10704;
	/** 重置天逆珠逆境 **/
	public static final short	C_RESET_INVERSE_MONSTER				= 10705;
	/** 天逆珠逆境通过怪 **/
	public static final short	C_INVERSE_MONSTER_SPAWN				= 10706;
	/** 请求领取灵气液 **/
	public static final short	C_INVERSE_RECEIVE_AURA				= 10707;
	// =========================>vip<===============================
	/** 购买vip **/
	public static final short	C_BUY_VIP							= 10708;
	/** 购买vip特权礼包 **/
	public static final short	C_VIP_RECEIVE						= 10709;
	/** 获取首次充值信息 **/
	public static final short	C_GET_VIP_INFO						= 10710;
	/** vip投资 **/
	public static final short	C_VIP_INVESTMENT					= 10711;
	/** 领取vip投资奖励 **/
	public static final short	C_GET_VIP_INVESTMENT_AWARD			= 10712;
	/** 月卡投资操作 **/
	public static final short	C_MONTH_INVESTMENT					= 10713;
	/** 领取月卡投资奖励 **/
	public static final short	C_GET_MONTH_INVESTMENT_AWARD		= 10714;
	/** 仙币投资操作 **/
	public static final short	C_GROWTH_FUND_INVESTMENT			= 10715;
	/** 领取仙币投资奖励 **/
	public static final short	C_GET_GROWTH_FUND_INVESTMENT_AWARD	= 10716;
	// =========================><===============================
	// =========================>运镖<===============================
	/** 请求镖车运镖结束 **/
	public static final short	C_TRUCK_REQTRUCKCOMPLETE			= 10727;
	/** 更新玩家的运镖状态 **/
	public static final short	C_TRUCK_UPDATE_TRUCK_STATE			= 10731;
	/** 镖车被劫 **/
	public static final short	C_TRUCK_ROBBED						= 10732;
	/** 通用镖车一个参数请求 **/
	public static final short	C_TRUCK_ONE_PARAMETER				= 10737;
	/** 客户端请求开始运镖 **/
	public static final short	C_TRUCK_START						= 10738;
	/** 劫镖获得灵力 */
	public static final short	C_ROB_TRUCK_MANA					= 10739;
	/** 内部调用创建镖车 **/
	public static final short	C_CREATE_TRUCK						= 12147;

	// 福利
	/** 领取福利奖励 **/
	public static final short	C_RECEIVE_WELFARE_AWARD				= 10733;
	/** 领取首充奖励 **/
	public static final short	C_RECEIVE_FIRST_RECHARGE_AWARD		= 10740;

	// 客户端日志
	/** 客户端日志记录 **/
	public static final short	C_RECORD_LOGS						= 10734;
	/** 客户端日志记录 **/
	public static final short	C_RECORD_LOG						= 10735;

	// ========================>成就BEGIN<==================================
	/** 领取成就 */
	public static final short	C_GET_ACHIEVEMENT_REWARD			= 10801;
	// ========================>成就END<====================================

	// ========================>称号BEGIN<==================================
	/** 激活称号 */
	public static final short	C_ACTIVE_APPELLATION				= 10811;
	// ========================>称号END<====================================

	/** 极限试炼副本结算 */
	public static final short	C_LIMIT_PRACTICE_OVER_AWARD			= 10820;
	/** 极限试炼副本Log */
	public static final short	C_LIMIT_PRACTICE_OVER_LOG			= 10821;

	// 红包
	/** 玩家发红包接口 */
	public static final short	C_PLAYER_SEND_RED_PACKET			= 10900;
	/** 玩家抢红包接口 */
	public static final short	C_PLAYER_GET_RED_PACKET				= 10901;
	/** 查看红包接口 */
	public static final short	C_SEE_RED_PACKET_INFO				= 10902;
	/** 查看领取红包历史记录 */
	public static final short	C_SEE_RED_PACKET_HISTORY			= 10903;

	// ========================>跨服副本BEGIN<==============================
	public static final short	C_CROSS_ROOM_RECRUIT				= 10910;
	/** 创建跨服房间 */
	public static final short	C_CREATE_CROSS_ROOM					= 10911;
	/** 跨服房间操作 */
	public static final short	C_CREATE_CROSS_ROOM_OPTION			= 10912;
	/** 获取房间列表 */
	public static final short	C_REQ_ROOM_LIST						= 10913;
	/** 邀请用户加入房间 */
	public static final short	C_INVITATION_JOIN_ROOM				= 10914;
	/** 跨服聊天消息 */
	public static short			C_CROSS_CHAT_MSG_SEND				= 10915;
	/** 获取其跨服房间玩家详细信息 */
	public static final short	C_GET_CROSS_OTHER_INFO				= 10916;
	/** 系统获取其他房间内玩家详细信息 */
	public static final short	C_GET_CROSS_OTHER_INFO_FROM_SERVER	= 10917;
	/** 请求pvp夺旗积分信息 */
	public static final short	C_PVPDUOQI_SCORE					= 10918;
	/** pvp夺旗上交宝箱 */
	public static final short	C_PVPDUIQI_HAND_BOX					= 10919;
	/** pvp夺旗请求面板信息 */
	public static final short	C_PVPDUIQI_GET_PANEL_INFO			= 10920;
	// ========================>跨服副本END<================================

	// ========================>夫妻2V2pvp<================================
	/** 夫妻请求操作 */
	public static final short	C_MARRIAGE_2V2_OPTION				= 10921;
	/** 夫妻2V2奖励 */
	public static final short	C_MARRIAGE_2V2_REWARD				= 10922;

	// ========================>吃鸡战场<================================
	/** 吃鸡战场给奖励 */
	public static final short	C_BATTLE_ROYALE_REWARD				= 10923;

	// ========================>用户奖励<================================
	/** 游戏建议反馈 */
	public static final short	C_GAME_FEEDBACK_ACTION				= 10924;
	/** QQVIP反馈 */
	public static final short	C_VIP_SERVICE_ACTION				= 10925;

	// ========================>泡泡堂<================================
	/** 泡泡堂给奖励 */
	public static final short	C_PPT_REWARD						= 10926;

	/** 系统登记开放 */
	public static final short	C_SYS_OPEM_ACTION					= 10927;

	/** PVP15V15奖励相关 */
	public static final short	C_PVP_15V15_REWARD					= 10928;

	/** 玩家每日累充操作请求 */
	public static final short	C_DAY_RC_OPTION						= 10929;

	/** 玩家炼妖操作请求 */
	public static final short	C_LIANYAO_OPTION					= 10930;
	/** 玩家道藏操作请求 */
	public static final short	C_DAOZANG_OPTION					= 10931;

	/** 空间操作 */
	public static final short	C_REQ_SPACE_ACTION					= 11600;
	/** 添加留言 */
	public static final short	C_REQ_SPACE_ADD_MSG					= 11601;
	/** 删除留言 */
	public static final short	C_REQ_SPACE_DEL_MSG					= 11602;
	/** 收藏相关 */
	public static final short	C_REQ_SPACE_SET_COLLECTION			= 11603;
	/** 设置礼物 */
	public static final short	C_REQ_SPACE_SET_GIFT				= 11604;
	/**
	 * 请求信息
	 */
	public static final short	C_REQ_GET_SOUL_INFO					= 11605;
	/** 操作 */
	public static final short	C_REQ_SOUL_PIECE_COMBO				= 11606;
	/** 增加经验值 */
	public static final short	C_REQ_SOUL_ADD_EXP					= 11607;
	/**
	 * 材料制作
	 */
	public static final short	C_REQ_SOUL_MAKE						= 11608;
	/**
	 * 融合
	 */
	public static final short	C_REQ_SOUL_FUSE						= 11609;

	// ==========================>排行榜<======================================
	/**
	 * 请求自己在排行榜的数据以及上榜人数
	 */
	public static final short	C_REQ_RANK_GET_TOTAL				= 11610;
	/**
	 * 分页请求上榜数据
	 */
	public static final short	C_REQ_RANK_GET_INDEX				= 11611;
	/**
	 * 请求个人数据
	 */
	public static final short	C_REQ_RANK_MYRANK					= 11612;

	/**
	 * 请求抽卡信息
	 */
	public static final short	C_REQ_SOUL_GET_LUCK_INFO			= 11615;

	/**
	 * 抽卡
	 */
	public static final short	C_REQ_SOUL_DRAW_CARD				= 11616;
	/**
	 * 许愿
	 */
	public static final short	C_VOW_REQUEST						= 11617;

	// ==========================>兑换<=====================================

	// public static final short C_REQ_EXCHANGE = 11617;

	// ==========================>活跃系统<=====================================

	public static final short	C_REQ_ACTIVE_REWARD					= 11618;
	/**
	 * 创建副本
	 */
	public static final short	C_REQ_CREATE_FB						= 11619;

	/**
	 * 境界操作请求
	 */
	public static final short	C_STATE_REQ							= 11620;

	/**
	 * 属性丹系统
	 */
	public static final short	C_DAN_REQ							= 11621;

	/**
	 * 被动技能消息请求
	 */
	public static final short	C_PASSIVE_REQ						= 11622;

	// 玩家修改头像
	public static final short	C_CHANGE_HEAD_PORTRAIT				= 11630;

	// 聊天特效操作
	public static final short	C_CHAT_SPECIAL						= 11631;

	// ==========================>城战修改<=====================================
	// 城战排名奖励
	public static final short	C_CITY_WAR_RANK_REWARD				= 11635;

	// 请求城战城主门派礼包信息
	public static final short	C_CITY_WAR_JOB_REWARD_OPTION		= 12186;

	// =====================冥府鬼节奖励领取=======================
	public static final short	C_MFGJ_CAMPAIGN_REWARD_REQ			= 11636;

	// ==========================>活跃度<=====================================
	/**
	 * 仙官系统操作
	 */
	public static final short	C_ACTIVE_STYLITE_OPTION				= 11000;

	/** 请求挑战副本界面信息 */
	public static final short	C_GET_CHALLENGE_CAMPAIGN_INFO		= 12000;
	/** 请求vip副本界面信息 */
	public static final short	C_GET_VIP_CAMPAIGN_INFO				= 12001;

	/** 请求挑战副本排行榜数据 */
	public static final short	C_GET_CHALLENGE_CAMPAIGN_RANK		= 12002;
	/** 玩家副本日志 */
	public static final short	C_CAMPAIGN_LOG_INFO					= 12003;
	/** 玩家经验/灵石副本击杀怪物数量日志 */
	public static final short	C_CAMPAIGN_KILL_MOUNT_INFO			= 12004;

	// 结婚系统
	/** 求婚 */
	public static final short	C_PROPOSE							= 12100;
	/** 同意求婚 */
	public static final short	C_AGREE_TO_PROPOSE					= 12101;
	/** 宣誓 */
	public static final short	C_JURATION							= 12102;
	/** 离婚 */
	public static final short	C_DIVORCE_BY_AGREEMENT				= 12103;
	/** 同意/ 拒绝 离婚 */
	public static final short	C_DIVORCE_ANSWER					= 12104;
	/** 赠送仙玉 */
	public static final short	C_GIVE_XIANYU						= 12105;
	/** 取出小金库 */
	public static final short	C_TAKE_THE_XIANYU					= 12106;
	/** 强化戒指 */
	public static final short	C_STRENGTHEN_RING					= 12107;
	/** 更换戒指 */
	public static final short	C_REPLACE_RING						= 12108;
	/** 使用夫妻技能 */
	public static final short	C_USE_SPOUSE_SKILL					= 12109;
	/** 夫妻互动 */
	public static final short	C_SPOUSE_INTERACTION				= 12110;
	/** 请求结婚数据 */
	public static final short	C_REQUEST_MARRIAGE_DATA				= 12111;
	/** 精炼戒指 */
	public static final short	C_REFINE_RING						= 12112;
	/** 结婚副本操作协议 */
	public static final short	C_MARRIAGE_CAMPAIGN_OP				= 12113;
	/** 场景服通知中心服加物品 */
	public static final short	C_ADD_ITEM							= 12114;
	/** 同步结婚场地状态 */
	public static final short	C_SYNCHRONIZE_MARRIAGE_FIELD_STATE	= 12115;
	// ------------------------结婚完--------------

	/** 排行榜获取其他人物外观信息 */
	public static final short	C_RANK_GET_OTHER_INFO				= 12130;
	/** 排行榜膜拜 */
	public static final short	C_RANK_LIKE							= 12131;

	// 仇人
	/** 请求仇人击杀信息 */
	public static final short	C_ENEMY_KILL_INFO					= 12132;
	/** 添加仇人 */
	public static final short	C_ADD_ENEMY							= 12133;
	/** 删除仇人 */
	public static final short	C_DELETE_ENEMY						= 12134;
	/** 清空仇人 */
	public static final short	C_DELETE_ALL_ENEMY					= 12135;
	/** 重新请求仇人列表（开界面的时候请求） */
	public static final short	C_GET_ALL_ENEMY_INFO				= 12136;

	// 装备引灵
	/** 引灵图操作 */
	public static final short	C_EQUIP_YINLING_OPERATE				= 12137;
	/** 设置是否使用非绑定引灵道具 */
	public static final short	C_CHANGE_EQUIP_YINLING_AUTO_USE		= 12139;
	/** 引灵图升级 */
	public static final short	C_EQUIP_YINLING_UPGRADE				= 12140;
	// 献宝
	/** 献宝 */
	public static final short	C_XIANBAO							= 12141;
	/** 夫妻副本结算奖励 */
	public static final short	C_COUPLE_CAMPAIGN_OVER				= 12142;
	// 道具转盘
	/** 道具转盘开始 */
	public static final short	C_ITEM_TURNTABLE_START				= 12143;
	/** 道具转盘结算 */
	public static final short	C_ITEM_TURNTABLE_OVER				= 12144;
	/** 系统设置 */
	public static final short	C_SYSTEM_SET						= 12145;
	/** 参加结婚副本 */
	public static final short	C_MARRIAGE_ENTER_CAMPAIGN			= 12148;
	/** 请求有缘人列表 */
	public static final short	C_PEOPLE_WITH_FATE_LIST				= 12149;

	/** 送花 */
	public static final short	C_GIVE_FLOWER						= 12150;
	/** 请求世界首领挖宝信息 */
	public static final short	C_BOSS_WABAO_INFO					= 12151;
	/** 挖宝操作协议号 */
	public static final short	C_BOSS_WABAO						= 12152;
	/** 周常活动操作 */
	public static final short	C_WEEK_MASTER_OPTION				= 12153;
	/** 领取飞镖相关操作 */
	public static final short	C_FEIBIAO_OP						= 12154;

	/** 妖灵大战结算奖励 */
	public static final short	C_PVP_DUOQI_END_AWARD				= 12157;
	/** 周环任务答题 */
	public static final short	C_TASK_ANSWER_QUESTION				= 12158;
	/** 周环任务相关操作 */
	public static final short	C_TASK_WEEK_OP						= 12159;
	/** 新年活动相关操作 */
	public static final short	C_PROMOTION_NEW_YEAR_OP				= 12160;
	/** 领取节日礼物 */
	public static final short	C_FESTIVAL_RECEIVE_GIFT				= 12161;
	/** 领取天降红包 */
	public static final short	C_GET_FESTIVAL_REDPACKET			= 12162;
	/** 段位发奖 */
	public static final short	C_QUALIFYING_AWARD					= 12163;
	/** 装备洗练操作 */
	public static final short	C_EQUIP_PURIFY_OPTION				= 12165;
	/** 装备洗练手气值操作 */
	public static final short	C_EQUIP_PURIFY_LUCK_OPTION			= 12166;
	/** 提供给场景服务器的的发邮件接口 */
	public static final short	C_SEND_EMAIL_FOR_SCENE				= 12167;
	/** 提供给跨服的杀死其他服务器的玩家的接口 */
	public static final short	C_PLAYER_KILL_OTHER_PLAYER			= 12168;
	/** 赛季运镖客户端主动帮助协议 */
	public static final short	C_SEASON_TRUCK_HELP					= 12169;
	/** 跨服上玩家离线时要发的邮件记录 */
	public static final short	C_EMAIL_CROSS_OFFLINE				= 12170;

	/** 跨服赛季初始化 */
	public static final short	C_CROSS_MATCH_INIT					= 12171;
	/** 跨服赛季更新 */
	public static final short	C_CROSS_MATCH_UPDATE				= 12172;

	/** 购买开启神魔宝箱钥匙 */
	public static final short	C_GOD_DEMON_BUY_KEY					= 12173;

	// =========================>跨服心魔<=====================================
	/** 跨服请求心魔的数据 */
	public static final short	C_REQ_CROSS_DEMO_ROBOT_DATA			= 12180;

	/** 同步获得的金鸡副本灵石数量 */
	public static final short	C_CROSS_UPDATE_JINJI_MONEY			= 12181;

	// =========================>跨服金玉满堂<===================================
	/** 跨服请求心魔+金玉满堂的奖励 */
	public static final short	C_REQ_CROSS_ACTIVITY_REWARD			= 12185;

	/** 秘籍操作 */
	public static final short	C_ESOTERICA_OP						= 12200;
	/** 宝石便捷合成操作 */
	public static final short	C_SIMPLE_JEWEL_COMPOSE				= 12201;
	/** 城战中召唤 */
	public static final short	C_CITYALL_CALL						= 12202;
	/** 货币转换 */
	public static final short	C_CURRENCY_EXCHANGE					= 12203;
	/** 时装强化 */
	public static short			C_FASHION_STRENGTHEN				= 12204;
	/** 神纹操作 */
	public static final short	C_RUNE_OPTION						= 12205;

	// 孩子系统
	/** 求子 */
	public static final short	C_PRAY_CHILD						= 12206;
	/** 扩充槽位 */
	public static final short	C_EXPANSION_SLOT					= 12207;
	/** 孩子操作 */
	public static final short	C_CHILD_OPTION						= 12208;
	/** 孩子改名 */
	public static final short	C_CHILD_RENAME						= 12209;

	/** 抽奖操作 */
	public static final short	C_LUCKY_DRAW_OPTION					= 12210;

	/** 孩子联姻成功 */
	public static final short	C_CHILD_MARRIAGE_SUCCESS			= 12211;

	/** 守护操作 */
	public static final short	C_GUARD_OPTION						= 12212;

	/** 段位商店购买成功 */
	public static final short	C_SHOP_DUANWEI						= 12213;
	// =========================>法宝<===================================
	/** 法宝操作 */
	public static short			C_MAGICWP_OPTION					= 12214;
	/** 装备套装操作 */
	public static short			C_EQUIP_SUIT_OPTION					= 12215;
	/** 门派任务操作 */
	public static short			C_GUILD_TASK_OPTION					= 12216;
	/** 分包下载奖励操作 */
	public static short			C_DOWNLAND_PACK_OPTION				= 12217;
	/** 请求使用回复类药水 */
	public static final short	C_USE_RECOVERY_ITEM					= 12218;
	/** 使用小飞鞋 */
	public static final short	C_USE_BLINK_PROP					= 12219;
	/** 临时vip1过期 */
	public static final short	C_VIP1_OVERDUE						= 12220;
	/** 请求自己的种花排行 */
	public static final short	C_PLANT_FLOWER_RANK					= 12221;
	/** 请求加亲密度 */
	public static final short	C_ADD_INTIMACY						= 12222;
	/** 限时boss排行奖励发放 */
	public static final short	C_PROMOTION_BOSS_RANK				= 12223;
	/** 续费操作 */
	public static final short	C_RENEWALS_LIST_REQ					= 12224;
	/** 领取vip储蓄经验 */
	public static final short	C_RECEIVE_VIP_SAVE_EXP				= 12225;
	/** 打坐 */
	public static final short	C_DA_ZUO_OPTION						= 12226;
	/** 领取经验瓶储蓄经验 */
	public static final short	C_EXP_BOTTLE_USE					= 12227;
	/** 获取离线挂机信息 */
	public static final short	C_GET_OFF_LINE_INFO					= 12228;

	/** 使用玩具 */
	public static final short	C_USE_TOY							= 12229;
	/** 场景服创建玩具成功 */
	public static final short	C_SCENE_TOY_STATE					= 12230;
	/** 玩具操作 */
	public static final short	C_TOY_OPTION						= 12231;
	/** 请求活动信息 */
	public static final short	C_REQ_ACTIVITY_INFO					= 12232;
	/** 活动进入成功信息返回,内部协议 */
	public static final short	C_ENTER_ACTIVITY					= 12233;
	/** 请求活动排名信息 */
	public static final short	C_REQ_ACTIVITY_RANK_INFO			= 12234;
	/** 同步获得的金鸡副本灵石数量 */
	public static final short	C_UPDATE_JINJI_MONEY				= 12235;
	/** 金鸡副本结束 */
	public static final short	C_JINJI_END							= 12236;
	/** 心魔副本结束 */
	public static final short	C_CHALLENGE_DEMON_END				= 12237;
	/** 更新公告操作 */
	public static final short	C_REQ_ANNOUNCEMENT					= 12238;
	/** 接收全服世界等级 */
	public static final short	C_ALL_WORLD_LEV						= 12239;
	/** 装备属性继承 */
	public static short			C_EQUIP_ATTR_INHERIT				= 12240;
	/** 记录玩家行为日志 */
	public static short			C_PLAYER_BEHAVIOR_LOG				= 12241;
	/** 祭坛状态日志 */
	public static short			C_LOG_GUILD_ALTAR					= 12242;
	/** 抽奖操作 */
	public static final short	C_DRAW_SHOP_OPTION					= 12243;
	/** 神装合成 */
	public static short			C_ITEM_GOD_COMPOSE_REQ				= 12244;
	/** 用户配置方案操作 */
	public static short			C_SWITCH_CONFIG_OPTION				= 12245;
	/** 同步玩家个人赛季分组信息 */
	public static short			C_SYNC_QUALITY_GROUP				= 12246;
	/** 求助&帮助欧气&欧气相关 */
	public static final short	C_LUCKYHELP							= 12247;
	/** BOSS活动操作 */
	public static final short	C_OPERATE_BOSS_OPTION				= 12248;
	/** BOSS活动服务器内部消息 */
	public static final short	C_OPERATE_BOSS_INNER				= 12249;
	/** 神秘折扣商店操作 */
	public static final short	C_MYSTERIOUS_DISCOUNT_SHOP_OPTION	= 12250;
	/** 同步心魔副本获得经验 */
	public static final short	C_UPDATE_DEMO_EXP					= 12251;
	/** 斗战洪荒组队房间 */
	public static final short	C_OPERATE_BOSS_ROOM_OPTION			= 12253;
	/** 获取跨服房间列表（组队样式） */
	public static final short	C_REQ_TEAM_ROOM_LIST				= 12254;

	/** 跨服向本服发送达人活动排名奖励 */
	public static final short	C_CROSS_WEEK_MASTER_RANK_INNER		= 12255;
	/** 门派投资操作 */
	public static final short	C_GUILD_INVEST_OPTION				= 12256;
	/** 装备合成 */
	public static short			C_EQUIP_COMPOSE_REQ					= 12257;
	/** 婚宴添加经验 */
	public static final short	C_MARR_ADD_EXP						= 12258;

	/** 神兽操作 */
	public static final short	C_GOD_BEAST_OPTION					= 12259;

	/** 神器操作 */
	public static final short	C_SHENQI_OPTION						= 12260;

	/** 外观商店操作 */
	public static final short	C_FASHION_SHOP_OPTION				= 12270;

	/** 活动提前结束 */
	public static final short	C_ACTIVITY_COMPLATE_END				= 12280;

	/** 通行证操作 */
	public static final short	C_TRAFFIC_PERMIT_CMD				= 12300;
	/** 门派砍价 */
	public static final short	C_GUILD_BARGAIN						= 12301;
	/** 风暴投资 */
	public static final short	C_STORM_GROWTH_FUND					= 12302;
	/** 新福利请求 */
	public static final short	C_WELF_NEW_REQ						= 12303;

	/** 新宠物系统操作 */
	public static final short	C_NEW_PET_OPTION					= 12304;
	/** 圣灵、神兵、法阵系统操作 */
	public static final short	C_APPEARANCE_OPTION					= 12305;
	/** 限时礼包操作 */
	public static final short	C_TRIGGER_DISCOUNT_OPTION			= 12306;

	/** 请求打开掉落物箱子 */
	public static final short	C_DROP_PICK_UP_BOX					= 12307;

	/** 装备新套装请求 */
	public static short			C_EQUIP_NEW_SUIT_REQ				= 12308;

	/** 分身觉醒功能操作 */
	public static final short	C_AVATAR_AWAKE_OPTION				= 12310;

	/** 军衔系统操作 */
	public static final short	C_BATTLE_GROUND_OPTION				= 12320;

	/** 战场等级内部协议 */
	public static final short	C_CROSS_GROUP_INNER					= 12321;
	/** 战场等级操作 */
	public static final short	C_CROSS_GROUP_OPTION				= 12322;
	/** 魔魂系统操作 */
	public static final short	C_DEMON_SOUL_OPTION					= 12323;

	/** 战场拍卖扣款及回款 */
	public static final short	C_CENTER_AUCTION_INNER				= 12324;

	/** 装备洗练操作 */
	public static final short	C_EQUIP_REMAKE_OPTION				= 12325;
	/** 黑名单操作 */
	public static final short	C_BLACK_LIST_OPTION					= 12326;
	/** 卡牌系统请求 */
	public static final short	C_CARD_OPTION_REQ					= 12327;
	/** VIP任务请求 */
	public static final short	C_VIP_TASK_REQ						= 12328;
	/** 1元礼包请求 */
	public static final short	C_SMALL_PAY_REQ						= 12329;

	/** 跨服通知本服撤回消息 */
	public static final short	C_CHAT_CROSS_DELETE					= 12330;

	/** rmb投资操作 */
	public static final short	C_RMB_INVESTMENT_REQ				= 12331;

	/** 总等级达成属性突破 */
	public static final short	C_ACTIVATION_TRAIN_LEVEL			= 12332;
	/** 古阵核心操作 */
	public static final short	C_OLD_ARRAY_CMD						= 12333;
	/** 古阵阵盘操作 */
	public static final short	C_OLD_MEMBER_CMD					= 12334;

	/** 道印操作 */
	public static final short	C_DAOYIN_REQ						= 12335;

	/** 神魂珠操作 */
	public static final short	C_GOD_SOUL_REQ						= 12336;

	/* ====================时装PK系统================================ */
	/** 时装PK---参数或者更新时装 */
	public static final short	C_FASHION_PK_JORUPDATE				= 12341;
	/** 时装PK---通用请求操作 */
	public static final short	C_FASHION_PK_COPTION				= 12342;

}
