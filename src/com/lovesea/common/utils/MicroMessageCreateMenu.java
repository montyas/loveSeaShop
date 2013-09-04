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
		String menu = getMenu();
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
	}
}
