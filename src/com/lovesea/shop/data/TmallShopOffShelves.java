/**
 * 
 */
package com.lovesea.shop.data;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：TmallShopOffShelves   
 * 类描述：   天猫商品下架
 * 创建人：wangxun   
 * 创建时间：2013-8-29 上午11:19:32   
 * 修改人：wangxun   
 * 修改时间：2013-8-29 上午11:19:32   
 * 修改备注：   
 * @version    
 *    
 */
public class TmallShopOffShelves extends AbstractTmallShopDetail {

	/**
	 * @param url
	 */
	public TmallShopOffShelves(String url) {
		super(url);
	}
	@SuppressWarnings("static-access")
	@Override
	protected String executParse() {
		String regExp="detail:params=\"([\\s\\S]*?)\"";
		String context = getShopPageDetail();
		String str = this.getMatcherStr(context, regExp);
		return str;
	}

}
