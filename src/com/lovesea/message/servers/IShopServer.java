/**
 * 
 */
package com.lovesea.message.servers;

import java.util.List;

import com.lovesea.message.bean.res.NewsArticlesMsg;
import com.lovesea.shop.bean.ShopInfo;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：IShopDetailServer   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-9 下午05:36:40   
 * 修改人：wangxun   
 * 修改时间：2013-8-9 下午05:36:40   
 * 修改备注：   
 * @version    
 *    
 */
public interface IShopServer {
	public void addShopInfo(ShopInfo shopInfo);
	public List<NewsArticlesMsg> queryShopClassification(int typeId);
}
