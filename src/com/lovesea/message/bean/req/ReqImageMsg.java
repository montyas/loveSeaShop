/**
 * 
 */
package com.lovesea.message.bean.req;


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
public class ReqImageMsg extends ReqBaseMsg {
	private String picUrl;//图片链接

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
}
