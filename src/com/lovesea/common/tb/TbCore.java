/**
 * 
 */
package com.lovesea.common.tb;

import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.lovesea.shop.bean.ShopInfo;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.domain.SellerCat;
import com.taobao.api.request.ItemGetRequest;
import com.taobao.api.request.SellercatsListGetRequest;
import com.taobao.api.request.ShopGetRequest;
import com.taobao.api.response.ItemGetResponse;
import com.taobao.api.response.SellercatsListGetResponse;
import com.taobao.api.response.ShopGetResponse;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：TbCore   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-9 下午04:34:00   
 * 修改人：wangxun   
 * 修改时间：2013-8-9 下午04:34:00   
 * 修改备注：   
 * @version    
 *    
 */
public class TbCore {
	
	private final static Logger log = Logger.getLogger(TbCore.class);
	private final static String APP_KEY="21591716";
	private final static String APP_SECRET="f43a9fcd02390de4c05a0b3980a8bc51";
	private final static String SERVER_URL="http://gw.api.taobao.com/router/rest";
	public final static TaobaoClient client = new DefaultTaobaoClient(SERVER_URL, APP_KEY, APP_SECRET);
	/**
	 * 通过商品id查询商品详情
	 * @param shopId
	 * @return
	 */
	public static ShopInfo shopDeitals(long shopId){
		ShopInfo shopInfo = new ShopInfo();
		ItemGetRequest req=new ItemGetRequest();
		req.setFields("detail_url,num_iid,title,nick,type,cid,seller_cids,props,input_pids,input_str,desc,pic_url,num,valid_thru,list_time,delist_time,stuff_status,location,price,post_fee,express_fee,ems_fee,has_discount,freight_payer,has_invoice,has_warranty,has_showcase,modified,increment,approve_status,postage_id,product_id,auction_point,property_alias,item_img,prop_img,sku,video,outer_id,is_virtual");
		req.setNumIid(shopId);
		String context = null;
		try {
			ItemGetResponse response = client.execute(req , null);
			context = response.getBody();
		} catch (ApiException e) {
			log.error(e);
			return null;
		}
		
		JSONObject a=null;
		try {
			a = new JSONObject(context);
			JSONObject s = (JSONObject)a.get("item_get_response");
			JSONObject item = (JSONObject)s.get("item");
			JSONObject location = (JSONObject)item.get("location");
			shopInfo.setDetail_url(item.getString("detail_url"));
			shopInfo.setPic_url(item.getString("pic_url"));
			shopInfo.setTitle(item.getString("title"));
			shopInfo.setNum_iid(item.getString("num_iid"));
			shopInfo.setPrice(Double.valueOf(item.getDouble("price")));
			shopInfo.setNum(Integer.valueOf(item.getString("num")));
			shopInfo.setNick(item.getString("nick"));
			shopInfo.setList_time(item.getString("list_time"));
			shopInfo.setDelist_time(item.getString("delist_time"));
			shopInfo.setLocation(location.getString("state")+"-"+location.getString("city"));
			shopInfo.setModified(item.getString("modified"));
			
			shopInfo.setValid_thru(item.getInt("valid_thru"));
			shopInfo.setFreight_payer(item.getString("freight_payer"));
			shopInfo.setHas_discount(item.getBoolean("has_discount"));
			log.info(shopInfo.toString());
		} catch (JSONException e) {
			log.error(e);
			return null;
		}  
		return shopInfo;
	}
	
	/**
	 * 根据卖家昵称获取卖家店铺基本信息
	 * @param nick
	 * @return
	 */
	public static JSONObject getSeller(String nick){
		ShopGetRequest req=new ShopGetRequest();
		req.setFields("sid,cid,title,nick,desc,bulletin,pic_path,created,modified");
		req.setNick(nick);
		String context = null;
		try {
			ShopGetResponse response = client.execute(req);
			context = response.getBody();
		} catch (ApiException e) {
			e.printStackTrace();
		}
		JSONObject a=null;
			try {
				a = new JSONObject(context);
				JSONObject s = (JSONObject)a.get("shop_get_response");
				JSONObject item = (JSONObject)s.get("shop");
				return item;
			} catch (JSONException e) {
				e.printStackTrace();
			}
			return null;
			
	}
	//商品分类
	public static void shopClassification(){
		SellercatsListGetRequest req=new SellercatsListGetRequest();
		req.setNick("爱情海旗舰店");
		try {
			SellercatsListGetResponse response = client.execute(req);//上架自定义分类
			List<SellerCat> seller = response.getSellerCats();
			for(SellerCat cat : seller){
				System.out.println(cat.getName()+"/"+cat.getSortOrder());
			}
			
		} catch (ApiException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]){
		shopDeitals(19127401164L);
		//shopClassification();
	}
}
