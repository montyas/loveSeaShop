/**
 * 
 */
package com.lovesea.message.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovesea.common.tb.TbCore;
import com.lovesea.message.servers.IShopServer;
import com.lovesea.shop.bean.ShopInfo;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：TbJuint   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-9 下午05:41:30   
 * 修改人：wangxun   
 * 修改时间：2013-8-9 下午05:41:30   
 * 修改备注：   
 * @version    
 *    
 */
public class TbJuint {
	private ClassPathXmlApplicationContext context;
	private IShopServer shop;
	@Before
	public void setUp() throws Exception {
		context =	new ClassPathXmlApplicationContext("applicationContext*.xml");
		shop = (IShopServer)context.getBean("shopServerImpl");
	}
	@Test
	public void addShopInfo(){
		long mm_uid=19127401164L;
		ShopInfo shopInfo = TbCore.shopDeitals(mm_uid);
		shop.addShopInfo(shopInfo);
	}
	
	@Test
	public void queryShopClassification(){
		shop.queryShopClassification(1);
	}
}
