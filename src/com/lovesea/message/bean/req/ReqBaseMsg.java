package com.lovesea.message.bean.req;

/**
 * 
 */

/**   
 *    
 * 项目名称：calendarPush   
 * 类名称：ReqBaseMsg   
 * 类描述：请求公共属性   
 * 创建人：wangxun   
 * 创建时间：2013-7-30 下午05:35:55   
 * 修改人：wangxun   
 * 修改时间：2013-7-30 下午05:35:55   
 * 修改备注：   
 * @version    
 *    
 */
public class ReqBaseMsg {
	private String toUserName;//开发者微信号 
	private String fromUserName;//发送方帐号（一个OpenID）
	private int createTime;//消息创建时间 （整型）
	private String msgType;//消息类型
	private long msgId;//消息id，64位整型 
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public int getCreateTime() {
		return createTime;
	}
	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public long getMsgId() {
		return msgId;
	}
	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}
}
