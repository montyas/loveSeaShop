/**
 * 
 */
package com.lovesea.message.core;

import org.dom4j.Element;

import com.lovesea.common.utils.MicroMessageUtil;
import com.lovesea.message.bean.res.ResTextMsg;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：ResTextXML   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-7-31 下午04:52:32   
 * 修改人：wangxun   
 * 修改时间：2013-7-31 下午04:52:32   
 * 修改备注：   
 * @version    
 *    
 */
public class ResTextXML extends ResXML {
	
	private ResTextMsg msg;
	
	public ResTextXML(ResTextMsg msg) {
		super(msg);
		this.msg=msg;
	}

	@Override
	public String createElement() {
		
		Element root = getCommElement();
		
		Element msgType = root.addElement("MsgType");
		msgType.addCDATA(MicroMessageUtil.REQ_MESSAGE_TYPE_TEXT);
		
		Element content = root.addElement("Content");
		content.addCDATA(msg.getContent());
		
		return null;
	}

}
