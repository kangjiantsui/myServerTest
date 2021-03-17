package cn.kang.protocol;

/**
 * 发往客户端协议号，范围 0 - 10000
 * 
 * 500---600 1000-1200: 由范加伟使用 100---300：由郭小帆使用 601 - 700(zhb) 700---900 由hw使用
 */
public interface ClientProtocol {

	public static final short	U_G_LOGIN_OTHER							= 1;	// 账号在其他地方登录
	public static final short	U_G_LOGIN_GATEWAY						= 2;	// 用户登录网关
	public static final short	U_G_LOGIN_RESULT						= 3;	// 用户登录结果
	public static final short	U_G_PLAYER_LIST							= 4;	// 获取角色列表
	public static final short	U_G_PLAYERINFO							= 5;	// 发送角色信息
	public static final short	U_G_BATTLEPLAYERINFO					= 6;	// 发送地图中其他玩家的信息
	public static final short	U_G_DATA_LOAD_STATU						= 7;	// 通知客户端数据加载请求信息
	public static final short	U_G_PLAYER_CREATE_RESULT				= 8;	// 通知客户端创建角色结果
	public static final short	U_G_PING_PACKET							= 9;	// 返回ping包
	public static final short	U_TIME_INFO								= 10;	// 用户重置信息包
	public static final short	U_SWITCH_INFO							= 11;	// 用户开关配置信息
	// ===================================================================

	// ===========================>battle<==============================
	public static final short	U_G_ATTACK_SKILL						= 20;	// 通知附件人，玩家施放技能
	public static final short	U_G_DAMAGE								= 21;	// 同步伤害给附近人
	public static final short	U_G_BUFFER_OPTION						= 22;	// buffer操作
	public static final short	U_LIVING_STATE_CHANGE					= 23;	// 生命体状态变更
	public static final short	U_SNARE_CREATE_RESULT					= 24;	// 陷阱创建结果
	public static final short	U_SNARE_TARGETS_INFO					= 25;	// 陷阱人数变化
	// ===========================>battle<==============================
	// ===========================>msgBegin<===========================
	public static final short	U_ALERT_MSG								= 26;	// 弹出消息
	// ===========================>msgEnd<==============================
	// ===========================>battle<==============================
	public static final short	U_MAGICWP_BAN_EXE						= 27;	// 法宝禁制是否执行
	// ===========================>battle<==============================
	// ===========================>sync<==============================
	public static final short	U_MONSTER_SYNC_POS						= 28;	// living同步自己位置
	// ===========================>sync<==============================
	// ===========================>battle<==============================
	public static final short	U_PLAYER_BE_KILL						= 29;	// 玩家被击杀信息
	public static final short	U_MONSTER_SKILL_CD						= 30;	// 怪物技能CD信息
	public static final short	U_CHANGED_CD							= 31;	// 修改玩家技能CD
	public static final short	U_EXP_CHANGED							= 32;	// 玩家经验更新
	// ===========================>battle<==============================
	// ===========================>system<====================================

	public static final short	U_CHANGE_HEAD_PORTRAIT					= 98;	// 玩家修改头像
	public static final short	U_SERVER_INFO							= 99;	// 服务器信息
	// ===========================>system<====================================
	// =========================>坐骑<===================================
	/** 返回坐骑信息 */
	public static final short	U_MOUNT_GETINFO							= 101;
	/** 坐骑总属性有变更同步 */
	public static final short	U_MOUNT_ATT_UPDATE						= 102;
	/** 坐骑升级 */
	public static final short	U_MOUNT_LEVEL_UP						= 103;
	/** 清除坐骑升级CD */
	public static final short	U_MOUNT_LEVELUPCD_CLEAR					= 104;
	/** 坐骑升阶 */
	public static final short	U_MOUNT_GRADE_UP						= 105;
	/** 坐骑装备升级 */
	public static final short	U_MOUNT_EQUIP_UP						= 106;
	/** 使用坐骑属性丹 */
	public static final short	U_MOUNT_DAN_USE							= 107;
	/** 选择当前使用的坐骑出战 */
	public static final short	U_MOUNT_FIGHT_CHOOSE					= 108;
	/** 坐骑神兵升阶 */
	public static final short	U_MOUNT_WEAPON_UP						= 109;
	/** 已获得的特殊坐骑 */
	public static final short	U_MOUNT_SPECIAL_GET						= 110;
	/** 返回法宝信息列表 */
	public static final short	U_MAGICWP_INFO_LIST						= 111;
	/** 返回特殊坐骑信息 */
	public static final short	U_MOUNT_STAR							= 112;
	/** 返回特殊坐骑信息 */
	public static final short	U_MOUNT_LIST_STAR						= 113;

	/** 使用属性丹 */
	public static final short	U_MAGICWP_DAN_USE						= 117;

	/** 返回宠物信息 */
	public static final short	U_PET_GETINFO							= 127;
	/** 宠物激活 */
	public static final short	U_PET_ACTIVATE							= 128;
	/** 宠物出战 */
	public static final short	U_PET_FIGHT								= 129;
	/** 宠物提升资质 */
	public static final short	U_PET_TALENT_UP							= 130;
	/** 宠物升级 */
	public static final short	U_PET_LEVEL_UP							= 131;
	/** 宠物炼体 */
	public static final short	U_PET_PHYSIQUE_UP						= 132;
	/** 宠物品质提升 */
	public static final short	U_PET_QUALITY_UP						= 133;
	/** 宠物升阶 */
	public static final short	U_PET_GRADE_UP							= 134;
	/** 返回宠物总属性 */
	public static final short	U_PET_GETTOTALATT						= 135;
	/** 宠物炼魂 */
	public static final short	U_PET_SOUL_UP							= 136;
	/** 宠物技能激活 */
	public static final short	U_PET_SKILL_ACTIVATE					= 137;
	/** 宠物技能解封 */
	public static final short	U_PET_SKILL_OPEN						= 138;
	/** 宠物技能升级 */
	public static final short	U_PET_SKILL_UP							= 139;
	/** 宠物技能装备 */
	public static final short	U_PET_SKILL_EQUIP						= 140;
	/** 宠物技能更新 */
	public static final short	U_PET_SKILL_UPDATE						= 141;
	/** 宠物技能装备格解锁 */
	public static final short	U_PET_SKILL_SLOT_UNLOCK					= 142;

	// =========================>背包物品<===================================
	/** 物品外观信息列表 */
	public static final short	U_ITEM_FACE_LIST						= 143;

	/** 单个物品详细信息 */
	public static final short	U_ITEM_FULL_INFO						= 144;

	// ========================><=========================================

	/** 踩点触发的点状态更新 */
	public static final short	U_TOUCH_POINT_UPDATE					= 145;

	/** 掉落物品 */
	public static final short	U_DROP_ITEM_PACKAGE						= 146;

	/** 删除掉落物品 */
	public static final short	U_DROP_ITEM_REMOVE						= 147;

	/** 同步坐骑状态 */
	public static final short	U_PLAYER_MOUNT_STATE_RESP				= 148;

	/** 接收聊天消息 */
	public static final short	U_CHAT_RECEIVE							= 149;
	/** 发送给客户端聊天记录 */
	public static final short	U_CHAT_HISTORY_RESP						= 150;

	/** 背包格子解锁 */
	public static final short	U_BAG_GRID_UNLOCK						= 151;

	// ========================>装备<============================
	/** 装备栏位信息 */
	public static final short	U_EQUIPBAR_INFO							= 152;

	/** 装备信息 */
	public static final short	U_EQUIP_INFO							= 153;

	/** 一键分解返回 */
	public static final short	U_RESOLVE_RESULT						= 154;
	// ==========================================================

	/** 系统消息提示 */
	public static final short	U_SYSTEM_PROMPT							= 155;

	/** 神器数据 */
	public static final short	U_ARTIFACT_DATA							= 156;

	/** 神器请求返回 */
	public static final short	U_ARTIFACT_RESP							= 157;

	/** 帮派信息 */
	public static final short	U_GUILD_INFO							= 158;

	/** 帮派成员列表 */
	public static final short	U_GUILD_MEMBER_LIST						= 159;

	/** 创建帮派 */
	public static final short	U_GUILD_CREATE							= 160;

	/** 全服帮派列表 */
	public static final short	U_GUILD_LIST							= 161;

	/** 帮派操作返回 */
	public static final short	U_GUILD_ACTION_RESP						= 162;

	/** 成员信息 */
	public static final short	U_GUILD_MEMBER_INFO						= 163;

	/** 有玩家申请入帮 */
	public static final short	U_GUILD_APPLY_INFO						= 164;

	/** 申请列表 */
	public static final short	U_GUILD_APPLY_LIST						= 165;

	/** 批量玩家加入 */
	public static final short	U_GUILD_BAT_JOIN						= 166;

	/** 更新技能信息 */
	public static final short	U_GUILD_SKILL_UPDATE					= 167;

	/** 初始化全部帮派技能信息 */
	public static final short	U_GUILD_SKILL_ALL						= 168;

	/** 帮派仓库信息回复 */
	public static final short	U_GUILD_WAREHOUSE_RESP					= 169;

	/** 帮派信息列表 */
	public static final short	U_GUILD_LOG_LIST						= 170;

	/** 玩家帮派信息同步更新 */
	public static final short	U_PLAYER_GUILD_NOTIFY					= 171;

	/**
	 * 野外BOSS信息列表
	 */
	public static final short	U_BOSS_LIST								= 172;

	/**
	 * 世界BOSS夺宝中玩家箱子数量
	 */
	public static final short	U_TREASURE_COUNT						= 173;

	/**
	 * 帮派快照信息
	 */
	public static final short	U_GUILD_SNAP							= 174;

	/**
	 * 掩码
	 */
	public static final short	U_MASK_CODE								= 175;

	/**
	 * 玩家指引标记
	 */
	public static final short	U_GUIDE_MARK							= 176;

	/**
	 * 经验副本进度消息
	 */
	public static final short	U_CAMPAIGN_EXTEND_INFO					= 177;

	/**
	 * 物品模板信息
	 */
	public static final short	U_ITEM_TEMP								= 178;

	/**
	 * 玩家剧情指引
	 */
	public static final short	U_PLOT_MARK								= 179;

	/**
	 * BOSS死亡记录
	 */
	public static final short	U_BOSS_LOG_LIST							= 180;

	/**
	 * 门派领地信息列表
	 */
	public static final short	U_GUILDLAND_LIST						= 181;

	/**
	 * 优惠信息列表
	 */
	public static final short	U_DISCOUNT_LIST							= 182;

	/**
	 * 挑战心魔伤害排行
	 */
	public static final short	U_CHALLENGE_DEMON_RANK					= 183;

	/**
	 * 物品合成结果返回
	 */
	public static final short	U_ITEM_COMPOSE_RESP						= 184;

	/**
	 * BOSS关注信息
	 */
	public static final short	U_BOSS_ATTENTION						= 185;

	/**
	 * 请求找回信息列表返回
	 */
	public static final short	U_RETRIEVE_LIST_RESP					= 186;

	/** 找回信息更新 */
	public static final short	U_RETRIEVE_INFO_UPDATE					= 187;

	/** 渡劫帮助请求返回 */
	public static final short	U_STATE_CAMPAIGN_HELP_RESP				= 188;

	/** 渡劫可邀请的玩家列表 */
	public static final short	U_STATE_CANINVITE_PLAYERS				= 189;

	/** 返回渡劫者当前协助人数 */
	public static final short	U_STATE_HELPER_COUNT					= 190;

	/** 装备栏宝石操作返回 */
	public static final short	U_EQUIP_BAR_STONE_RESP					= 191;

	/** 改名请求返回 */
	public static final short	U_RENAME_RESP							= 192;
	/** 玩家名字修改 */
	public static final short	U_PLAYER_NAME_UPDATE					= 193;

	/**
	 * 交易系统操作返回
	 */
	public static final short	U_TRADE_RESP							= 194;

	/**
	 * 交易商品列表查询返回
	 */
	public static final short	U_TRADE_GOODS							= 195;

	/**
	 * 请求物品指导价格返回
	 */
	public static final short	U_TRADE_GUIDE_PRICE						= 196;

	/**
	 * 商品信息更新
	 */
	public static final short	U_TRADE_GOODS_UPDATE					= 197;

	/**
	 * 交易日志列表返回
	 */
	public static final short	U_TRADE_LOG_LIST						= 198;

	/**
	 * 离线经验消息返回
	 */
	public static final short	U_OFFLINE_EXP							= 199;

	/**
	 * 库存请求返回
	 */
	public static final short	U_TRADE_STOCK_RESP						= 200;

	/** 获取时装信息 */
	public static short			U_FASHION_GET							= 201;
	/** 时装穿上 */
	public static short			U_FASHION_EQUIP							= 202;
	/** 时装脱下 */
	public static short			U_FASHION_UNEQUIP						= 203;
	/** 时装进阶 */
	public static short			U_FASHION_GRADE_UP						= 204;
	/** 时装激活 */
	public static short			U_FASHION_ACTIVATE						= 205;
	/** 时装更新 */
	public static short			U_FASHION_UPDATE						= 206;
	// =========================>army<===================================
	/** 人物属性包 */
	public static final short	U_ARMY_HERO_INFO						= 207;

	/** 城战所有祭坛信息 */
	public static final short	U_CITY_WAR_ALTAR_ALL					= 208;

	/** 城战排行榜 */
	public static final short	U_CITY_WAR_RANK							= 209;

	/** 城主变更 */
	public static final short	U_CITY_WAR_LORD_CHANGE					= 210;

	/** 玩家积分变更 */
	public static final short	U_CITY_WAR_SCORE						= 211;

	/** 活动外真实城主信息返回 */
	public static final short	U_CITY_REAL_LORD_RESP					= 212;

	/** 城主禁言返回 */
	public static final short	U_CHAT_GAG								= 213;

	/** 城战活动城主技能施放返回 */
	public static final short	U_CITY_WAR_SKILL						= 214;

	/** 城战叛徒信息 */
	public static final short	U_CITY_WAR_TRAITOR						= 215;

	/** 分享活动完成情况记录 */
	public static final short	U_SHARE_RECORD							= 216;

	/** 分享活动完成情况所有记录 */
	public static final short	U_SHARE_RECORD_LIST						= 217;

	/** 跨服赛季排行榜返回 */
	public static final short	U_CROSS_MATCH_RANK_RESP					= 218;

	/** 当前赛季信息 */
	public static final short	U_CROSS_MATCH_SEASON_INFO				= 219;

	/** 跨服赛季活动中增加积分 */
	public static final short	U_MATCH_SCORE_ADD						= 220;

	/** 挑战副本请求返回 */
	public static final short	U_CHALLENGE_CAMPAIGN_RESP				= 221;

	/** 门派休闲游戏请求返回 */
	public static final short	U_GUILD_CASUAL_ACTIVITY_RESP			= 222;

	/** 跨服赛季日志返回 */
	public static final short	U_CROSS_MATCH_LOG_RESP					= 223;

	/** 双人坐骑操作返回 */
	public static final short	U_DOUBLE_MOUNT_RESP						= 224;

	/** 分身技能更新 */
	public static final short	U_AVATAR_SKILL_UPDATE					= 225;

	/** 分身自动升级信息 */
	public static final short	U_STATE_AUTOUP_INFO						= 226;

	/** 门派装备仓库操作返回 */
	public static final short	U_GUILD_EQUIP_RESP						= 228;

	/** 门派装备仓库所有物品信息 */
	public static final short	U_GUILD_EQUIP_ALL						= 229;

	/** 门派装备仓库操作日志 */
	public static final short	U_GUILD_EQUIP_LOG						= 230;

	/** 爬塔战场当前层内BOSS信息 */
	public static final short	U_TOWER_FIGHT_BOSS_INFO					= 231;

	/** 爬塔战场顶层信息 */
	public static final short	U_TOWER_FIGHT_TOP_INFO					= 232;

	/** 自己击杀boss信息 */
	public static final short	U_TOWER_FIGHT_BOSS_KILL					= 233;

	/** 爬塔战场结算奖励 */
	public static final short	U_TOWER_FIGHT_OVER_REWARD				= 234;

	/** boss系统请求返回 */
	public static final short	U_BOSS_RESP								= 235;

	/** BOSS伤害统计 */
	public static final short	U_BOSS_DAMAGE							= 236;

	/** BOSS领奖信息 */
	public static final short	U_BOSS_REWARD_LIST						= 237;

	/** 属性丹请求回复 */
	public static final short	U_DAN_RESP								= 238;
	/** 属性丹使用情况列表 */
	public static final short	U_DAN_LIST								= 239;

	// ========================>野外掉落统计<====================================
	/** 野外掉落统计_总量 */
	public static final short	U_FIELD_DROP_RECORD_ALL					= 240;
	/** 野外掉落_增量 */
	public static final short	U_FIELD_DROP_RECORD_SINGLE				= 241;

	/** 被动技能操作返回 */
	public static final short	U_PASSIVE_RESP							= 242;

	/** 被动技能信息返回 */
	public static final short	U_PASSIVE_LIST							= 243;
	// ========================>运营活动END<====================================
	/** 玩家奖励状态返回 **/
	public static final short	U_AWARD_STATE							= 244;

	/** 玩家可兑换灵石数量返回 **/
	public static final short	U_EXCHANGE_COUNT						= 245;

	/** 装备附魔 */
	public static final short	U_EQUIP_ATTACH							= 246;

	/** 爬塔战场奖励信息 */
	public static final short	U_TOWER_FIGHT							= 247;

	/** 仙灵秘境 */
	public static final short	U_SECRET_RESP							= 248;

	/** 世界BOSS掉落分配记录 */
	public static final short	U_BOSS_DROP_RECORD						= 249;

	// ========================>法宝END<====================================
	/** 返回法宝信息 */
	public static final short	U_MAGICWP_INFO							= 250;

	/** 交易系统求购功能请求返回 */
	public static final short	U_TRADE_PURCHASE_RESP					= 251;

	/** 求购列表 */
	public static final short	U_TRADE_PURCHASE_LIST					= 252;

	/** 请求同步是否结算预警技能伤害 */
	public static final short	U_MONSTER_WARING_RESP					= 253;

	/** 合并邀请列表 */
	public static final short	U_GUILD_MERGE_INVITE_LIST				= 254;

	/** 收到合并邀请 */
	public static final short	U_GUILD_MERGE_INVITE_INFO				= 255;

	/** 悬赏请求返回 */
	public static final short	U_OFFER_RESP							= 256;

	/** 跨服首领伤害排行 */
	public static final short	U_CROSS_BOSS_DAMAGE_RANK				= 257;

	/** 奖励信息 */
	public static final short	U_AWARD_STAT_LIST						= 258;

	/** BOSS飞升活动中伤害排行 */
	public static final short	U_BOSS_SOAR_DAMGE_RANK					= 259;

	// ===========================玩家护卫系统=====================================
	/** 如果玩家身份是护卫，推送玩家护卫信息 */
	public static final short	U_ESCORT_SOLDIER						= 260;
	/** 如果玩家身份是护法，推送玩家护法信息 */
	public static final short	U_ESCORT_GENERAL						= 261;
	/** 护卫某些操作协议响应 */
	public static final short	U_ESCORT_JOB_OPTION_RESP				= 262;
	/** 护卫某些操作协议响应 */
	public static final short	U_ESCORT_EQUIPMENT_OPTION_RESP			= 263;
	/** 护卫属性增量 */
	public static final short	U_ESCORT_EQUIPMENT_PROPERTY				= 264;

	public static final short	U_GUILD_ALLIANCE_APPLY_LIST				= 265;

	/** 联盟所有成员 */
	public static final short	U_GUILD_ALLIANCE_MEMBER_LIST			= 266;

	/** 门派联盟请求回复 */
	public static final short	U_GUILD_ALLIANCE_RESP					= 267;

	/** 门派列表同步 */
	public static final short	U_GUILD_ALLIANCE_LIST					= 268;
	/** 护卫星甲是否激活 */
	public static final short	U_ESCORT_PLAYER_REQ_STATU				= 269;

	/** 飞升之地BOSS血量请求 */
	public static final short	U_BOSS_SOAR_HP							= 270;

	/** 龙纹系统 */
	public static final short	U_DRAGON_RESP							= 271;

	/**
	 * 跨服挑战心魔伤害排行
	 */
	public static final short	U_CROSS_CHALLENGE_DEMON_RANK			= 272;

	/** 跨服金鸡副本获得灵石数量 */
	public static final short	U_CROSS_UPDATE_JINJI_MONEY				= 273;
	/** 跨服金鸡副副本内排名列表 */
	public static final short	U_CROSS_UPDATE_JINJI_MONEY_LIST			= 274;

	/** 队伍集结 */
	public static final short	U_TEAM_CALL								= 275;

	/** 需要限制掉落条件的盒子，返回需要掉落的物品 */
	public static final short	U_C_CHOOSE_ITEM_BOX_RSP					= 276;

	/** 玩家在线状态更新通知别的玩家 */
	public static final short	U_PLAYER_ONLINE_STATE					= 277;

	/** 门派返利活动，返回门派榜单信息 */
	public static final short	U_GUILD_REBATE_RANK_LIST				= 279;
	/** 门派返利活动，返回门派榜单信息 */
	public static final short	U_GUILD_REBATE_RANK_INFO				= 278;

	/** 玩家转发 */
	public static final short	U_PLAYER_FORWARD						= 280;

	/** 本服领地BOSS战门派成员排名 */
	public static final short	U_LAND_BOSS_MEMBER_RANK					= 281;

	/** 本服领地BOSS战领地信息 */
	public static final short	U_LAND_BOSS_INFO						= 282;

	/** 本服领地BOSS战击杀记录 */
	public static final short	U_LAND_BOSS_LOG							= 283;

	/** 本服领地BOSS战怪物状态 */
	public static final short	U_LAND_BOSS_STATU						= 284;

	/** 跨服领地战领地状态列表 */
	public static final short	U_CROSS_TERRITORY_STATE_LIST			= 285;

	/** 跨服领地战领地BOSS列表 */
	public static final short	U_CROSS_TERRITORY_BOSS_LIST				= 286;

	/** 跨服领地战当前分组信息 */
	public static final short	U_CROSS_TERRITORY_GROUP					= 287;

	/** 跨服领地战返回协议 */
	public static final short	U_CROSS_TERRITORY_RESP					= 288;

	/** 怪物伤害统计服务器前三伤害排行 */
	public static final short	U_DAMAGE_SERVER_RANK					= 289;

	/** 怪物伤害所有玩家伤害统计 */
	public static final short	U_DAMAGE_PLAYER_LIST					= 290;

	/** 个人周积分信息 */
	public static final short	U_CROSS_TERRITORY_WEEK_SCORE			= 291;

	/** 领地占领奖励领取情况 */
	public static final short	U_CROSS_TERRITORY_CAPURE_REWARD			= 292;

	/** 跨服领地战怪物日志 */
	public static final short	U_CROSS_TERRITORY_MONSTER_LOG			= 293;

	/** 跨服分组首领状态 */
	public static final short	U_CROSS_GROUP_BOSS_STATE_LIST			= 294;

	/** 跨服分组首领请求返回 */
	public static final short	U_CROSS_GROUP_BOSS_RESP					= 295;

	/** 跨服分组首领关注列表 */
	public static final short	U_CROSS_GROUP_BOSS_ATTENTION_LIST		= 296;

	/** 跨服分组首领击杀日志列表 */
	public static final short	U_CROSS_GROUP_BOSS_LOG_LIST				= 297;

	/** 跨服组队 */
	public static final short	U_CROSS_TEAM							= 298;

	// ==========================>玩家基础属性<======================================
	/**
	 * 玩家剥离万分比加成后的基础属性
	 */
	public static final short	U_PLAYER_BASE_PROPERTY					= 299;

	/** 获取同场景玩家列表 */
	public static final short	U_SAME_FIELD_PLAYER_LIST				= 300;

	/** 国战城池列表 */
	public static final short	U_CROSS_LAND_LIST						= 301;

	/** 国战服务器信息列表 */
	public static final short	U_CROSS_LAND_SERVER						= 302;

	/** 国战服务器玩家信息列表 */
	public static final short	U_CROSS_LAND_PLAYER						= 303;

	/** 国战领地战斗信息列表 */
	public static final short	U_CROSS_LAND_FIGHT_STATE				= 304;

	/** 国战请求返回 */
	public static final short	U_CROSS_LAND_RESP						= 305;

	/** 国战个人领奖信息 */
	public static final short	U_CROSS_LAND_REWARD						= 306;

	/** 跨服领地战怪物奖励领取情况 */
	public static final short	U_CROSS_TERRITORY_MONSTER_REWARD		= 307;

	/** 商城购物车请求返回 */
	public static final short	U_SHOP_CART_RESP						= 308;

	/** 跨服分组首领分身组合 */
	public static final short	U_CROSS_GROUP_BOSS_AVATAR				= 309;

	/** 跨服分组首领信息列表 */
	public static final short	U_CROSS_GROUP_BOSS_LIST					= 310;

	/** 跨服领地战非争夺玩法首领列表 */
	public static final short	U_CROSS_TERRITORY_PEACE_BOSS_LIST		= 311;

	/** 跨服领地战非争夺玩法领地状态列表 */
	public static final short	U_CROSS_TERRITORY_PEACE_STATE			= 312;

	/** 新通行证系统返回 */
	public static final short	U_PASSPORT_RESP							= 313;

	// ========================>运营活动END<====================================
	/** 错误码 */
	public static final short	U_RESP_ERROR							= 500;
	// ===========================>邮件<==============================
	/** 获取邮件数量 */
	public static final short	U_RESP_GETEMAILS_NUM					= 502;
	/** 获取指定邮件详细信息 */
	public static final short	U_RESP_GETEMAILINFOBYINDEX				= 503;
	/** 设置邮件已读 */
	public static final short	U_RESP_SETEMAILREADER					= 504;
	/** 邮件更新 */
	public static final short	U_RESP_OPERATIONEMAIL					= 505;
	/** 提取附件 */
	public static final short	U_RESP_GETEMAILATTACKMENT				= 506;
	/** 一键提取所有邮件附件 */
	public static final short	U_RESP_GETEMAILATTACHMENTBATCH			= 507;
	/** 删除邮件 */
	public static final short	U_RESP_DELEMAIL							= 508;
	/** 批量删除邮件 */
	public static final short	U_RESP_DELEMAIL_BATCH					= 509;

	// ========================><=========================================

	// ==========================>好友<====================================
	/** 获取好友列表 */
	public static final short	U_RESP_GETFRIENDS						= 510;
	/** 添加好友 */
	public static final short	U_RESP_ADDFRIEND						= 511;
	/** 通知玩家XXX加你为好友 */
	public static final short	U_RESP_NOTIFYADDFRIEND					= 512;
	/** 通过角色名查询角色信息 */
	public static final short	U_RESP_QUERYROLEBYNAME					= 513;
	/** 获取最近联系人列表 */
	public static final short	U_RESP_GETRECENTLYLINKMANS				= 514;
	/** 删除好友 */
	public static final short	U_RESP_DELFRIEND						= 515;
	/** 获取推荐好友 */
	public static final short	U_REQ_GETRECOMMENDFRIENDS				= 516;
	// ========================><=========================================
	// =========================>NPC商店<=========================================
	/** 获取NPC商店信息 */
	public static final short	U_RESP_GETNPCSHOPINFO					= 525;
	/** 购买商店物品 */
	public static final short	U_RESP_BUYGOODS							= 526;

	/** 请求单个商店商品信息 */
	public static final short	U_RESP_GET_INFO_BYID					= 527;

	// ========================><=========================================

	// =========================>npc对话<===================================
	/** 打开NPC对话 */
	public static final short	U_RESP_OPENNPCDIALOG					= 528;
	/** 发送HINT消息 */
	public static final short	U_RESP_SENDHINT							= 529;
	// ========================><=========================================
	/** 更新属性消息(单个) */

	public static final short	U_RESP_PLAYER_ATT_UPDATE				= 530;

	// =====================================================================
	// =============================>任务<======================================
	/** 获取任务列表 */
	public static final short	U_RESP_TASKLIST							= 531;
	/** 任务改变 */
	public static final short	U_RESP_TASKUPDATE						= 532;
	/**
	 * 任务操作回复
	 */
	public static final short	U_RESP_TASKOPERATE						= 533;
	/** 设置任务失败回复 */
	public static final short	U_RESP_SETTASKFAIL						= 534;

	/**
	 * 设置NPC对话任务完成
	 */
	public static final short	U_RESP_SETNPCDIALOG						= 535;

	// ==================================================================
	// ==========================>采集+触发点<=====================================
	/** 采集 */
	public static final short	U_RESP_GATHER							= 536;
	// ==================================================================

	// =========================>组队<=====================================
	/** 接收队伍信息 */
	public static final short	U_RESP_TEAM_INFO						= 537;
	/** 队伍消毁 */
	public static final short	U_RESP_TEAM_DESTROY						= 538;
	/** 队长变更 */
	public static final short	U_RESP_TEAM_LEADER_CHANGE				= 539;
	/** 队员信息变更 */
	public static final short	U_RESP_TEAM_MEMBERINFO_CHANGE			= 540;
	/** 队员离队 */
	public static final short	U_RESP_TEAM_LEAVE						= 541;
	/** 队员入队 */
	public static final short	U_RESP_TEAM_ADD							= 542;
	/** 申请入队回复 */
	public static final short	U_RESP_APPLY_TO_TEAM					= 543;
	/** 通知队长有人申请入队 */
	public static final short	U_RESP_TEAM_APPLY_LEADER				= 544;
	/** 队长获取申请队列 */
	public static final short	U_RESP_GET_APPLY_LIST					= 545;
	/** 通知申请人 队长同意你入队或者拒绝你入队 */
	public static final short	U_RESP_NOTIFY_AGREE_REJECT				= 546;
	/** 收到队长的邀请通知 */
	public static final short	U_RESP_NOTIFY_INVITE					= 547;
	/** 队长设置队伍目标 */
	public static final short	U_RESP_TEAM_SET_TARGET					= 548;

	/** 按目标查找队伍列表 */
	public static final short	U_ERSP_GET_TEAM_LIST					= 549;

	/** 创建队伍 */
	public static final short	U_RESP_CREATE_TEAM						= 550;
	/**
	 * 队长清空申请列表
	 */
	public static final short	U_RESP_TEAM_CLEAR_APPLY_LIST			= 551;

	/** 取消匹配 */
	public static final short	U_RESP_TEAM_CLEAR_MATCH					= 552;

	/** 返回队伍蓝血量 */
	public static final short	U_RESP_TEAM_HP_MP						= 553;

	// ==================================================================
	/** 商城信息请求返回 */
	public static final short	U_RESP_MALL_INFO						= 554;

	/** 请求简单快照信息 */
	public static final short	U_RESP_PLAYER_SIMPLE					= 555;
	// ===============================================================

	// ============================空间====================================
	/** 获取空间信息 */
	public static final short	U_RESP_GET_SPACE_INFO					= 556;

	/** 请求空间留言信息 */
	public static final short	U_RESP_GET_SPACE_MESSAGE				= 557;

	/** 操作日志 */
	public static final short	U_RESP_GET_SPACE_ACTION_LOG				= 558;

	/** 修改自己空间信息 */
	public static final short	U_RESP_ENDIT_INFO						= 559;

	/** 新增物品信息 */
	public static final short	U_NEW_ITEM_TIPS							= 560;

	/** 更新每日任务环任务次数 */
	public static final short	U_RESP_UPDATE_DAILY_PROCESS				= 561;
	/** 更新单个每日任务环任务次数 */
	public static final short	U_RESP_UPDATE_ONE_DAILY_PROCESS			= 562;

	// 玩家fackBook奖励信息
	public static final short	U_RESP_FB_PLAYER_INFO					= 563;
	// fackBook奖励模板信息
	public static final short	U_RESP_FB_REWARD_TEMP					= 564;

	// 1元礼包响应信息
	public static final short	U_RESP_SMALL_PAY						= 565;
	// 所有1元礼包信息
	public static final short	U_ALL_SMALL_PAY							= 566;
	// ===========================>campaign<==============================
	public static final short	U_CAMPAIGN_RESP							= 601;	// 副本返回状态
	public static final short	U_CAMPAIGN_INFO							= 602;	// 副本当前信息
	public static final short	U_CAMPAIGN_NODE_INFO					= 603;	// 副本节点
	public static final short	U_CAMPAIGN_RECORD						= 604;	// 副本记录
	public static final short	U_CAMPAIGN_TASK_INFO					= 605;	// 副本任务记录
	public static final short	U_LIMITLESS_CAMPAIGN_RECORD				= 606;	// 挑战副本记录
	public static final short	U_UPDATA_LIMIT_PRACTICE_HARM			= 612;	// 极限试炼伤害同步
	public static final short	U_UPDATA_LIMIT_PRACTICE_WAVES			= 613;	// 极限试炼波数同步
	public static final short	U_CAMPAIGN_TOAL_HARVEST					= 614;	// 玩家副本内总收获
	// ===========================><==============================
	// ===========================>拉取其他用户详细<===================
	public static final short	U_OTHER_EQUIPMENT_IFNO					= 607;	// 其他用户装备信息
	public static final short	U_OTHER_MAGICWP_IFNO					= 608;	// 其他用户法宝信息
	public static final short	U_OTHER_MOUNT_IFNO						= 609;	// 其他用户坐骑信息
	public static final short	U_OTHER_PET_IFNO						= 610;	// 其他用户宠物信息
	public static final short	U_OTHER_SOUL_IFNO						= 611;	// 其他用户魂幡信息
	public static final short	U_OTHER_ESCORT_IFNO						= 615;	// 其他用户星甲信息

	// ===========================><==============================
	// ===========================>用户挑战信息<===================
	public static final short	U_ARENA_IFNO							= 622;	// 用户挑战信息
	public static final short	U_BATTLE_RESULT							= 623;	// 战斗结果
	// ===========================><==============================
	// ===========================>PvP1v1<=============
	public static final short	U_OTHER_BATTER_IFNO						= 624;	// 挑战对手信息
	public static final short	U_ME_RANK_INFO							= 625;	// 自己的信息
	public static final short	U_LEADER_BOARD							= 626;	// 排行榜信息
	// ===========================><===================
	// ===========================>Avartar分身<===================
	public static final short	U_SINGLE_AVARTAR_INFO					= 627;	// 单个分身信息
	public static final short	U_TOAL_AVARTAR_INFOS					= 628;	// 所有分身信息
	public static final short	U_CAMPAIGN_AVARTAR_REWARDS				= 629;	// 分身副本奖励
	public static final short	U_UPDATE_AVATAR_LEVEL					= 630;	// 更新分身等级
	// ===========================><===================
	// ===========================>PvP1v1<=============
	public static final short	U_UPDATA_PVP_1V1_HARM					= 631;	// 仙府争锋伤害同步
	// ===========================><===================
	// ===========================>PvP1v1oLD<=============
	public static final short	U_OTHER_BATTER_OLD_IFNO					= 632;	// 挑战对手信息
	public static final short	U_ME_RANK_OLD_IINFO						= 633;	// 自己的信息
	public static final short	U_LEADER_OLD_IBOARD						= 634;	// 排行榜信息
	public static final short	U_UPDATA_PVP_1V1_OLD_HARM				= 635;	// 仙府争锋伤害同步

	// ========================>成就BEGIN<==================================
	/** 成就主信息 */
	public static final short	U_ACHIEVEMENT_MAIN_INFO					= 640;
	/** 成就记录列表 */
	public static final short	U_ACHIEVEMENT_INFO_LIST					= 641;
	/** 单个成就记录 */
	public static final short	U_ACHIEVEMENT_INFO						= 642;
	// ========================>成就END<====================================

	// ===========================>战神榜信息<===================
	public static final short	U_ARES_RANK_IFNO						= 645;	// 用户挑战信息
	public static final short	U_ARES_RANK_BATTLE_RESULT				= 646;	// 战斗结果
	public static final short	U_ARES_RANK_CHANGE_RESULT				= 647;	// 战神榜名次改变
	public static final short	U_ARES_RANKS							= 648;	// 战神榜名次改变
	public static final short	U_ARES_GRADE_RISE_CHANGE_RESULT			= 649;	// 战神榜段位晋级结果
	public static final short	U_ALL_ARES_RANKS						= 650;	// 战神榜总榜
	// ===========================><==============================

	// ========================>成就BEGIN<==================================
	/** 称号列表 */
	public static final short	U_APPELLATION_INFO_LIST					= 651;
	/** 单个称号信息 */
	public static final short	U_APPELLATION_INFO						= 652;
	// ========================>成就END<====================================

	// ========================>运营活动BEGIN<==================================
	/** 所有活动模板信息 */
	public static final short	U_OPERATE_ACTIVITY_LIST					= 660;
	/** 单个活动模板信息 */
	public static final short	U_OPERATE_ACTIVITY_INFO					= 661;
	/** 玩家所有活动信息 */
	public static final short	U_OPERATE_ACTIVITY_RECORD_LIST			= 662;
	/** 玩家单个活动信息 */
	public static final short	U_OPERATE_ACTIVITY_RECORD_INFO			= 663;
	/** 玩家单个礼包状态列表 */
	public static final short	U_OPERATE_ACTIVITY_GIFT_RECORD			= 664;

	// ================================>常驻充值消费活动<=========================
	/** 玩家充值/消费活动信息 */
	public static final short	U_RECHAGE_CONSUME						= 665;

	// ===========================>PvP1v1<=============
	public static final short	U_UPDATA_PVP_1V1_ACTIVITY_INFO			= 670;	// 仙府争锋活动信息
	public static final short	U_PVP_1V1_BATTLE_REPORT					= 671;	// 仙府争锋匹配战报
	public static final short	U_PVP_1V1_BATTLE_REPORT_LIST			= 672;	// 仙府争锋匹配战报
	/**
	 * 许愿信息
	 */
	public static final short	U_VOW_INFO								= 680;

	/** 脱单宣言 */
	public static final short	U_MARRIAGE_NOTICE						= 681;

	// ===========================>系统常驻buff<=============

	// ==========================每日累充|消费=================================
	/** 每日累充消费--所有礼包信息 */
	public static final short	U_DRC_ALL_TEMP							= 682;
	/** 每日累充消费--玩家个人信息 */
	public static final short	U_DRC_PLAYER_INFOS						= 683;
	/** 每日累充消费--抽奖记录 */
	public static final short	U_DRC_LUCK_DRAW_INFOS					= 684;
	/** 每日累充消费--抽奖返回 */
	public static final short	U_DRC_LUCK_DRAW_RESP					= 685;

	// ==========================炼妖=================================
	/** 玩家炼妖数据返回 */
	public static final short	U_PLAYER_RECORD							= 686;
	// ==========================道藏=================================
	/** 玩家道藏数据返回 */
	public static final short	U_DAO_ZANG_RECORD						= 687;

	// ===========================分身阵型=====================================
	public static final short	U_AVATAR_FORMATION_INFO_LIST			= 690;
	// ========================>技能<=========================================
	/** 获取英雄技能信息 */
	public static final short	U_HERO_GETSKILLINFO						= 701;
	/** 英雄技能升级 */
	public static final short	U_HERO_UpSkillOK						= 702;
	/** 获取技能总属性 */
	public static final short	U_HERO_GETSKILLTOLPRO					= 703;
	/** 升级技能阶段 */
	public static final short	U_HERO_UPHEROSTAGECMD					= 704;

	/** 一键英雄技能升级 */
	public static final short	U_HERO_ONKEYUPSKILLOK					= 705;
	/** 返回技能列表 */
	public static final short	U_HERO_SKILLLISTOK						= 706;
	/** 技能熟练度 */
	public static final short	U_HERO_SKILLLBLESS						= 707;
	// ========================>战斗模式<=========================
	/** 变更战斗模式 */
	public static final short	U_BATTLE_MODE							= 710;
	/** 脱战 **/
	public static final short	U_LEAVE_FIGHT							= 711;
	// ========================>天逆珠<=========================
	/** 天逆珠升级成功 **/
	public static final short	U_INVERSE_BEAD_UP						= 720;
	/** 天逆珠五行数据 **/
	public static final short	U_INVERSE_BEAD_DATE						= 721;
	/** 重置天逆珠数据 **/
	public static final short	U_RESET_INVERSE_MONSTER					= 722;
	/** 天逆珠数据变更 **/
	public static final short	U_REFRESH_INVERSE_BEAD					= 723;
	/** 请求领取灵气液 **/
	public static final short	U_INVERSE_RECEIVE_AURA					= 734;
	// ========================>vip<=========================
	/** vip简单信息更新 **/
	public static final short	U_UPDATE_VIP_INFO						= 735;
	/** 添加已购买的vip礼包 **/
	public static final short	U_VIP_BAG_BUY							= 736;
	/** 获取vip信息 **/
	public static final short	U_GET_VIP_INFO							= 737;
	/** 更新vip权限信息 **/
	public static final short	U_VIP_PACKAGE							= 738;
	/** 首冲信息 **/
	public static final short	U_VIP_FIRST_RECHARGE					= 739;

	// ==========================>夫妻PVP<======================================
	/** 活动状态信息 **/
	public static final short	U_MARRIAGE_2V2_BATTLE					= 750;
	/** 匹配对象信息 **/
	public static final short	U_MARRIAGE_2V2_MATCH_INFO				= 751;
	/** 比赛结果 **/
	public static final short	U_MARRIAGE_2V2_BATTLE_RESULT			= 752;
	/** 结婚排行信 **/
	public static final short	U_MARRIAGE_2V2_RANK_INFO				= 753;
	/** 结婚排行信息列表 **/
	public static final short	U_MARRIAGE_2V2_RANK_INFO_LIST			= 754;
	/** 夫妻副本伤害包 */
	public static final short	U_MARRIAGE_2V2_PRACTICE_HARM			= 755;
	/** 夫妻副本匹配对战列表 */
	public static final short	U_MARRIAGE_2V2_REPORT_LIST				= 756;
	/** 夫妻副本匹配对战信息 */
	public static final short	U_MARRIAGE_2V2_REPORT					= 757;

	// ==========================>PPT(泡泡堂)<======================================
	/** 重置整个棋盘的全部信息 */
	public static final short	U_PPT_TWHOLE_SITUATION					= 770;
	/** 单个玩家的信息 */
	public static final short	U_PPT_SINGLE_PLAYER_INFO				= 771;
	/** 单个元素的信息 */
	public static final short	U_PPT_SINGLE_ELEMENT_INFO				= 772;
	/** 玩家请求移动转发 */
	public static final short	U_PPT_PLAYER_MOVE_RESP					= 773;
	/** 玩家请求同步位置转发 */
	public static final short	U_PPT_PLAYER_SYNC_POS_RESP				= 774;
	/** 怪物请求移动格子 */
	public static final short	U_PPT_MONSTER_MOVE_POS_RESP				= 775;
	/** 怪物请求同步格子 */
	public static final short	U_PPT_MONSTER_SYNC_POS_RESP				= 776;
	/** 炸弹爆炸 */
	public static final short	U_PPT_BOMB_BURST_SYNC_RESP				= 777;
	/** 玩家单个属性更新 */
	public static final short	U_PPT_ATTRIBUTE_UPDATA					= 778;
	/** 玩家战斗播报 */
	public static final short	U_PPT_BATTLE_REPORT						= 779;
	/** 全活动排行榜 */
	public static final short	U_PPT_TOAL_RANK							= 780;

	// ==========================>地图<========================================
	/** 场景切换，通知客户端切换用户场景 */
	public static final short	U_CHANGE_MAP							= 1517;
	/** 客户端进请求进入场景结果 */
	public static final short	U_ENTER_MAP_RESPOSE						= 1518;
	/** 广播移动信息 */
	public static final short	U_BC_MOVE								= 1519;	// 广播移动信息
	/** 玩家战斗属性变更 */
	public static final short	U_RESP_ATT_CHG							= 1520;	// 玩家战斗属性变更
	/** 玩家战斗属性快照 */
	public static final short	U_RESP_ATT_SNAP							= 1521;	// 玩家战斗属性快照
	/** 切换场景错误，返回结果给客户端 */
	public static final short	U_ENTER_FAIL							= 1522;
	/** 玩家离开九宫格区域 */
	public static final short	U_LEAVE_GRID							= 1523;	//
	/** 玩家进入九宫格区域 */
	public static final short	U_ENTER_GRID							= 1524;	//
	/** 玩家停止移动 */
	public static final short	U_BC_STOP								= 1525;	//
	// ========================><=========================================

	/** 空间操作 */
	public static final short	U_RESP_SPACE_ACTION						= 1600;

	/** 添加留言 */
	public static final short	U_RESP_SPACE_ADD_MSG					= 1601;

	/** 删除留言 */
	public static final short	U_RESP_SPACE_DEL_MSG					= 1602;

	/** 收藏相关 */
	public static final short	U_RESP_SPACE_SET_COLLECTION				= 1603;

	/** 设置礼物 */
	public static final short	U_RESP_SPACE_SET_GIFT					= 1604;

	/** 通知属性改变 */
	public static final short	U_RESP_NOTIFY_SPACE_CHANGE				= 1065;
	// ============================>魂幡<====================================

	/**
	 * 请求信息
	 */
	public static final short	U_RESP_GET_SOUL_INFO					= 1605;

	/** 碎片合成 */
	public static final short	U_RESP_SOUL_PIECE_COMBO					= 1606;

	/** 增加经验值 */
	public static final short	U_RESP_SOUL_ADD_EXP						= 1607;

	/** 同步碎片数量 */
	public static final short	U_RESP_NOTIFY_CARDPIECE					= 1608;

	/**
	 * 材料制作
	 */
	public static final short	U_RESP_SOUL_MAKE						= 1609;

	/**
	 * 制作任务同步
	 */
	public static final short	U_RESP_SOUL_MAKE_TASK					= 1610;

	/**
	 * 融合
	 */
	public static final short	U_RESP_SOUL_FUSE						= 1611;

	/**
	 * 请求抽卡信息
	 */
	public static final short	U_RESP_SOUL_GET_LUCK_INFO				= 1625;

	/**
	 * 抽卡
	 */
	public static final short	U_RESP_SOUL_DRAW_CARD					= 1626;

	// ==========================>日常活动<====================================
	/**
	 * 活动总数据
	 */
	public static final short	U_RESP_ACTIVITY_INFOS					= 1612;

	/**
	 * 个人活动信息同步
	 */
	public static final short	U_RESP_ACTIVITY_SYNC					= 1613;

	/**
	 * 系统活动信息同步
	 */
	public static final short	U_RESP_TEMP_ACTIVITY_SYNC				= 1621;

	/**
	 * 系统活动信息同步
	 */
	public static final short	U_RESP_SINGLE_TEMP_ACTIVITY_SYNC		= 1622;

	// ==========================>排行榜<======================================
	/**
	 * 排行榜
	 */
	public static final short	U_RESP_RANK_GET_TOTAL					= 1614;
	/**
	 * 排行榜
	 */
	public static final short	U_RESP_RANK_GET_INDEX					= 1615;
	/**
	 * 请求个人数据
	 */
	public static final short	U_RESP_RANK_MYRANK						= 1616;

	// ==========================>境界<======================================
	/**
	 * 境界返回消息
	 */
	public static final short	U_STATE_RESP							= 1620;

	// ==========================>兑换<=======================================

	public static final short	U_RESP_EXCHANGE							= 1627;
	// ==========================>活跃系统<=======================================

	/**
	 * 进度通知
	 */
	public static final short	U_NOTIFY_ACTIVE_PROCESS					= 1628;
	/**
	 * 获奖
	 */
	public static final short	U_RESP_ACTIVE_REWARD					= 1629;
	/**
	 * 获得所有的进度
	 */
	public static final short	U_RESP_ACTIVE_GET_ALL					= 1630;

	/**
	 * 境界转职生效的特效
	 */
	public static final short	U_STATE_EFFECTS							= 1631;

	/** 推送所有境界任务完成列表 */
	public static final short	U_SEND_STATE_RECORD_LIST				= 1632;
	/** 推送单个境界任务完成记录 */
	public static final short	U_SEND_STATE_RECORD						= 1633;
	/** 推送境界BOSS的击杀信息 */
	public static final short	U_SEND_STATE_BOSS_RECORD				= 1634;
	/** 推送对应境界Boss通关玩家最新三人的信息 */
	public static final short	U_SEND_PASS_NEW_PLAYER_INFO				= 1635;
	/** 单个天赋信息 */
	public static final short	U_SINGLE_TALENT_INFO					= 1636;

	// =================================跨服组队=================================
	/** 房间信息 */
	public static final short	U_CR_ROOM_INFO							= 1640;
	/** 房间成员信息 */
	public static final short	U_CR_ROOM_MEMBER						= 1641;
	/** 简单房间信息列表 */
	public static final short	U_CR_SIMPLE_ROOM_INFO_LIST				= 1642;
	/** 房间被销毁 */
	public static final short	U_ROOM_DESTROY							= 1643;
	/** 邀请加入房间 */
	public static final short	U_CR_ROOM_INVITATION_INFO				= 1644;
	/** 招募全服玩家 */
	public static final short	U_CR_ROOM_RECRUI_2_ALL_SERVER			= 1645;
	/** 跨服房间是否开启 */
	public static final short	U_CR_ROOM_SWITCH						= 1646;

	/** 跨服房间踢队长 */
	public static final short	U_CR_ROOM_KICK_LEADER					= 1647;

	// =================================吃鸡战场===========================
	/** 吃鸡战场地图配置 */
	public static final short	U_CR_EAT_CHICKEN_CONFIG					= 1701;

	/** 掉落盒子的信息-----单个 */
	public static final short	U_CR_EAT_CHICKEN_DROP_BOX				= 1702;
	/** 掉落盒子的信息-----所有 */
	public static final short	U_CR_EAT_CHICKEN_DROP_BOX_LIST			= 1703;
	/** 单个物品信息 */
	public static final short	U_CR_EAT_CHICKEN_ITEM_INFO				= 1704;
	/** 全部背包物品信息(包含装备背包) */
	public static final short	U_CR_EAT_CHICKEN_ITEM_INFO_LIST			= 1705;

	/** 匹配队列信息 */
	public static final short	U_CR_EAT_CHICKEN_MATCH_QUEUE_INFO		= 1706;
	/** 玩家战斗数据信息 */
	public static final short	U_CR_EAT_CHICKEN_PLAYER_WAR_INFO		= 1707;
	/** 玩家战斗信息结算 */
	public static final short	U_CR_EAT_CHICKEN_PLAYER_WAR_REPORT		= 1708;
	/** 队列开始 */
	public static final short	U_CR_EAT_CHICKEN_QUEUQ_START			= 1709;
	/** 玩家击杀协议 */
	public static final short	U_CR_EAT_CHICKEN_KILLER_INFO			= 1710;
	/** 战场全局信息 */
	public static final short	U_CR_EAT_CHICKEN_GLOBAL_INFO			= 1711;

	// =================================================================

	// ==============================使用物品获得常驻BUFF=====================
	public static final short	U_PERSISTENT_BUFFER_INFO				= 1715;
	public static final short	U_PERSISTENT_BUFFER_LIST				= 1716;
	// =================================================================

	// ==============================战斗数据统计=============================
	/** 战斗列表 */
	public static final short	U_BATTLEREPORT_LIST_MSG					= 1721;
	/** 战斗详细数据 */
	public static final short	U_BATTLEREPORT_DATA_MSG					= 1722;
	/** 生命恢复 */
	public static final short	U_CURE_DAMAGE_DETAIL_MSG				= 1723;
	/** 被击数据 */
	public static final short	U_BE_ATTACKDETAIL_MSG					= 1724;
	/** 攻击伤害 */
	public static final short	U_SKILL_DAMAGEDETAIL_MSG				= 1725;

	// =============================>运镖系统<=========================
	/** 请求回应 */
	public static final short	U_RESP_TRUCK_ACTION						= 2612;
	/** 请求回应所有镖车的信息 */
	public static final short	U_RESP_TRUCK_ALLSTATUS					= 2613;
	/** 请求回应自己镖车的信息 */
	public static final short	U_RESP_TRUCK_MYSTATUS					= 2614;
	/** 检查点状态 */
	public static final short	U_RESP_TRUCK_CHECKPOINT					= 2615;
	/** 镖车属性变更 */
	public static final short	U_RESP_TRUCK_ATTCHG						= 2623;
	/** 镖车领奖 */
	public static final short	U_RESP_TRUCK_REWARD						= 2624;
	/** 帮派成员护镖运镖时间 */
	public static final short	U_RESP_TRUCK_PROT_TIMER					= 2625;
	/** 是否能够免费抽取鬼灵 */
	public static final short	U_RESP_RANDOM_GHOST_NUMBER				= 2628;
	/** 鬼灵列表 */
	public static final short	U_RESP_RANDOM_GHOST						= 2629;
	/** 返回镖车信息 */
	public static final short	U_RESP_TRUCK_INSTANCE					= 2632;
	/** 返回镖车检查点获取灵力的次数 */
	public static final short	U_RESP_TRUCK_CHECKPOINT_GET_MANA_TIMES	= 2633;

	// 福利相关协议
	/** 推送全部福利信息 */
	public static final short	U_ALL_WELFARE_INFO						= 2626;
	/** 更新单个福利信息 */
	public static final short	U_ONE_WELFARE_INFO						= 2627;
	/** 推送签到奖励模板数据 */
	public static final short	U_SIGN_REWARD							= 2634;
	/** 推送签到奖励模板数据 */
	public static final short	U_UPDATE_SIGN_DAYS						= 2635;
	/** 更新7日福利信息 */
	public static final short	U_SEVEN_DAYS_WELFARE					= 2636;
	/** 推送全部7日福利信息 */
	public static final short	U_ALL_SEVEN_DAYS_WELFARE				= 2637;

	// 充值
	/** 更新首充礼包信息 */
	public static final short	U_UPDATE_FIRST_RECHARGE					= 2638;

	// 红包
	/** 广播红包 */
	public static final short	U_BROADCAST_RED_PACKET_INFO				= 2700;
	/** 返回抢红包结果信息 */
	public static final short	U_RETURN_GET_RED_PACKET_RESULT			= 2701;
	/** 查看红包领取记录信息 */
	public static final short	U_SEE_RED_PACKET_INFO					= 2702;
	/** 删除红包 */
	public static final short	U_DELETE_RED_PACKET						= 2703;
	/** 推送红包历史记录 */
	public static final short	U_SEE_RED_PACKET_HISTORY				= 2704;
	/** 玩家红包领取状态 */
	public static final short	U_RED_PACKET_LIMIT_STATE				= 2705;

	// 挑战副本
	/** 通知客户端挑战副本相关所有 */
	public static final short	U_CHALLENGE_CAMPAIGN_INFO				= 2801;
	/** 刷新vip副本界面 */
	public static final short	U_VIP_CAMPAIGN_INFO						= 2802;
	/** 刷新单个vip副本次数 */
	public static final short	U_ONE_VIP_CAMPAIGN_INFO					= 2803;
	/** 副本掉落计数 */
	public static final short	U_CAMPAIGN_DROP_INFO					= 2804;
	/** 挑战副本排行榜信息 */
	public static final short	U_CHALLENGE_CAMPAIGN_RANK_INFO			= 2805;

	/** 悟道条件信息 */
	public static final short	U_TAOIST_CONDITION_INFO					= 2806;
	/** 悟道某一主类信息 */
	public static final short	U_TAOIST_INFO							= 2807;
	/** 悟道系统所有信息 */
	public static final short	U_TAOIST_ALL							= 2808;

	/** 通用小协议 */
	public static final short	U_COMMON_SMALL_ACTION					= 2809;

	/** 装备特技消息 */
	public static final short	U_EQUIP_STUNT							= 2810;

	/** 装备特技触发通知客户端播特效 */
	public static final short	U_EQUIP_STUNT_TRIGGER					= 2811;

	/** 师徒系统操作返回 */
	public static final short	U_MENTORSHIP_RESP						= 2812;
	/** 拜师/收徒信息列表 */
	public static final short	U_MENTORSHIP_SEARCH_LIST				= 2813;
	/** 自己的师徒/同门关系列表 */
	public static final short	U_MENTORSHIP_LIST						= 2814;

	/** 拜师/收徒信息列表数据更新 */
	public static final short	U_MENTORSHIP_SEARCH_INFO_UPDATE			= 2815;
	/** 自己的师徒/同门关系列表数据更新 */
	public static final short	U_MENTORSHIP_INFO_UPDATE				= 2816;
	/** 拜师/收徒申请列表 */
	public static final short	U_MENTORSHIP_APPLY_LIST					= 2817;
	/** 师徒属性列表 */
	public static final short	U_MENTORSHIP_PROPERTY_LIST				= 2818;
	/** 师徒系统打卡信息 */
	public static final short	U_MENTORSHIP_CLOCK						= 2819;
	/** 师徒系统副本房间信息 */
	public static final short	U_MENTORSHIP_ROOM						= 2820;

	/** 跨服BOSS列表 */
	public static final short	U_CROSSBOSS_LIST						= 2821;

	// 结婚系统
	/** 求婚 */
	public static final short	U_PROPOSE								= 2900;
	/** 宣誓 */
	public static final short	U_JURATION								= 2901;
	/** 宣誓回应 */
	public static final short	U_ANSWER_JURATION						= 2902;
	/** 离婚界面 */
	public static final short	U_ANSWER_DIVORCE						= 2903;
	/** 婚姻信息 */
	public static final short	U_MARRIAGE_DATA							= 2904;
	/** 离婚成功 */
	public static final short	U_DIVORCE_SUCCESS						= 2905;
	/** 个人信息 */
	public static final short	U_PERSONAL_DATA							= 2906;
	/** 个人戒指信息 */
	public static final short	U_PERSONAL_RING_DATA					= 2907;
	/** 夫妻互动回应 */
	public static final short	U_SPOUSE_INTERACTION					= 2908;
	/** 戒指操作返回 */
	public static final short	U_RING_OP_RETURN						= 2909;
	/** 进入结婚场景时，副本面板信息 */
	public static final short	U_ENTER_MARRIAGE_SCENE_INFO				= 2910;
	/** 开始宴席 */
	public static final short	U_START_MARRIAGE_FEAST					= 2911;
	/** 放烟花 */
	public static final short	U_MARRIAGE_BURNING_FIREWORKS			= 2912;
	/** 查看结婚红包排行榜 */
	public static final short	U_MARRIAGE_RED_PACKET					= 2913;
	/** 通知玩家结婚对象改变 */
	public static final short	U_SYNC_MARRIAGE_APP						= 2914;
	/** 通知玩家有人结婚 */
	public static final short	U_SOMEBODY_GET_MARRIED					= 2928;
	/** 通知玩家玫瑰花 */
	public static final short	U_SOMEBODY_GET_NINETY_NINE_FLOWERS		= 2929;

	/** 大富翁摇骰子结果 */
	public static final short	U_PLAY_RICHMAN_RESP						= 2915;
	/** 欢乐寻宝玩的结果 */
	public static final short	U_FIND_TREASURE							= 2916;
	/** 推送运营活动单条公告 */
	public static final short	U_PROMOTION_NOTICE_ONE					= 2917;
	/** 推送运营活动公告列表 */
	public static final short	U_PROMOTION_NOTICE_LIST					= 2918;
	/** 资源大亨及各达人活动排名礼包 */
	public static final short	U_TYCOON_RANK_LIST						= 2919;
	// 仇人相关协议
	/** 仇人列表 */
	public static final short	U_ENEMY_LIST							= 2920;
	/** 添加仇人 */
	public static final short	U_ADD_ENEMY								= 2921;
	/** 删除仇人 */
	public static final short	U_DELETE_ENEMY							= 2922;
	/** 击杀信息列表 */
	public static final short	U_KILLED_BY_ENEMY_INFO_LIST				= 2923;

	// 引灵图协议
	/** 添加或者更新单个引灵图位置信息 */
	public static final short	U_EQUIP_YINLING_POSITION				= 2924;
	/** 全部引灵图位置信息 */
	public static final short	U_ALL_EQUIP_YINLING_POSITION			= 2925;
	/** 引灵图信息 */
	public static final short	U_EQUIP_YINLING							= 2926;
	/** 全部引灵图信息 */
	public static final short	U_ALL_EQUIP_YINLING						= 2927;
	// 连续消费
	/** 连续消费信息 */
	public static final short	U_CONSUME								= 2930;

	/**
	 * 排行榜其他玩家外观数据
	 */
	public static final short	U_RANK_PLAYER_INFO						= 2931;
	/**
	 * 膜拜成功返回
	 */
	public static final short	U_RANK_LIKE_SUCCESS						= 2932;
	/**
	 * 播放特效
	 */
	public static final short	U_PLAY_EFFECT							= 2933;
	/**
	 * 播放特效(称号特效)
	 */
	public static final short	U_PLAY_EFFECT1							= 2934;
	// ====================推送============================
	/** 活动及福利及开箱子领取礼包获取的物品 */
	public static final short	U_REWARD_ITEMS							= 2935;

	/** 特殊活动的进度变更 */
	public static final short	U_SPECIAL_ACTIVITY_PROGRESS				= 2936;

	/** pvp夺旗活动积分列表 */
	public static final short	U_PVPDUIQI_SCORES						= 2939;

	/** pvp夺旗个人积分 */
	public static final short	U_PVPDUIQI_PERSONAL_SCORE				= 2937;

	/** pvp夺旗阵营积分 */
	public static final short	U_PVPDUIQI_CAMP_SCORE					= 2938;
	// 献宝
	/** 推送献宝模板数据 */
	public static final short	U_XIANBAO_SEND_TEMP						= 2940;
	/** 更新献宝个人单条数据 */
	public static final short	U_XIANBAO_SEND_PERSONAL_DATA			= 2941;
	/** 推送献宝个人全部数据 */
	public static final short	U_XIANBAO_SEND_PERSONAL_ALL_DATA		= 2942;
	/** 通知客户端某个献宝活动开启或者关闭 */
	public static final short	U_XIANBAO_START_OR_CLOSE				= 2943;
	/** 夫妻副本种花数量 */
	public static final short	U_COUPLE_CAMPAIGN_FLOWERS				= 2944;
	/** 夫妻副本种花数量 */
	public static final short	U_COUPLE_CAMPAIGN_BREAK_LINE			= 2945;

	/** 幸运转盘活动玩的结果 */
	public static final short	U_LUCKY_WHEEL_PLAY_RESULT				= 2946;
	/** 单条活动全局信息 */
	public static final short	U_PROMOTION_ACTIVITY_GLOBAL_INFO		= 2947;
	/** 活动全局信息列表 */
	public static final short	U_PROMOTION_ACTIVITY_GLOBAL_INFO_LIST	= 2948;
	/** 全民探宝玩的结果 */
	public static final short	U_QUANMINTREASURE_PLAY_RESULT			= 2949;
	// 道具转盘
	/** 开始转盘结果 */
	public static final short	U_ITEM_TURNTABLE_START					= 2950;
	/** 系统设置 */
	public static final short	U_SYSTEM_SET							= 2951;
	/** 婚车消息 */
	public static final short	U_WEDDINGCAR							= 2952;
	/** 发喜糖弹框 */
	public static final short	U_MARRIAGE_CANDY_QTE					= 2953;
	/** 通知镖车主人别人在吸收灵力 */
	public static final short	U_NOTICE_TRUCKER_ABSORB_MANA			= 2954;

	/** 配偶的境界 */
	public static final short	U_MARRIAGE_PLAYER_STATE					= 2955;
	/** 玩家说话显示在头顶上的 */
	public static final short	U_PLAYER_SPEAK							= 2956;
	/** 有缘人列表 */
	public static final short	U_PEOPLE_WITH_FATE_LIST					= 2957;
	/** 更新好友信息 */
	public static final short	U_UPDATE_FRIEND_INFO					= 2958;
	/** 更新挖宝信息 */
	public static final short	U_UPDATE_BOSS_WABAO_INFO				= 2959;
	/** 周常活动开启状态列表 */
	public static final short	U_WEEK_MASTER_ACTIVITY_STATE_LIST		= 2960;
	/** 周常活动记录 */
	public static final short	U_WEEK_MASTER_RECORD					= 2961;
	/** 周常活动记录列表 */
	public static final short	U_WEEK_MASTER_RECORD_LIST				= 2962;
	/** 周常活动礼包记录 */
	public static final short	U_WEEK_MASTER_GIFT_RECORD				= 2963;
	/** 周常活动排名列表 */
	public static final short	U_WEEK_MASTER_RANK_INFO_LIST			= 2964;
	/** 运营活动玩家个人获奖记录 */
	public static final short	U_PROMOTION_ACTIVITY_GIFT_NOTICE		= 2965;
	/** 运营活动玩家个人获奖记录列表 */
	public static final short	U_PROMOTION_ACTIVITY_GIFT_NOTICE_LIST	= 2966;
	/** 更新单个飞镖任务进度 */
	public static final short	U_UPDATE_FEIBIAO_PROGRESS				= 2967;
	/** 更新飞镖物品状态 */
	public static final short	U_UPDATE_FEIBIAO_ITEM_STATU				= 2968;
	/** 飞镖界面简单信息 */
	public static final short	U_SIMPLE_FEIBIAO_INFO					= 2969;
	/** 飞镖界面所有信息 */
	public static final short	U_ALL_FEIBIAO_INFO						= 2970;
	/** 击中 */
	public static final short	U_FEIBIAO_HIT							= 2971;
	/** 发送跨服排行活动数据 */
	public static final short	U_CROSS_PROMOTION_RANK					= 2972;
	/** 发送上届跨服排行活动冠军信息 */
	public static final short	U_CROSS_PROMOTION_OLD_CHAMPAIN			= 2973;
	/** 每日充值返利活动礼包信息 */
	public static final short	U_DAY_RECHARGE_RETURN_GIFT				= 2974;
	/** 发送周长环任务信息 */
	public static final short	U_TASK_WEEK_INFO						= 2975;
	/** 周常活动玩家个人日志列表 */
	public static final short	U_WEEK_MASTER_ACTIVITY_LOG_LIST			= 2976;
	/** 周常活动单条玩家个人日志 */
	public static final short	U_WEEK_MASTER_ACTIVITY_LOG				= 2977;
	/** 聚宝盆活动奖池列表 */
	public static final short	U_CORNUCOPIA_ITEM_LIST					= 2978;
	/** 节日礼物状态 */
	public static final short	U_FESTIVAL_INFO_MSG						= 2979;
	/** 天降红包信息 */
	public static final short	U_FESTIVAL_REDPACKET					= 2980;
	/** 返回天降红包获得金额 */
	public static final short	U_GET_FESTIVAL_REDPACKET				= 2981;
	/** 答谢祝福操作结果 */
	public static final short	U_GLAND_NEW_YEAR_RESULT					= 2982;
	/** 节日礼物模板数据 */
	public static final short	U_FESTIVAL_TEMP_INFO					= 2983;
	/** 自己段位信息 */
	public static final short	U_SELF_QUALIFYINGINFO					= 2984;
	/** 单个位置洗练属性信息 */
	public static final short	U_EQUIP_PURIFY_POSITION_INFO			= 2985;
	/** 所有位置洗练属性信息 */
	public static final short	U_EQUIP_PURIFY_ALL_INFO					= 2986;
	/** 洗练幸运值信息 */
	public static final short	U_EQUIP_PURIFY_LUCK						= 2987;
	/** 洗练帮助信息参数变更 */
	public static final short	U_EQUIP_PURIFY_HELP_CHAT				= 2988;

	/** 种子门派信息 */
	public static final short	U_CITYWAR_SEED_GUILD					= 2999;
	/** 排行榜段位信息 */
	public static final short	U_RANK_QUALIFYING_INFOS					= 3000;
	/** vip投资相关信息 */
	public static final short	U_VIP_INVESTMENT_INFO					= 3001;
	/** 玩家挂机时间更新 */
	public static final short	U_UPDATE_OFF_HANG_TIME					= 3002;
	/** 更新赛季运镖求助消息的求助次数 */
	public static final short	U_UPDATE_SEASON_TRUCK_HELP_TIMES		= 3003;
	/** 更新vip投资活跃度 */
	public static final short	U_UPDATE_VIP_ACTIVITY					= 3004;
	/** 月卡投资相关信息 */
	public static final short	U_MONTH_INVESTMENT_INFO					= 3005;
	/** 仙币投资相关信息 */
	public static final short	U_GROWTH_FUND_INVESTMENT_INFO			= 3006;
	// 秘籍系统
	/** 更新秘籍信息 */
	public static final short	U_ESOTERICA_INFO_LIST					= 3009;
	/** 宝石合成结果 */
	public static final short	U_JEWEL_COMPOSE_RESULT					= 3010;
	/** 城战进行中的盟主面板信息 */
	public static final short	U_CITYWAR_PANEL_INFO					= 3011;
	/** 城战进行中同步城主血量信息 */
	public static final short	U_CITYWAR_UPDATE_LEADER_BLOOD			= 3012;
	/** 城战进行中的个人面板信息 */
	public static final short	U_CITYWAR_OWN_PANEL_INFO				= 3013;
	/** 城战中召唤成员收到的信息 */
	public static final short	U_CITYWAR_CALL_REPS						= 3014;
	/** 城战中已经召唤成员的次数 */
	public static final short	U_CITYWAR_CALL_TIMES					= 3015;
	/** 城战中是否是指挥 */
	public static final short	U_CITYWAR_IS_GUILD_LEADER				= 3016;
	/** 城战中收到的指挥指令 */
	public static final short	U_CITYWAR_GUILD_LEAD_RESP				= 3017;
	/** 时装强化信息更新 */
	public static final short	U_FASHION_STRENGTHEN_INFO				= 3018;
	/** 神纹槽位信息更新 */
	public static final short	U_RUNE_SLOT_UPDATE						= 3019;

	// 孩子系统
	/** 更新单个孩子信息 */
	public static final short	U_ONE_CHILD_INFO						= 3020;
	/** 所有孩子信息 */
	public static final short	U_ALL_CHILD_INFOS						= 3021;
	/** 更新所有孩子信息 */
	public static final short	U_UPDATE_ALL_CHILD_INFOS				= 3022;
	/** 提亲列表 */
	public static final short	U_RECRUIT_LIST							= 3023;
	/** 联姻记录 */
	public static final short	U_MARRY_LIST							= 3024;

	// 抽奖系统
	/** 抽奖系统大奖公告 */
	public static final short	U_LUCKY_DRAW_NOTICE						= 3025;
	/** 抽奖系统大奖公告列表 */
	public static final short	U_LUCKY_DRAW_NOTICE_LIST				= 3026;
	/** 抽奖系统抽出的奖励列表 */
	public static final short	U_LUCKY_DRAW_GIFT_LIST					= 3027;
	/** 抽奖系统玩家信息 */
	public static final short	U_LUCKY_DRAW_INFO						= 3028;
	/** 抽奖系统玩家信息列表 */
	public static final short	U_LUCKY_DRAW_INFO_LIST					= 3029;
	/** 副本找回信息 */
	public static final short	U_CAMPAIGN_GUARD_INFO					= 3030;
	/** 副本鼓舞信息 */
	public static final short	U_CAMPAIGN_INSPIRE_INFO					= 3031;
	/** 门派任务次数 */
	public static final short	U_TASK_GUILD_TIMES						= 3032;
	/** 今日已经捐献的灵石数量 */
	public static final short	U_GUILD_DONATE_MONEY					= 3033;
	/** 今日充值 */
	public static final short	U_DAILY_RECHARGE_INFO					= 3034;
	/** 累计充值 */
	public static final short	U_RECHARGE_INFO							= 3035;
	/** 红包列表 */
	public static final short	U_RED_PACKET_LIST						= 3036;
	/** 组队副本队员进入提示 */
	public static final short	U_TEAM_CAMPAIGN_ENTER_TIPS				= 3037;
	/** 结婚副本进入提示 */
	public static final short	U_MARRIAGE_CAMPAIGN_ENTER_TIPS			= 3038;

	/** 神魔秘宝奖池列表 */
	public static final short	U_GOD_DEMON_LIST						= 3039;
	/** 回复药品CD */
	public static final short	U_RECOVERY_ITEM_CD						= 3040;
	/** 行商信息 */
	public static final short	U_SHOP_INFO								= 3041;
	/** 临时vip1过期时间 */
	public static final short	U_VIP1_OVERDUE_TIME						= 3042;
	/** 种植排行榜数据 */
	public static final short	U_PLANT_FLOWER_RANK_LIST				= 3043;
	/** 目标完成情况 */
	public static final short	U_ALL_TARGET_INFO						= 3044;
	/** 单目标完成情况 */
	public static final short	U_TARGET_INFO							= 3045;
	/** 活动样式模板 */
	public static final short	U_PROMOTION_ACTIVITY_STYLE_LIST			= 3046;
	/** 活动排名信息 */
	public static final short	U_PROMOTION_ACTIVITY_RANK_LIST			= 3047;
	/** 告诉客户端神纹操作成功 */
	public static final short	U_RUNE_OPTION_RESP						= 3048;
	/** vip储蓄经验协议 */
	public static final short	U_VIP_SAVE_EXP							= 3049;
	/** 打坐信息 */
	public static final short	U_DA_ZUO_INFO							= 3050;
	/** 经验瓶使用成功 */
	public static final short	U_USE_EXP_BOTTLE_TIME					= 3051;
	/** 玩具状态更新 */
	public static final short	U_TOY_STATE_UPDATE						= 3052;
	/** 活动排行数据更新 */
	public static final short	U_ACTIVITY_RANK_LIST					= 3053;
	/** 金鸡副本参与人数 */
	public static final short	U_JIN_JI_PLAYER_NUM						= 3054;
	/** 公告奖励是否已领取 */
	public static final short	U_REQ_ANNOUNCEMENT						= 3055;
	/** 抽奖模板 */
	public static final short	U_LUCKY_DRAW_TEMP						= 3056;
	/** 跳过游街 */
	public static final short	U_SKIP_WEDDING_CAR						= 3057;

	// ===========================>拉取其他用户详细<===================
	public static final short	U_OTHER_AVATAR_INFO						= 3058;	// 其他用户分身信息
	public static final short	U_OTHER_SKILL_INFO						= 3059;	// 其他用户技能信息
	public static final short	U_OTHER_RUNES_INFO						= 3060;	// 其他用户神纹信息
	public static final short	U_FIGHT_COMPARE							= 3061;	// 其他用户战力对比

	/** 婚宴品菜信息 */
	public static final short	U_MARRIAGE_CAMPAIGN_FOOD				= 3062;
	/** 机器人跑图配置 */
	public static final short	U_EARLY_ROBOT_SHOW_CONFIG_LIST			= 3063;
	/** 机器人跑图配置 */
	public static final short	U_AVATAR_EQUIP_BAR_INFO					= 3064;
	/** 机器人跑图配置 */
	public static final short	U_AVATAR_EQUIP_BAR_INFO_LIST			= 3065;
	/** 同步金鸡副本获得灵石数量 */
	public static final short	U_UPDATE_JINJI_MONEY					= 3066;

	/** 商店抽奖系统抽奖信息列表 */
	public static final short	U_LUCKY_DRAW_SHOP_INFO_LIST				= 3067;
	/** 商店抽奖系统抽奖信息 */
	public static final short	U_LUCKY_DRAW_SHOP_INFO					= 3068;
	/** 商店抽奖系统商品 */
	public static final short	U_LUCKY_DRAW_SHOP_ITEM_INFO				= 3069;

	/** 用户配置方案目录信息 */
	public static final short	U_SWITCH_CONFIG_INDEX_LIST				= 3070;
	/** 用户配置方案单条目录信息 */
	public static final short	U_SWITCH_CONFIG_INDEX					= 3071;
	/** 用户配置方案具体信息 */
	public static final short	U_SWITCH_CONFIG_DATA					= 3072;

	/** 仙官系统信息 */
	public static final short	U_ACTIVE_STYLITE_INFO					= 3073;
	/** 修行值周排名 */
	public static final short	U_ACTIVE_STYLITE_WEEK_RANK_LIST			= 3074;
	/** 类型首领个人累计击杀奖励 */
	public static final short	U_BOSS_TYPE_PERSONAL_GIFT_INFO			= 3075;
	/** 类型首领个人累计击杀奖励列表 */
	public static final short	U_BOSS_TYPE_PERSONAL_GIFT_INFO_LIST		= 3076;
	/** 装备寻宝聚欧气-相关结果响应 */
	public static final short	U_LUCKY_HELP_RESULT						= 3077;
	/** 装备寻宝聚欧气-更新协助者信息 */
	public static final short	U_LUCKYHELP_UPDATE						= 3078;
	/** 装备寻宝聚欧气-频道广播通知消息变更 */
	public static final short	U_LUCKY_HELP_CHANNEL					= 3079;

	/** BOSS活动所有BOSS信息 */
	public static final short	U_OPERRATE_BOSS_INFO_LIST				= 3080;
	/** BOSS活动单个BOSS信息 */
	public static final short	U_OPERRATE_BOSS_INFO					= 3081;
	/** BOSS活动单个BOSS击杀排行榜 */
	public static final short	U_OPERRATE_BOSS_KILL_RANK_LIST			= 3082;
	/** BOSS活动单个BOSS击杀排行榜队伍队员信息 */
	public static final short	U_OPERRATE_BOSS_KILL_RANK				= 3083;
	/** BOSS活动所有队伍祝福信息 */
	public static final short	U_OPERRATE_BOSS_TEAM_BLEES_LIST			= 3084;
	/** BOSS活动单个队伍祝福信息更新 */
	public static final short	U_OPERRATE_BOSS_TEAM_BLEES				= 3085;
	/** BOSS活动指定队伍队员信息 */
	public static final short	U_OPERRATE_BOSS_TEAM_MEMBERS			= 3086;
	/** BOSS活动自己队伍祝福信息更新 */
	public static final short	U_OPERRATE_BOSS_BLEES					= 3087;
	/** BOSS活动每日祝福次数更新 */
	public static final short	U_OPERATE_BOSS_DAY_BLESS_TIME			= 3088;
	/** BOSS活动求祝福消息更新 */
	public static final short	U_OPERATE_BOSS_REQ_BLESS_UPDATE			= 3089;
	/** BOSS活动帮派祝福次数 */
	public static final short	U_OPERATE_BOSS_GUILD_BLESS_TIME			= 3090;
	/** BOSS活动帮派祝福次数 */
	public static final short	U_OPERATE_BOSS_FIRST_KILL				= 3091;
	/** BOSS活动奖励模板 */
	public static final short	U_OPERATE_BOSS_GIFT_TEMP				= 3092;
	/** BOSS活动房间信息 */
	public static final short	U_OPERATE_BOSS_ROOM						= 3093;
	/** BOSS活动房间列表 */
	public static final short	U_OPERATE_BOSS_ROOM_LIST				= 3094;
	/** 模板表信息重载 */
	public static final short	U_CARNIVAL_CONDITION_TEMPLATE			= 3098;
	/** 模板表信息重载 */
	public static final short	U_CARNIVAL_GIFT_TEMPLATE				= 3099;
	/** 玩家礼包信息 */
	public static final short	U_CARNIVAL_PLAYER_GIFT_RECORD			= 3100;
	/** 玩家全部礼包信息 */
	public static final short	U_CARNIVAL_PLAYER_ALL_GIFT_RECORD		= 3101;
	/** 全局礼包信息 */
	public static final short	U_CARNIVAL_ALL_GIFT_RECORD				= 3102;
	/** 玩家活动信息 */
	public static final short	U_CARNIVAL_PLAYER_RECORD				= 3103;
	/** 活动进度 */
	public static final short	U_CARNIVAL_CONDITION					= 3104;
	/** 所有的活动进度 */
	public static final short	U_CARNIVAL_CONDITION_LIST				= 3105;
	/** BOSS历史击杀 */
	public static final short	U_BOSS_RECORD_KILLNUM					= 3106;
	/** 神秘商店物品列表 */
	public static final short	U_MYSTERIOUS_SHOP_ITEM_LIST				= 3107;
	/** 神秘商店物品更新 */
	public static final short	U_MYSTERIOUS_SHOP_ITEM					= 3108;
	/** 折扣礼包关联 */
	public static final short	U_DISCOUNT_RELEVANCE					= 3109;
	/** 玩家聊天特效记录 */
	public static final short	U_CHAT_SPECIAL_INFO						= 3110;
	/** 玩家聊天特效记录列表 */
	public static final short	U_ALL_CHAT_SPECIAL_INFO					= 3111;
	/** 玩家当前使用的聊天特效 */
	public static final short	U_USE_CHAT_SPECIAL						= 3112;

	// ===================城战占城门派礼包信息==========================
	public static final short	U_GUILD_WAR_REWARD_INFO_LIST			= 3115;

	// ======================冥府鬼节奖励调整============================
	public static final short	U_MFGJ_CAMPAIGN_INFO					= 3116;

	/** 跨服房间，组队形式 */
	public static final short	U_TEAM_ROOM_LIST						= 3150;
	/** 通行证玩家信息 */
	public static final short	U_TRAFFIC_PERMITR_INFO					= 3200;
	/** 通行证玩家领奖信息 */
	public static final short	U_TRAFFIC_PERMITR_RECORD				= 3201;
	/** 通行证玩家所有领奖信息 */
	public static final short	U_TRAFFIC_PERMITR__ALLRECORD			= 3202;
	/** 奖励道具列表 */
	public static final short	U_TRAFFIC_PERMITR_ITEMS					= 3203;
	/** 通行证排行榜 */
	public static final short	U_TRAFFIC_RANK_INFO						= 3204;
	/** 通行证排行榜列表 */
	public static final short	U_TRAFFIC_RANK_INFOS					= 3205;
	/** 通行证条件记录 */
	public static final short	U_TRAFFIC_CONDITION_RECORD				= 3206;
	/** 通行证条件记录 */
	public static final short	U_TRAFFIC_CONDITION_RECORD_ALL			= 3207;

	/** 循环累计充值奖励记录 */
	public static final short	U_CUMULATIVE_RECHARGE_RECORD			= 3208;
	/** 转发客户端处理 */
	public static final short	U_HTTP_TO_CLIENT						= 3209;
	/** 赛季积分日志 */
	public static final short	U_QUALIFYING_LOG						= 3210;
	/** 通知客户端弹窗 */
	public static final short	U_QUALIFYING_ALERT						= 3211;
	/** 同步下次督促CD时间 */
	public static final short	U_TEAM_REQ_GO_SYNC						= 3212;

	/** 砍价信息 */
	public static final short	U_BARGAIN_INFO							= 3213;
	/** 砍价信息lost */
	public static final short	U_BARGAIN_INFO_LIST						= 3214;

	/** 帮派投资任务更新 */
	public static final short	U_GUILD_INVEST_CONDITION_LIST			= 3215;
	/** 门派投资人列表 */
	public static final short	U_GUILD_INVEST_MEMBER_LIST				= 3216;
	/** 帮派投资督促完成任务 */
	public static final short	U_GUILD_INVEST_URGE						= 3217;

	/** 砍价结果 */
	public static final short	U_GUILD_BARGAIN_RESULT					= 3218;

	/** 砍价历史信息list */
	public static final short	U_BARGAIN_HISTORY_LIST					= 3219;
	/** 个人赛季分组第一名榜单 */
	public static final short	U_QUALIFYING_FIRST_LIST					= 3220;

	/** 运营活动排行榜变化信息 */
	public static final short	U_PROMOTION_RANK_CHANGE_INFO			= 3223;
	/** 达人活动排行榜变化信息 */
	public static final short	U_WEEK_MASTER_RANK_CHANGE_INFO			= 3224;

	/** 风暴投资消息记录 */
	public static final short	U_STORM_INFO							= 3225;
	/** 风暴投资列表消息记录 */
	public static final short	U_STORM_LIST_INFO						= 3226;

	/** 在线有礼信息 */
	public static final short	U_ONILE_REWARD							= 3227;

	/** boss个人首杀记录 */
	public static final short	U_PERSINAL_FIRST_KILL_RECORD			= 3228;

	/** 经验灵石本扫荡收益 */
	public static final short	U_CAMPAIGN_BEFORE_DROP					= 3229;

	/** 单条boss个人首杀记录 */
	public static final short	U_SINGLE_PERSINAL_FIRST_KILL_RECORD		= 3230;

	/** 装备合成结果 */
	public static final short	U_EQUIP_COMPOSE_RESULT					= 3231;

	/** 宠物所有信息 */
	public static final short	U_NEW_PET_INFO							= 3232;
	/** PK记录信息 */
	public static final short	U_PK_RECORD								= 3234;

	/** 圣灵、神兵、法阵信息 */
	public static final short	U_APPEARANCE_INFO						= 3235;
	/** 单条限时礼包更新 */
	public static final short	U_TRIGGER_DISCOUNT_PACK					= 3236;
	/** 所有限时礼包 */
	public static final short	U_TRIGGER_DISCOUNT_PACK_LIST			= 3237;

	/** 掉落物箱子 */
	public static final short	U_DROP_PICK_UP_BOX						= 3238;

	/** 限时寻宝奖池 */
	public static final short	U_PROMOTION_LUCKY_DRAW_POOL				= 3239;
	/** 限时寻宝奖池 */
	public static final short	U_PROMOTION_LUCKY_DRAW_RESULT			= 3240;

	/** 15V15当前玩家的全部信息 */
	public static final short	U_PVP_15V15_INFO						= 3241;

	/** 神兽装备孔信息 */
	public static final short	U_GOD_BEAST_EQUIP_BAR					= 3242;
	/** 神兽基本信息 */
	public static final short	U_GOD_BEAST_INFO						= 3243;
	/** 神兽图腾星级信息 */
	public static final short	U_GOD_BEAST_TOTEM_STAR_INFO				= 3244;
	/** 神兽图腾星级信息列表 */
	public static final short	U_GOD_BEAST_TOTEM_STAR_LIST				= 3245;
	/** 神兽装备孔信息列表 */
	public static final short	U_GOD_BEAST_EQUIP_BAR_LIST				= 3246;
	/** 神兽装备分解合成返回 */
	public static final short	U_GOD_BEAST_EQUIP_RESULT				= 3247;
	/** 返回神器信息列表 */
	public static final short	U_SHENQI_INFO_LIST						= 3248;
	/** 返回神器信息 */
	public static final short	U_SHENQI_INFO							= 3249;
	/** 返回玩家激活的新套装id */
	public static final short	U_NEW_SUIT_IDS							= 3250;
	/** 新套装操作返回 */
	public static final short	U_NEW_SUIT_RESULT						= 3251;

	/** 寻宝全服信息 */
	public static final short	U_LUCKY_DRAW_GLOBAL						= 3252;

	/** 拍卖品信息 */
	public static final short	U_CROSS_AUCTION_ITEM_INFO				= 3255;
	/** 拍卖品列表 */
	public static final short	U_CROSS_AUCTION_ITEM_LIST				= 3256;
	/** 拍卖场次状态变化 */
	public static final short	U_CROSS_AUCTION_STATE					= 3257;
	/** 拍卖纪录 */
	public static final short	U_CROSS_AUCTION_NOTICE_LIST				= 3258;
	/** 遗迹战场分组 */
	public static final short	U_BATTLE_GROUND_GROUP_INFO				= 3259;

	/** 遗迹战场军衔等级 */
	public static final short	U_BATTLE_GROUND_LEVEL					= 3260;
	/** 遗迹战场日常任务信息 */
	public static final short	U_BATTLE_GROUND_TASK					= 3261;
	/** 九州等级信息 */
	public static final short	U_CROSS_GROUP_INFO						= 3262;
	/** 九州等级信息 */
	public static final short	U_CROSS_GROUP_RANK_LIST					= 3263;
	/** 九州等级经验日志 */
	public static final short	U_CROSS_SERVER_EXP_LOG_LIST				= 3264;

	/** 返回单条魔魂信息 */
	public static final short	U_DEMON_SOUL_INFO						= 3265;
	/** 返回魔魂信息列表 */
	public static final short	U_DEMON_SOUL_INFO_LIST					= 3266;
	/** 魔魂装备孔信息 */
	public static final short	U_DEMON_SOUL_EQUIP_BAR					= 3267;
	/** 魔魂装备孔信息列表 */
	public static final short	U_DEMON_SOUL_EQUIP_BAR_LIST				= 3268;

	/** 战场心魔我的排名 */
	public static final short	U_CROSS_GROUP_DEMON_DEMAGE				= 3270;
	/** 战场心魔所有排名 */
	public static final short	U_CROSS_GROUP_DEMON_DEMAGE_LIST			= 3271;

	/** 返回装备洗练信息 */
	public static final short	U_EQUIP_REMAKE_INFO						= 3272;
	/** 返回装备洗练信息列表 */
	public static final short	U_EQUIP_REMAKE_INFO_LIST				= 3273;

	/** 黑名单列表 */
	public static final short	U_BLACK_LIST_ID_LIST					= 3274;
	/** 黑名单详细信息列表 */
	public static final short	U_BLACK_LIST_INFO_LIST					= 3275;
	/** 黑名单请求返回 */
	public static final short	U_BLACK_RESP_INFO						= 3276;

	/** 更新单个外观商店物品 */
	public static final short	U_FASHION_SHOP_ITEM						= 3277;
	/** 整个外观商店 */
	public static final short	U_FASHION_SHOP_INFO						= 3278;
	/** 更新新每日签到福利信息 */
	public static final short	U_SIGN_WELFARE_INFO						= 3279;

	/** 充值购买礼包更新 */
	public static final short	PAY_BUY_GIFT_INFO						= 3280;
	/** 充值购买礼包列表 */
	public static final short	PAY_BUY_GIFT_INFO_LIST					= 3281;

	/** 卡牌信息返回 */
	public static final short	CARD_INFO								= 3282;
	/** 卡牌位置信息 */
	public static final short	CARD_POS_INFO							= 3283;
	/** 卡牌位置信息列表 */
	public static final short	CARD_POS_INFO_LIST						= 3284;
	/** 卡牌商店信息 */
	public static final short	CARD_SHOP_INFO_LIST						= 3285;

	/** 运营活动通行证领取状态信息 */
	public static final short	OPERATE_REWARD_INFO_LIST				= 3286;

	/** 全服目标活动模板信息 */
	public static final short	U_TARGET_ACTIVITY_TEMPLATE_LIST			= 3287;

	/** 哈德门活动抽奖结果 */
	public static final short	U_THREE_DICE_PLAY_RESULT				= 3288;

	/** 斗战洪荒通关者战力前十 */
	public static final short	U_OPERATE_BOSS_HELPER_LIST				= 3289;

	/** vip任务记录 */
	public static final short	U_VIP_TASK_RECORD						= 3290;
	/** vip单条条件记录 */
	public static final short	U_VIP_TASK_CONDITION					= 3291;
	/** vip条件记录列表 */
	public static final short	U_VIP_TASK_CONDITIONS					= 3292;

	/** 装备觉醒信息更新 */
	public static final short	U_EQUIP_AWAKE_INFO						= 3295;

	/** 分身觉醒信息 */
	public static final short	U_AVATAR_AWAKE_INFO						= 3296;

	/** 群雄混战单条排名 */
	public static final short	U_PVP15V15_RANK_INFO					= 3300;
	/** 群雄混战排名列表 */
	public static final short	U_PVP15V15_RANK_LIST					= 3301;

	/** 聊天消息撤回 */
	public static final short	U_CHAT_RECALL							= 3302;

	/** 玩家rmb投资数据 */
	public static final short	U_RMB_INVESTMENT_INFO_LIST				= 3303;

	/** 玩家道印数据 */
	public static final short	U_DAOYIN_INFO							= 3304;

	/** 玩家道印数据列表 */
	public static final short	U_DAOYIN_INFO_LIST						= 3305;

	/** 玩家古阵核心协议 */
	public static final short	U_OLD_KERNEL_INFO						= 3307;

	/** 玩家古阵装备控协议 */
	public static final short	U_OLD_EQUIP_INFO						= 3308;
	/** 玩家古阵装备控列表协议 */
	public static final short	U_OLD_EQUIP_LIST_INFO					= 3309;

	/** 玩家道印共鸣信息 */
	public static final short	U_DAOYIN_RESONACNE_INFO					= 3310;
	/** 玩家道印共鸣信息列表 */
	public static final short	U_DAOYIN_RESONANCE_INFO_LIST			= 3311;

	/** 玩家激活套装列表 */
	public static final short	U_OLD_ARRAY_SUIT_LIST					= 3312;

	/* =========================时装PK的操作============================= */
	/** 时装PK活动状态 */
	public static final short	U_FASHION_PK_CONFIG_RESP				= 3321;

	/** 时装PK个人信息 */
	public static final short	U_FASHION_PK_RECORD_INFO				= 3322;

	/** 时装PK个人票务信息 */
	public static final short	U_FASHION_PK_TICKET_INFO				= 3323;

	/** 获取玩家的参赛信息（任意玩家） */
	public static final short	U_FASION_PK_ANLY_MATCH_INFO				= 3324;

	/** 获取两个PK玩家的信息 */
	public static final short	U_FASION_PK_BATTLE_INFO					= 3325;

	/** 获取两个PK玩家的得票信息 */
	public static final short	U_FASION_PK_BATTLE_TICKET_INFO			= 3326;

	/** 获取自己投出去票的记录(决赛) */
	public static final short	U_FASION_PK_SEND_TICKET_INFO			= 3327;

	/** 获取自己被别人投票的记录 */
	public static final short	U_FASION_PK_GET_TICKET_INFO				= 3328;

	/** 获取16强对战图 */
	public static final short	U_FASION_PK_FINAL_PICTURE_INFO			= 3329;

	/** 预赛排名信息 */
	public static final short	U_FASION_PK_PER_MATCH_RANK_LIST			= 3330;

	/** 个人比武排名信息 */
	public static final short	U_PERSONAL_CONTEST_ME_RANK_INFO			= 3331;

	/** 个人比武对手信息 */
	public static final short	U_PERSONAL_CONTEST_OTHER_BATTER_INFO	= 3332;
	/** 个人比武伤害同步 */
	public static final short	U_PERSONAL_CONTEST_UPDATA_HARM			= 3333;

	/** 单个分身神魂珠信息 */
	public static final short	U_GOD_SOUL_INFO							= 3334;
	/** 全部神魂珠信息 */
	public static final short	U_GOD_SOUL_INFO_LIST					= 3335;
	/** 神魂珠操作返回 */
	public static final short	U_GOD_SOUL_RESP							= 3336;

}
