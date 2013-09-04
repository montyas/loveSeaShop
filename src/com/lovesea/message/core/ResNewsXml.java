/**
 * 
 */
package com.lovesea.message.core;

import java.util.List;

import org.dom4j.Element;

import com.lovesea.common.utils.MicroMessageUtil;
import com.lovesea.message.bean.res.NewsArticlesMsg;
import com.lovesea.message.bean.res.ResNewsMsg;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：ResNewsXml   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-7-31 下午04:53:17   
 * 修改人：wangxun   
 * 修改时间：2013-7-31 下午04:53:17   
 * 修改备注：   
 * @version    
 *    
 */
public class ResNewsXml extends ResXML {
	private ResNewsMsg msg;
	public ResNewsXml(ResNewsMsg msg) {
		super(msg);
		this.msg=msg;
	}

	@Override
	public String createElement() {
		
		List<NewsArticlesMsg> articlesList = msg.getArticles();
		
		Element root = getCommElement();
		
		Element msgType = root.addElement("MsgType");
		msgType.addCDATA(MicroMessageUtil.RESP_MESSAGE_TYPE_NEWS);
		
		Element articleCount = root.addElement("ArticleCount");
		articleCount.addText(String.valueOf(articlesList.size()));
		
		Element articles = root.addElement("Articles");
		
		Element item,title,des,pic,url;
		
		for(NewsArticlesMsg news:articlesList){
			item = articles.addElement("item");
			
			title = item.addElement("Title");
			title.addCDATA(news.getTitle());
			
			des = item.addElement("Description");
			des.addCDATA(news.getDescription());
			
			pic	= item.addElement("PicUrl");
			pic.addCDATA(news.getPicUrl());
			
			url = item.addElement("Url");
			url.addCDATA(news.getUrl());
			
		}
		
		return null;
	}

}
