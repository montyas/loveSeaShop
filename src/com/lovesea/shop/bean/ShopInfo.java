/**
 * 
 */
package com.lovesea.shop.bean;

/**   
 *    
 * 项目名称：calendarPush   
 * 类名称：ShopInfo   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-7 下午04:52:43   
 * 修改人：wangxun   
 * 修改时间：2013-8-7 下午04:52:43   
 * 修改备注：   
 * @version    
 *    
 */
public class ShopInfo {
	/**
	 * 商品id
	 */
	private String num_iid;
	/**
	 * 商品标题
	 */
	private String title;
	/**
	 * 商品URL
	 */
	private String detail_url;
	/**
	 * 商品库存
	 */
	private int num;
	/**
	 * 商品主图
	 */
	private String pic_url;
	/**
	 * 商品价格
	 */
	private double price;
	
	/**
	 * 所属店铺
	 * @return
	 */
	private String nick;
	/**
	 * 商品上架时间
	 * @return
	 */
	private String list_time;
	/**
	 * 商品下架时间
	 */
	private String delist_time;
	/**
	 * 商品所在地
	 * @return
	 */
	private String location;
	/**
	 * 上架有效期
	 */
	private int valid_thru;
	/**
	 * 运费承担方式,seller（卖家承担），buyer(买家承担）
	 * @return
	 */
	private String freight_payer;
	
	/**
	 * 是否支持会员打折
	 */
	private boolean has_discount;
	
	/**
	 * 商品最近修改时间
	 * @return
	 */
	private String modified;
	
	public String getNum_iid() {
		return num_iid;
	}
	public void setNum_iid(String num_iid) {
		this.num_iid = num_iid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail_url() {
		return detail_url;
	}
	public void setDetail_url(String detail_url) {
		this.detail_url = detail_url;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public String getList_time() {
		return list_time;
	}
	public void setList_time(String list_time) {
		this.list_time = list_time;
	}
	public String getDelist_time() {
		return delist_time;
	}
	public void setDelist_time(String delist_time) {
		this.delist_time = delist_time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getValid_thru() {
		return valid_thru;
	}
	public void setValid_thru(int valid_thru) {
		this.valid_thru = valid_thru;
	}
	
	public String getFreight_payer() {
		return freight_payer;
	}
	public void setFreight_payer(String freight_payer) {
		this.freight_payer = freight_payer;
	}
	public boolean isHas_discount() {
		return has_discount;
	}
	public void setHas_discount(boolean has_discount) {
		this.has_discount = has_discount;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	@Override
	public String toString() {
		return "ShopInfo [num_iid=" + num_iid + ", title=" + title
				+ ", detail_url=" + detail_url + ", num=" + num + ", pic_url="
				+ pic_url + ", price=" + price + ", nick=" + nick
				+ ", list_time=" + list_time + ", delist_time=" + delist_time
				+ ", location=" + location + ", valid_thru=" + valid_thru
				+ ", freight_payer=" + freight_payer + ", has_discount="
				+ has_discount + ", modified=" + modified + "]";
	}
}
