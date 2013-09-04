/**
 * 
 */
package com.lovesea.common.utils;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：Constant   
 * 类描述：   常量
 * 创建人：wangxun   
 * 创建时间：2013-8-9 上午10:58:22   
 * 修改人：wangxun   
 * 修改时间：2013-8-9 上午10:58:22   
 * 修改备注：   
 * @version    
 *    
 */
public class Constant {
	
	/**
	 * 用户session key
	 */
	public final static  String ACCOUNT_KEY="account";
	
	/**
	 * 第三方用户唯一凭证 
	 */
	public static final String APP_ID="wxf3b895ce65211fb8";
	
	/**
	 * 第三方用户唯一凭证密钥，既appsecret 
	 */
	public static final String APP_SECRET="fbdcb21ec8eeb11feafaeab778955ffc";
	
	public static final String URL="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxf3b895ce65211fb8&secret=fbdcb21ec8eeb11feafaeab778955ffc";
	
	public static final String CREATE_MENU_URL="https://api.weixin.qq.com/cgi-bin/menu/create?access_token=";
	public static final String ACCESS_TOKE="t8WYyYcQgR__0V_ezqquM7Cy4lhGTCY4ZM6czXu2ksS2km6smPpNtFBwn5ZbtQpDhTwhRiwgXR6AkMmmi5x0WP-QSvkct4Mf-1E162jXylpy0hLykxkaT8AOPLdtMJ9xpAmWw3t_ACME-E8--yp3Lw";
	/**
	 * 验证的TOKEN
	 */
	public static final String TOKEN = "montya";
	
	/**
	 * 返回消息类型：文本
	 */
	public static final String RESP_MESSAGE_TYPE_TEXT = "text";

	/**
	 * 返回消息类型：音乐
	 */
	public static final String RESP_MESSAGE_TYPE_MUSIC = "music";

	/**
	 * 返回消息类型：图文
	 */
	public static final String RESP_MESSAGE_TYPE_NEWS = "news";

	/**
	 * 请求消息类型：文本
	 */
	public static final String REQ_MESSAGE_TYPE_TEXT = "text";

	/**
	 * 请求消息类型：图片
	 */
	public static final String REQ_MESSAGE_TYPE_IMAGE = "image";

	/**
	 * 请求消息类型：链接
	 */
	public static final String REQ_MESSAGE_TYPE_LINK = "link";

	/**
	 * 请求消息类型：地理位置
	 */
	public static final String REQ_MESSAGE_TYPE_LOCATION = "location";

	/**
	 * 请求消息类型：音频
	 */
	public static final String REQ_MESSAGE_TYPE_VOICE = "voice";

	/**
	 * 请求消息类型：事件
	 */
	public static final String REQ_MESSAGE_TYPE_EVENT = "event";

	/**
	 * 事件类型：subscribe(订阅)
	 */
	public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";

	/**
	 * 事件类型：unsubscribe(取消订阅)
	 */
	public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";

	/**
	 * 事件类型：CLICK(自定义菜单点击事件)
	 */
	public static final String EVENT_TYPE_CLICK = "CLICK";
	
	/**
	 * 加关注默认回复
	 */
	public static final String SUBSCRIBE_REPLY = "我是购物机器人小艾!欢迎关注爱情海包包官方微信!\n回复数字选择宝贝\n\n";
	
	/**
	 * 无法识别用户指令回复
	 */
	public static final String REP_TYPE_UNKOWN = "SORRY!小艾无法识别!\n亲可以回复数字选择宝贝\n\n";
}
