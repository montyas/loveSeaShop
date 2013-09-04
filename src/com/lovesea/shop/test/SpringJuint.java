/**
 * 
 */
package com.lovesea.shop.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovesea.shop.bean.ShopOtherInfo;
import com.lovesea.shop.servers.IShopDetailServer;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：SpringJuint   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-29 下午03:16:59   
 * 修改人：wangxun   
 * 修改时间：2013-8-29 下午03:16:59   
 * 修改备注：   
 * @version    
 *    
 */
public class SpringJuint {
	private ClassPathXmlApplicationContext context;
	private IShopDetailServer iShopServer;
	@Before
	public void setUp() throws Exception {
		context =	new ClassPathXmlApplicationContext("applicationContext*.xml");
	}
	@Test
	public void testTbShopDetail(){
		iShopServer = (IShopDetailServer)context.getBean("shopDetailServerImpl");
		ShopOtherInfo otherInfo = new ShopOtherInfo();
		otherInfo.setItem_id(19127401164L);
		otherInfo.setStarts(1377616506000L);
		otherInfo.setEnds(1378221306000L);
		otherInfo.setTotalSQ(100);
		String json = iShopServer.getShopInfo(otherInfo);
		System.out.println(json);
	}
}
