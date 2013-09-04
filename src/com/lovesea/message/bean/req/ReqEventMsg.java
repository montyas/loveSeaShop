package com.lovesea.message.bean.req;

/**
 * 
 */

import com.lovesea.message.bean.req.ReqBaseMsg;

/**   
 *    
 * 项目名称：calendarPush   
 * 类名称：ReqImageMsg   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-7-30 下午05:37:42   
 * 修改人：wangxun   
 * 修改时间：2013-7-30 下午05:37:42   
 * 修改备注：   
 * @version    
 *    
 */
public class ReqEventMsg extends ReqBaseMsg {
	private String event;//事件类型，subscribe(订阅)、unsubscribe(取消订阅)、CLICK(自定义菜单点击事件) 
	private String eventKey;//事件KEY值，与自定义菜单接口中KEY值对应 
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEventKey() {
		return eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
}
