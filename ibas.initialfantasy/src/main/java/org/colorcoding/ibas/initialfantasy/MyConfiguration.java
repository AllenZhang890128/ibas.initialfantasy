package org.colorcoding.ibas.initialfantasy;

/**
 * 我的配置项
 */
public class MyConfiguration extends org.colorcoding.ibas.bobas.MyConfiguration {

	/**
	 * 模块标识
	 */
	public static final String MODULE_ID = "c2b31c06-20d8-44a2-bb34-17f47ed01859";

	/**
	 * 命名空间
	 */
	public static final String NAMESPACE_ROOT = "http://colorcoding.org/ibas/initialfantasy/";

	/**
	 * 数据命名空间
	 */
	public static final String NAMESPACE_DATA = NAMESPACE_ROOT + "data";

	/**
	 * 业务对象命名空间
	 */
	public static final String NAMESPACE_BO = NAMESPACE_ROOT + "bo";

	/**
	 * 服务命名空间
	 */
	public static final String NAMESPACE_SERVICE = NAMESPACE_ROOT + "service";
	/**
	 * 配置项目-组织缓存刷新时间
	 */
	public final static String CONFIG_ITEM_ORGANIZATION_REFRESH_TIME = "OrgRefreshTime";

	/**
	 * 配置项目-角色数据过滤，优先可用
	 */
	public final static String CONFIG_ITEM_ROLE_DATA_FIRST_AVAILABLE = "RoleDataFirstAvailable";

}
