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
public class ShopOtherInfo {
	
	/**
	 * 宝贝id
	 */
	private long item_id;
	/**
	 * 宝贝上架时间
	 * @return
	 */
	private long starts;
	
	/**
	 * 宝贝下架时间
	 * @return
	 */
	private long ends;
	
	/**
	 * 宝贝总销量
	 * @return
	 */
	
	private int totalSQ;
	
	/**
	 * 店铺id
	 * @return
	 */
	
	private int seller_num_id;
	public long getItem_id() {
		return item_id;
	}

	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}

	public long getStarts() {
		return starts;
	}

	public void setStarts(long starts) {
		this.starts = starts;
	}

	public long getEnds() {
		return ends;
	}

	public void setEnds(long ends) {
		this.ends = ends;
	}

	public int getTotalSQ() {
		return totalSQ;
	}

	public void setTotalSQ(int totalSQ) {
		this.totalSQ = totalSQ;
	}

	public int getSeller_num_id() {
		return seller_num_id;
	}

	public void setSeller_num_id(int seller_num_id) {
		this.seller_num_id = seller_num_id;
	}
}
