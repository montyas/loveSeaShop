package com.lovesea.message.bean.req;
import com.lovesea.message.bean.req.ReqBaseMsg;

/**   
 *    
 * 项目名称：calendarPush   
 * 类名称：ReqTextMsg   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-7-30 下午05:36:48   
 * 修改人：wangxun   
 * 修改时间：2013-7-30 下午05:36:48   
 * 修改备注：   
 * @version    
 *    
 */
public class ReqTextMsg extends ReqBaseMsg {
	
	private String content;//文本消息内容 
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
