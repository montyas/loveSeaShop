package com.lovesea.message.bean.req;

/**
 * 
 */

import com.lovesea.message.bean.req.ReqBaseMsg;

/**   
 *    
 * 项目名称：calendarPush   
 * 类名称：ReqLinkMsg   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-7-30 下午05:41:43   
 * 修改人：wangxun   
 * 修改时间：2013-7-30 下午05:41:43   
 * 修改备注：   
 * @version    
 *    
 */
public class ReqLinkMsg extends ReqBaseMsg {
	private String title;//消息标题
	private String description;//消息描述 
	private String url;//消息链接
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
