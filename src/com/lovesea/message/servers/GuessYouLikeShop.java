/**
 * 
 */
package com.lovesea.message.servers;

import java.util.ArrayList;
import java.util.List;

import com.lovesea.common.utils.SpringUtil;
import com.lovesea.message.bean.req.ReqTextMsg;
import com.lovesea.message.bean.res.NewsArticlesMsg;
import com.lovesea.shop.bean.ShopInfo;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：GuessYouLikeShop   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-6 下午02:01:17   
 * 修改人：wangxun   
 * 修改时间：2013-8-6 下午02:01:17   
 * 修改备注：   
 * @version    
 *    
 */
public class GuessYouLikeShop extends AbstractShop {

	/**
	 * @param news
	 */
	public GuessYouLikeShop(ReqTextMsg reqText) {
		super(reqText);
	}
	
	@Override
	public List<NewsArticlesMsg> getResNews() {
		int typeId=3;
		List<NewsArticlesMsg> news = server.queryShopClassification(typeId);
		return news;
	}
}
