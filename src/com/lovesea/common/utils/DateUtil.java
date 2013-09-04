/**
 * 
 */
package com.lovesea.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：DateUtil   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-29 下午03:02:07   
 * 修改人：wangxun   
 * 修改时间：2013-8-29 下午03:02:07   
 * 修改备注：   
 * @version    
 *    
 */
public class DateUtil {
	
	private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	public static String convert2String(long time) {
		Date date = new Date(time);
		return df.format(date);
	}
}
