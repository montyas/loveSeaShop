package com.lovesea.message.bean.req;

/**
 * 
 */

import com.lovesea.message.bean.req.ReqBaseMsg;

/**   
 *    
 * 项目名称：calendarPush   
 * 类名称：ReqLocationMsg   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-7-30 下午05:39:27   
 * 修改人：wangxun   
 * 修改时间：2013-7-30 下午05:39:27   
 * 修改备注：   
 * @version    
 *    
 */
public class ReqLocationMsg extends ReqBaseMsg {
	private double location_X;//地理位置纬度
	private double location_Y;//地理位置经度 
	private int scale;//地图缩放大小
	private String label;//地理位置信息 
	public double getLocation_X() {
		return location_X;
	}
	public void setLocation_X(double location_X) {
		this.location_X = location_X;
	}
	public double getLocation_Y() {
		return location_Y;
	}
	public void setLocation_Y(double location_Y) {
		this.location_Y = location_Y;
	}
	public int getScale() {
		return scale;
	}
	public void setScale(int scale) {
		this.scale = scale;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
