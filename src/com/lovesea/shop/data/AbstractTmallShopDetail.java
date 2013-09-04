/**
 * 
 */
package com.lovesea.shop.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lovesea.common.utils.CrawlerUtil;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：AbstractTmallShopDetail   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-29 上午11:14:43   
 * 修改人：wangxun   
 * 修改时间：2013-8-29 上午11:14:43   
 * 修改备注：   
 * @version    
 *    
 */
public abstract class AbstractTmallShopDetail {
	
	private String url;
	public AbstractTmallShopDetail(String url){
		this.url=url;
	}
	
	/**
	 * 下载网页内容
	 * @return
	 */
	protected String getShopPageDetail(){
		return CrawlerUtil.getPageContext(url);
	}
	
	/**
	 * 解析需要网页部分类容，并返回关心的数据
	 * @return
	 */
	protected abstract String executParse();
	
	public String getPageContext(){
		return executParse();
	}
	
	
	/**
	 * @param regExp 正则表达式
	 * @return 匹配的字符串
	 */
	public static String getMatcherStr(String context,String regExp) {
		Pattern pattern = null;
		Matcher matcher = null;
		pattern = Pattern.compile(regExp);
		matcher = pattern.matcher(context);
		String matcherStr=null;
		while(matcher.find()){
			matcherStr = matcher.group(1);
			return matcherStr;
		}
		return matcherStr;
	}
}
