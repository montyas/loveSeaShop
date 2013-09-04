/**
 * 
 */
package com.lovesea.common.utils;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：MicroMessageUtil   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-7-30 下午05:44:24   
 * 修改人：wangxun   
 * 修改时间：2013-7-30 下午05:44:24   
 * 修改备注：   
 * @version    
 *    
 */
public class MicroMessageUtil {
	
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
	
	/**
	 * 解析微信xml
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> parseXml(HttpServletRequest request) throws Exception {
		
		Map<String, String> map = new HashMap<String, String>();
		// 从request中取得输入流
		InputStream inputStream = request.getInputStream();
		// 读取输入流
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputStream);
		// 得到xml根元素
		Element root = document.getRootElement();
		// 得到根元素的所有子节点
		List<Element> elementList = root.elements();
		// 遍历所有子节点
		for (Element e : elementList){
			map.put(e.getName(), e.getText());
		}
		// 释放资源
		inputStream.close();
		return map;
	}

}
