/**
 * 
 */
package com.lovesea.message.servers;

import java.util.List;

import com.lovesea.message.bean.req.ReqTextMsg;
import com.lovesea.message.bean.res.NewsArticlesMsg;

/**   
 *    
 * 项目名称：calendarPush   
 * 类名称：NewShop   
 * 类描述：   新品上架
 * 创建人：wangxun   
 * 创建时间：2013-8-6 下午01:59:28   
 * 修改人：wangxun   
 * 修改时间：2013-8-6 下午01:59:28   
 * 修改备注：   
 * @version    
 *    
 */
public class NewShop extends AbstractShop {

	/**
	 * @param news
	 */
	public NewShop(ReqTextMsg reqText) {
		super(reqText);
	}

	@Override
	public List<NewsArticlesMsg> getResNews() {
		int typeId=1;
		List<NewsArticlesMsg> news = server.queryShopClassification(typeId);
		return news;
	}
}
