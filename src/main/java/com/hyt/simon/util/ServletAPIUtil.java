package com.hyt.simon.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class ServletAPIUtil {
	/**
	 * 获取原生servletRequest
	 * @return 
	 */
	public static HttpServletRequest getRequest(){
		HttpServletRequest request = getServletRequestAttributes().getRequest();
		return request;
	}
	
	/**
	 * 获取原生servletResponse
	 * @return 
	 */
	public static HttpServletResponse getResponse(){
		HttpServletResponse response = getServletRequestAttributes().getResponse();
		return response;
	}
	
	/**
	 * 获取持有上下文的Request容器
	 * @return
	 */
	public static ServletRequestAttributes getServletRequestAttributes() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return requestAttributes;
	}
	/**
	 * 从request域中获取值
	 * @return
	 */
	public static Object getAttributesInRequest(String name) {
		return getServletRequestAttributes().getAttribute(name, RequestAttributes.SCOPE_REQUEST);
	}
	
	/**
	 * 从session域中获取值
	 * @return
	 */
	public static Object getAttributesInSession(String name) {
		return getServletRequestAttributes().getAttribute(name, RequestAttributes.SCOPE_SESSION);
	}
	
}
