/**
 * 
 */
package com.lovesea.common.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**   
 *    
 * 项目名称：loveSeaShop   
 * 类名称：SystemInterceptor   
 * 类描述：   
 * 创建人：wangxun   
 * 创建时间：2013-8-9 下午05:55:49   
 * 修改人：wangxun   
 * 修改时间：2013-8-9 下午05:55:49   
 * 修改备注：   
 * @version    
 *    
 */
@Component
public class SystemInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession(false);
		if(session==null || session.getAttribute(Constant.ACCOUNT_KEY)==null){
			request.getRequestDispatcher("./index").forward(request, response);
			return false;
		}
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}
}
