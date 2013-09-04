/**
 * 
 */
package com.lovesea.common.utils;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpConstants;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：CrawlerUtil   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-29 上午10:02:05   
 * 修改人：wangxun   
 * 修改时间：2013-8-29 上午10:02:05   
 * 修改备注：   
 * @version    
 *    
 */
public class CrawlerUtil {
	private static HttpClient client = new HttpClient();
	public static String getPageContext(String url){
		HttpMethod method = new GetMethod(url);
		try {
			client.executeMethod(method);
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int  status = method.getStatusCode();
		if(status==200){
			
		}
		String str=null;
		try {
			 str = method.getResponseBodyAsString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		method.releaseConnection();
		return str;
	}
}
