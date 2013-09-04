/**
 * 
 */
package com.lovesea.message.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.lovesea.message.dao.IShopDao;
import com.lovesea.shop.bean.ShopInfo;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：ShopDaoImpl   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-9 下午05:39:07   
 * 修改人：wangxun   
 * 修改时间：2013-8-9 下午05:39:07   
 * 修改备注：   
 * @version    
 *    
 */
@Repository
public class ShopDaoImpl implements IShopDao {
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	public void addShopInfo(ShopInfo shopInfo) {
		sqlMapClientTemplate.insert("addShopInfo", shopInfo);
	}

	@SuppressWarnings("unchecked")
	public List<ShopInfo> queryShopClassification(int typeId) {
		return sqlMapClientTemplate.queryForList("queryShopClassification", typeId);
	}
}
