package cn.kang;

import cn.kang.common.util.Log;

public abstract class BaseServer {
	/** 模块加载时间 */
	private static long		lastInitMillis;
	protected static String	configPath;
	public static boolean	isCross		= false;

	/** 服务器id */
	public static int		id;
	private boolean			terminate	= true;

	// public boolean start() throws Exception {
	// lastInitMillis = System.currentTimeMillis();
	// if
	// (!initComponent(Config.initConfig(BaseServer.class.getResource("/").toURI().getPath(),
	// configPath), "初始化文件加载")) {
	// return false;
	// }
	//
	// id = Config.getInt("server_id");
	//
	// if (!initComponent(NetConfigSet.init(), "初始化网络连接信息")) {
	// return false;
	// }
	//
	// if (!initComponent(CommandSet.load(), "化命令加载")) {
	// return false;
	// }
	//
	// // if (!initComponent(HttpCommandSet.load(), "HTTP命令加载")) {
	// // return false;
	// // }
	//
	// if (!initComponent(LanguageSet.loadLanguage(Config.getValue("language")),
	// "初始化语言包")) {
	// return false;
	// }
	// if (!initComponent(ColorConstant.init(), "初始化颜色文字")) {
	// return false;
	// }
	// if (!initComponent(ErrorCode.checkErrorCode(), "检查错误码")) {
	// return false;
	// }
	// if (!initComponent(ClientUpstreamFiterProtocol.init(), "协议号鉴权")) {
	// return false;
	// }
	// // TODO 语言包测试
	// //
	// System.err.println(LanguageSet.getResource("CenterServer.test.testAlert"));
	// return true;
	// }

	/**
	 * 初始化相关模块
	 */
	public static boolean initComponent(boolean initResult, String componentName) {
		if (!initResult) {
			Log.error(componentName + "错误");
		} else {
			Log.info(componentName + "加载完成.耗时 : " + (System.currentTimeMillis() - lastInitMillis) + " ms");
			System.err.println(componentName + "加载完成.耗时 : " + (System.currentTimeMillis() - lastInitMillis) + " ms");
		}
		lastInitMillis = System.currentTimeMillis();
		return initResult;
	}

	public boolean isTerminate() {
		return terminate;
	}

	public void setTerminate(boolean terminate) {
		this.terminate = terminate;
	}

	public int getId() {
		return id;
	}

	public static void setLastInitMillis(long lastInitMillis) {
		BaseServer.lastInitMillis = lastInitMillis;
	}

}
