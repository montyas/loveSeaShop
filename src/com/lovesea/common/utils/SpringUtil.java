/**
 * 
 */
package com.lovesea.common.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：SpringJuint   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-11 上午10:51:12   
 * 修改人：wangxun   
 * 修改时间：2013-8-11 上午10:51:12   
 * 修改备注：   
 * @version    
 *    
 */
public class SpringUtil {
	private static ClassPathXmlApplicationContext context;
	public static Object getBean(String beanName){
		context =	new ClassPathXmlApplicationContext("applicationContext*.xml");
		return context.getBean(beanName);
	}
}
