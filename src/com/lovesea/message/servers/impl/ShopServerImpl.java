/**
 * 
 */
package com.lovesea.message.servers.impl;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lovesea.message.bean.res.NewsArticlesMsg;
import com.lovesea.message.dao.IShopDao;
import com.lovesea.message.servers.IShopServer;
import com.lovesea.shop.bean.ShopInfo;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：ShopDetailServerImpl   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-9 下午06:00:41   
 * 修改人：wangxun   
 * 修改时间：2013-8-9 下午06:00:41   
 * 修改备注：   
 * @version    
 *    
 */
@Service
public class ShopServerImpl implements IShopServer {
	private DecimalFormat decimalFormat = new DecimalFormat("0.00");
	@Resource
	private IShopDao shopDao;
	public void addShopInfo(ShopInfo shopInfo) {
		shopDao.addShopInfo(shopInfo);
	}

	public List<NewsArticlesMsg> queryShopClassification(int typeId) {
		List<ShopInfo> list = shopDao.queryShopClassification(typeId);
		List<NewsArticlesMsg> news = new ArrayList<NewsArticlesMsg>();
		for(ShopInfo shopInfo:list){
			NewsArticlesMsg msg = new NewsArticlesMsg();
			msg.setTitle(shopInfo.getTitle());
			String price=decimalFormat.format((shopInfo.getPrice()/2));
			msg.setDescription(MessageFormat.format("价格:{0} 剩余库存{1}:", price,shopInfo.getNum()));
			msg.setPicUrl(shopInfo.getPic_url());
			msg.setUrl(shopInfo.getDetail_url());
			news.add(msg);
		} 
		return news;
	}
}
