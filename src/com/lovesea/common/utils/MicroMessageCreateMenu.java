/**
 * 
 */
package com.lovesea.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.lovesea.message.bean.Button;
import com.lovesea.message.bean.Menu;
import com.lovesea.message.bean.ParentButton;
import com.lovesea.message.bean.SubButton;

/**
 * 
 * 项目名称：loveSeaShop 类名称：MicroMessageCreateMenu 类描述： 创建自定义菜单 创建人：wangxun
 * 创建时间：2013-9-4 下午04:04:24 修改人：wangxun 修改时间：2013-9-4 下午04:04:24 修改备注：
 * 
 * @version
 * 
 */
public class MicroMessageCreateMenu {
	private final static Logger log = Logger.getLogger(MicroMessageCreateMenu.class);
	
	/**
	 * 获得ACCESS_TOKEN
	* @Title: getAccess_token
	* @Description: 获得ACCESS_TOKEN
	* @param @return    设定文件
	* @return String    返回类型
	* @throws
	 */
	private static String getAccess_token(){  
	      String url = Constant.URL;
	      String accessToken = null;
	     try {
	            URL urlGet = new URL(url);
	            HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();    
	            http.setRequestMethod("GET");      //必须是get方式请求    
	            http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");    
	            http.setDoOutput(true);        
	            http.setDoInput(true);
	            System.setProperty("sun.net.client.defaultConnectTimeout", "30000");//连接超时30秒
	            System.setProperty("sun.net.client.defaultReadTimeout", "30000"); //读取超时30秒

	            http.connect();
	         
	            InputStream is =http.getInputStream();
	            int size =is.available();
	            byte[] jsonBytes =new byte[size];
	            is.read(jsonBytes);
	            String message=new String(jsonBytes,"UTF-8");
	             
	            JSONObject demoJson = new JSONObject(message);
	            accessToken = demoJson.getString("access_token");
	             
	            System.out.println(message);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	       return accessToken;
	    }

	public static void createMene() {
		String menu_url = Constant.CREATE_MENU_URL + getAccess_token();
		String menu =  getMenu();
		URL url = null;
		HttpURLConnection http = null;
		try {
			url = new URL(menu_url);
			http = (HttpURLConnection) url.openConnection();
			http.setRequestMethod("POST");
			http.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			http.setDoOutput(true);
			http.setDoInput(true);
			System.setProperty("sun.net.client.defaultConnectTimeout", "30000");// 连接超时30秒
			System.setProperty("sun.net.client.defaultReadTimeout", "30000"); // 读取超时30秒
			http.connect();
		} catch (Exception e) {
			log.error(e);
		}
		try {
			OutputStream os = http.getOutputStream();
			os.write(menu.getBytes("UTF-8"));// 传入参数
			os.flush();
			os.close();
			InputStream is = http.getInputStream();
			int size = is.available();
			byte[] jsonBytes = new byte[size];
			is.read(jsonBytes);
			String message = new String(jsonBytes, "UTF-8");
		} catch (MalformedURLException e) {
			log.error(e);
		} catch (IOException e) {
			log.error(e);
		}
	}
	
	private static String getMenu(){
		Map<String,Object> map = new HashMap<String,Object>();
		List<Map<String,Object>> listMap = new ArrayList<Map<String,Object>>();
		Map<String,Object> submap = new HashMap<String,Object>();
		submap.put("type", "click");
		submap.put("name", "新品推荐");
		submap.put("key", "V1001_TODAY_MUSIC");
		listMap.add(submap);
		
		submap = new HashMap<String,Object>();
		submap.put("type", "view");
		submap.put("name", "店铺首页");
		submap.put("url", "http://aiqinghai.m.tmall.com");
		listMap.add(submap);
		
		
		
		List<Map<String,Object>> sublistMap = new ArrayList<Map<String,Object>>();
		submap = new HashMap<String,Object>();
		submap.put("type", "click");
		submap.put("name", "品牌故事");
		submap.put("key", "V1001_HELLO_WORLD");
		sublistMap.add(submap);
		
		
		submap = new HashMap<String,Object>();
		submap.put("type", "click");
		submap.put("name", "售后保障");
		submap.put("key", "V1001_GOOD");
		sublistMap.add(submap);
		
		submap = new HashMap<String,Object>();
		submap.put("name", "关于我们");
		submap.put("sub_button", sublistMap);
		listMap.add(submap);
		
		map.put("button", listMap);
		
		JSONObject jobj = new JSONObject(map);
		return jobj.toString();
	}
	public static void main(String args[]){
		createMene();
		//JSONObject js =  new JSONObject(getNewMenu());
		//System.out.println(getNewMenu());
	}
	
	public static String getNewMenu(){
		SubButton sub11=new SubButton();
		sub11.setName("xxx");
		sub11.setType(Constant.CLICK_TYPE);
		sub11.setKey("LS_NEWS");
		
		SubButton sub12=new SubButton();
		sub12.setName("热销推荐");
		sub12.setType(Constant.CLICK_TYPE);
		sub12.setKey("LS_HOT");
		
		SubButton sub13=new SubButton();
		sub13.setName("猜你喜欢");
		sub13.setType(Constant.CLICK_TYPE);
		sub13.setKey("LS_LIKE");
		
		ParentButton sub1 = new ParentButton();
		sub1.setName("包包品类");
		sub1.setSub_button(new SubButton[]{sub11,sub12,sub13});
		
		SubButton sub21=new SubButton();
		sub11.setName("手提&单肩");
		sub11.setType(Constant.CLICK_TYPE);
		sub11.setKey("单肩&双肩");
		
		SubButton sub22=new SubButton();
		sub22.setName("单肩&双肩");
		sub22.setType(Constant.CLICK_TYPE);
		sub22.setKey("LS_HOT");
		
		SubButton sub23=new SubButton();
		sub23.setName("多功能包包");
		sub23.setType(Constant.CLICK_TYPE);
		sub23.setKey("LS_LIKE");
		
		ParentButton sub2 = new ParentButton();
		sub2.setName("包包类型");
		sub2.setSub_button(new SubButton[]{sub21,sub22,sub23});
		
		
		
		SubButton sub32=new SubButton();
		sub32.setName("店铺首页");
		sub32.setType(Constant.VIEW_TYPE);
		sub32.setKey("http://aiqinghai.m.tmall.com");
		
		SubButton sub31=new SubButton();
		sub31.setName("售后保障");
		sub31.setType(Constant.CLICK_TYPE);
		sub31.setKey("LS_SELLER");
		
		SubButton sub33=new SubButton();
		sub33.setName("品牌故事");
		sub33.setType(Constant.CLICK_TYPE);
		sub33.setKey("LS_BRAND_STORY");
		
		ParentButton sub3 = new ParentButton();
		sub3.setName("关于我们");
		sub3.setSub_button(new SubButton[]{sub31,sub32,sub33});
		
		 Menu menu = new Menu(); 
		 menu.setButton(new ParentButton[]{sub1,sub2,sub3});
		 
		 JSONObject js =  new JSONObject(menu);
		return js.toString();
	}
}
