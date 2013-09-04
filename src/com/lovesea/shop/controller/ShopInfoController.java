/**
 * 
 */
package com.lovesea.shop.controller;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lovesea.common.tb.TbCore;
import com.lovesea.shop.bean.ShopInfo;
import com.lovesea.shop.bean.ShopOtherInfo;
import com.lovesea.shop.data.AbstractTmallShopDetail;
import com.lovesea.shop.data.TmallShopOffShelves;
import com.lovesea.shop.servers.IShopDetailServer;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：ShopInfoController   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-29 下午02:26:30   
 * 修改人：wangxun   
 * 修改时间：2013-8-29 下午02:26:30   
 * 修改备注：   
 * @version    
 *    
 */
@Controller
public class ShopInfoController {
	private final static Logger log = Logger.getLogger(ShopInfoController.class);
	private final static String URL="http://ext.mdskip.taobao.com/extension/dealRecords.htm?";
	@Resource
	private IShopDetailServer iShopServer;
	@RequestMapping(value="/url",method=RequestMethod.POST)
	@ResponseBody
	public String getUrl(String detail_url) throws Exception{
		 AbstractTmallShopDetail sd = new TmallShopOffShelves(detail_url);
		 return spitUrl(sd.getPageContext());
	}
	
	@RequestMapping(value="/shop",method=RequestMethod.POST)
	@ResponseBody
	public String getShopInfo(ShopOtherInfo otherInfo) throws Exception{
		String json = iShopServer.getShopInfo(otherInfo);
		log.info("json:"+json);
		return json;
	}
	
	private String spitUrl(String url){
		log.info("url"+url);
		if(StringUtils.isNotBlank(url)){
			url = url.replace(URL, "");
		}
		return url;
	}
}
