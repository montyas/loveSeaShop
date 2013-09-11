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
		String ids="19127401164,26422808588,19126505827,20137337060,20120578300,27433712675,20139441537,20139841019,20134506798,20134818715,27441764088,20135378455,27442132445";
		//long mm_uid=19127401164L;
		String id[] = ids.split(",");
		for(String s:id){
			ShopInfo shopInfo = TbCore.shopDeitals(Long.valueOf(s));
			shop.addShopInfo(shopInfo);
		}
		
	}
	
	@Test
	public void queryShopClassification(){
		shop.queryShopClassification(1);
	}
}
