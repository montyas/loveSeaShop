package com.lovesea.message.bean.res;
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
public class ResTextMsg extends ResBaseMsg{
	private String content;//回复内容
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
