/**
 * 
 */
package com.lovesea.message.core;

import com.lovesea.message.bean.req.ReqTextMsg;
import com.lovesea.message.servers.AbstractShop;
import com.lovesea.message.servers.GuessYouLikeShop;
import com.lovesea.message.servers.HotShop;
import com.lovesea.message.servers.NewShop;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：ResTypeContext   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-6 下午01:40:25   
 * 修改人：wangxun   
 * 修改时间：2013-8-6 下午01:40:25   
 * 修改备注：   
 * @version    
 *    
 */
public class ResTypeContext {
	
	private static AbstractShop shop;
	public static  ResXML getResInfo(ReqTextMsg reqText,int type){
		switch (type) {
		case 1:
			shop = new NewShop(reqText);
			break;
		case 2:
			shop = new HotShop(reqText);
			break;
		case 3:
			shop = new GuessYouLikeShop(reqText);
			break;
		}
		return shop.getResXml();
	}
}
