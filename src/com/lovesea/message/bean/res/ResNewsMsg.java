/**
 * 
 */
package com.lovesea.message.bean.res;

import java.util.List;

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
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>12345678</CreateTime>
 * <MsgType><![CDATA[news]]></MsgType>
 * <ArticleCount>2</ArticleCount>
 * <Articles>
 * <item>
 * <Title><![CDATA[title1]]></Title> 
 * <Description><![CDATA[description1]]></Description>
 * <PicUrl><![CDATA[picurl]]></PicUrl>
 * <Url><![CDATA[url]]></Url>
 * </item>
 * <item>
 * <Title><![CDATA[title]]></Title>
 * <Description><![CDATA[description]]></Description>
 * <PicUrl><![CDATA[picurl]]></PicUrl>
 * <Url><![CDATA[url]]></Url>
 * </item>
 * </Articles>
 * </xml> 
 *    
 */
public class ResNewsMsg extends ResBaseMsg{
	private int articleCount;//图文总数
	private List<NewsArticlesMsg> articles;//多条图文消息信息，默认第一个item为大图 
	public int getArticleCount() {
		return articleCount;
	}
	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}
	public List<NewsArticlesMsg> getArticles() {
		return articles;
	}
	public void setArticles(List<NewsArticlesMsg> articles) {
		this.articles = articles;
	}
}
