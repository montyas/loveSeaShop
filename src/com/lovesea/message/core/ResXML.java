/**
 * 
 */
package com.lovesea.message.core;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.lovesea.message.bean.res.ResBaseMsg;

/**   
 *    
 * 项目名称：calendarPush   
 * 类名称：ResXML   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-7-31 下午04:47:55   
 * 修改人：wangxun   
 * 修改时间：2013-7-31 下午04:47:55   
 * 修改备注：   
 * @version    
 *    
 */
public abstract class ResXML {
	
	private Document document = DocumentHelper.createDocument();
	private ResBaseMsg msg;
	
	protected ResXML(ResBaseMsg msg){
		this.msg=msg;
	}
	public abstract String createElement();
	
	protected Element getCommElement(){
		Element root = document.addElement("xml");
		
		Element toUserName = root.addElement("ToUserName");
		toUserName.addText(msg.getToUserName());
		
		Element fromUserName = root.addElement("FromUserName");
		fromUserName.addCDATA(msg.getFromUserName());
		
		Element createTime = root.addElement("CreateTime");
		createTime.addText(""+System.currentTimeMillis()/1000);
		
		return root;
	}
	
	public String resXml(){
		createElement();
		return document.asXML().replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
	}
	
}
