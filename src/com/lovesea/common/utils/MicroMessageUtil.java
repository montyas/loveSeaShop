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
