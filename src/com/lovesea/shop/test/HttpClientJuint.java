/**
 * 
 */
package com.lovesea.shop.test;

import org.junit.Test;

import com.lovesea.shop.data.AbstractTmallShopDetail;
import com.lovesea.shop.data.TmallShopOffShelves;
/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：HttpClientJuint   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-29 上午10:18:03   
 * 修改人：wangxun   
 * 修改时间：2013-8-29 上午10:18:03   
 * 修改备注：   
 * @version    
 *    
 */
public class HttpClientJuint {
	@Test
	public void testDownload(){
		String url="http://detail.tmall.com/item.htm?spm=a1z10.1.w5473162-2797453408.1.qQnq1s&id=19127401164";
		AbstractTmallShopDetail sd = new TmallShopOffShelves(url);
		System.out.println(sd.getPageContext());
	}
}
