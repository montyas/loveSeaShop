/**
 * 
 */
package com.lovesea.shop.servers.impl;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.lovesea.common.tb.TbCore;
import com.lovesea.common.utils.DateUtil;
import com.lovesea.shop.bean.ShopInfo;
import com.lovesea.shop.bean.ShopOtherInfo;
import com.lovesea.shop.servers.IShopDetailServer;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：ShopDetailServerImpl   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-29 下午03:06:44   
 * 修改人：wangxun   
 * 修改时间：2013-8-29 下午03:06:44   
 * 修改备注：   
 * @version    
 *    
 */
@Service
public class ShopDetailServerImpl implements IShopDetailServer {
	public String getShopInfo(ShopOtherInfo otherInfo) {
		ShopInfo shopInfo = TbCore.shopDeitals(otherInfo.getItem_id());
		
		JSONObject jobj = TbCore.getSeller(shopInfo.getNick());
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		try {
			map.put("nick", jobj.get("nick").toString());//卖家昵称
			map.put("sid", jobj.get("sid").toString());//卖家id
			map.put("created", jobj.get("created").toString());//创店时间
		} catch (JSONException e) {
			e.printStackTrace();
		}//宝贝
		map.put("title", shopInfo.getTitle());//宝贝
		map.put("detail_url", shopInfo.getDetail_url());//宝贝url
		map.put("num", shopInfo.getNum());//宝贝库存
		map.put("pic_url", shopInfo.getPic_url());//宝贝主图
		map.put("price", shopInfo.getPrice());//宝贝价格
		
		map.put("ends", shopInfo.getDelist_time());//宝贝下架时间
		map.put("starts", shopInfo.getList_time());//宝贝上架时间
		map.put("totalSQ", otherInfo.getTotalSQ());//宝贝总销量
		map.put("location", shopInfo.getLocation());//宝贝总销量
		map.put("valid_thru", shopInfo.getValid_thru());//宝贝有效期
		
		String freight="不包邮";
		if(shopInfo.getFreight_payer().equals("seller")){
			freight="包邮";
		}
		map.put("modified",shopInfo.getModified());//商品最近修改时间
		String discount="不支持";
		if(shopInfo.isHas_discount()){
			discount="支持";
		}
		map.put("discount",discount);//是否支持会员打折
		JSONObject json = new JSONObject(map);
		return json.toString();
	}
}
