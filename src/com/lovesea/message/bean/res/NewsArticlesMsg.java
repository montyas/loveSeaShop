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
 */
public class NewsArticlesMsg {
	private String  title;//图文消息标题 
	private String  description;//图文消息描述 
	private String  picUrl;//图片链接，支持JPG、PNG格式，较好的效果为大图640*320，小图80*80。
	private String  url;//点击图文消息跳转链接
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
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
