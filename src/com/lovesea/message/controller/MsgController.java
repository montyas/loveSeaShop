/**
 * 
 */
package com.lovesea.message.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lovesea.message.core.ResCore;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：MsgController   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-7-30 下午03:33:53   
 * 修改人：wangxun   
 * 修改时间：2013-7-30 下午03:33:53   
 * 修改备注：   
 * @version    
 *    
 */
@Controller
public class MsgController {
	private final static Logger log = Logger.getLogger(MsgController.class);
	
	@SuppressWarnings("unused")
	@RequestMapping(value="/msg",method=RequestMethod.GET)
	public void signature(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String signature = request.getParameter("signature");//微信加密签名 
		String timestamp = request.getParameter("timestamp");//时间戳
		String nonce = request.getParameter("nonce");//随机数 
		String echostr = request.getParameter("echostr");//随机子字符串
		//返回echostr给微信,微信才确定服务正常
		response.getWriter().print(echostr);
		log.info("echostr:"+echostr);
	}
	@RequestMapping(value="/msg",method=RequestMethod.POST)
	public void msg(HttpServletRequest request,HttpServletResponse response) throws Exception{
		 request.setCharacterEncoding("UTF-8");  
		 response.setCharacterEncoding("UTF-8"); 
		//处理微信请求
		String responseXML=ResCore.processRequest(request);
		log.info("responseXML:"+responseXML);
		response.getWriter().println(responseXML);
	}
}
