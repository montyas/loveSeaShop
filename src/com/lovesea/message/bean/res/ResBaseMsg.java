package com.lovesea.message.bean.res;

/**
 * 
 */

/**   
 *    
 * 项目名称：calendarPush   
 * 类名称：ResBaseMsg   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-7-31 上午09:26:28   
 * 修改人：wangxun   
 * 修改时间：2013-7-31 上午09:26:28   
 * 修改备注：   
 * @version    
 *    
 */
public class ResBaseMsg {
	private String toUserName;//发送方帐号（一个OpenID）
	private String fromUserName;//开发者微信号 
	private int createTime;//消息创建时间 （整型）
	private String msgType;//消息类型
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
}
