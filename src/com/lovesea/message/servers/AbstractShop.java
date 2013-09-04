/**
 * 
 */
package com.lovesea.message.servers;

import java.util.List;

import com.lovesea.common.utils.SpringUtil;
import com.lovesea.message.bean.req.ReqTextMsg;
import com.lovesea.message.bean.res.NewsArticlesMsg;
import com.lovesea.message.bean.res.ResNewsMsg;
import com.lovesea.message.core.ResNewsXml;
import com.lovesea.shop.bean.ShopInfo;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：AbstractShop   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-6 下午02:08:22   
 * 修改人：wangxun   
 * 修改时间：2013-8-6 下午02:08:22   
 * 修改备注：   
 * @version    
 *    
 */
public abstract class AbstractShop{
	
	protected ReqTextMsg reqText;
	protected IShopServer server = (IShopServer)SpringUtil.getBean("shopServerImpl");
	protected AbstractShop(ReqTextMsg reqText){
		this.reqText = reqText;
	}
	public abstract List<NewsArticlesMsg> getResNews();//获取图文信息列表
	
	public ResNewsXml getResXml(){
		
		ResNewsMsg news = new ResNewsMsg();
		news.setFromUserName(reqText.getToUserName());
		news.setToUserName(reqText.getFromUserName());
		
		List<NewsArticlesMsg> articles = getResNews();
		news.setArticleCount(articles.size());
		news.setArticles(articles);
		
		return new ResNewsXml(news);
	}
}
