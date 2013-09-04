/**
 * 
 */
package com.lovesea.message.core;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.lovesea.common.utils.Constant;
import com.lovesea.common.utils.MicroMessageUtil;
import com.lovesea.message.bean.req.ReqTextMsg;
import com.lovesea.message.bean.res.ResTextMsg;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：ResCore   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-6 上午10:02:39   
 * 修改人：wangxun   
 * 修改时间：2013-8-6 上午10:02:39   
 * 修改备注：   
 * @version    
 *    
 */
public class ResCore {
	private final static Logger log = Logger.getLogger(ResCore.class);
	public static String processRequest(HttpServletRequest request){
		ResXML res = null; 
		Map<String, String> requestMap=null;
		try {
			requestMap = MicroMessageUtil.parseXml(request);
			log.info("reqMap:"+requestMap.toString());
		} catch (Exception e) {
			log.error(e);
		}
		// 发送方帐号（open_id）
		String fromUserName = requestMap.get("FromUserName");  
		// 公众帐号  
		String toUserName = requestMap.get("ToUserName");  
		// 消息类型  
		String msgType = requestMap.get("MsgType");
		ReqTextMsg reqTextMsg = new ReqTextMsg();
		ResTextMsg text = new ResTextMsg();
		
		//文本请求
		if(msgType.equals(Constant.REQ_MESSAGE_TYPE_TEXT)){
			reqTextMsg.setFromUserName(fromUserName);
			reqTextMsg.setToUserName(toUserName);
			String content = requestMap.get("Content");
			//如果回复内容的是数字
			if(content.equals("1")||content.equals("2")||content.equals("3")){
				res = ResTypeContext.getResInfo(reqTextMsg,Integer.valueOf(content));
			}
			//如果回复内容非数字
			else{
				text.setFromUserName(toUserName);
				text.setToUserName(fromUserName);
				text.setContent(Constant.REP_TYPE_UNKOWN+getMenus().toString());
				res = new ResTextXML(text);
			}
		}
		
		//事件请求
		else if(msgType.indexOf(Constant.REQ_MESSAGE_TYPE_EVENT)!=-1){
			text.setFromUserName(toUserName);
			text.setToUserName(fromUserName);
			 
			 String eventType = requestMap.get("Event");
			 String content = null;
			 //加关注
			 if(eventType.equals(Constant.EVENT_TYPE_SUBSCRIBE)){
				 content = Constant.SUBSCRIBE_REPLY+getMenus().toString();
			 }
			 //取消关注
			 else if(eventType.equals(Constant.EVENT_TYPE_UNSUBSCRIBE)){
				 content = "取消了关注!";
			 }
			 //自定义菜单,暂未开通
			 else{
				 content = "对不起暂未开通这个功能!";
			 }
			 text.setContent(content);
			 res = new ResTextXML(text);
		}
		
		//为本文，菜单指令,对方发送表情和图文一律不处理
		else{
			text.setContent(Constant.REP_TYPE_UNKOWN+getMenus().toString());
			res = new ResTextXML(text);
		}
		
		return res.resXml();
	}
	/**
	 * @return
	 */
	private static StringBuffer getMenus() {
		 StringBuffer sb = new StringBuffer();
		 sb.append("1   新品上架").append("\n");
		 sb.append("2   热销推荐").append("\n");
		 sb.append("3   猜你喜欢").append("\n");
		 return sb;
	}
}
