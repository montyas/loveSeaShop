/**
 * 
 */
package com.lovesea.message.servers;

import java.util.ArrayList;
import java.util.List;

import com.lovesea.common.utils.SpringUtil;
import com.lovesea.message.bean.req.ReqTextMsg;
import com.lovesea.message.bean.res.NewsArticlesMsg;
import com.lovesea.message.dao.IShopDao;
import com.lovesea.shop.bean.ShopInfo;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：HotShop   
 * 类描述：   热销推荐
 * 创建人：wangxun   
 * 创建时间：2013-8-6 下午01:59:58   
 * 修改人：wangxun   
 * 修改时间：2013-8-6 下午01:59:58   
 * 修改备注：   
 * @version    
 *    
 */
public class HotShop extends AbstractShop {

	/**
	 * @param news
	 */
	public HotShop(ReqTextMsg reqText) {
		super(reqText);
	}
	@Override
	public List<NewsArticlesMsg> getResNews() {
		int typeId=1;
		List<NewsArticlesMsg> news = server.queryShopClassification(typeId);
		return news;
	}	
}
