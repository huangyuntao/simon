package com.hyt.simon.util;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * 获取原生servletSession
	 * @return 
	 */
	public static HttpSession getSession(){
		HttpSession session = getServletRequestAttributes().getRequest().getSession();
		return session;
	}
	/**
	 * 获取原生servletContext
	 * @return 
	 */
	public static ServletContext getServletContext(){
		ServletContext servletContext = getServletRequestAttributes().getRequest().getServletContext();
		return servletContext;
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
	public static Object getAttributesFormRequest(String name) {
		return getServletRequestAttributes().getAttribute(name, RequestAttributes.SCOPE_REQUEST);
	}
	
	/**
	 * 向request域中放值
	 * @return
	 */
	public static void setAttributesToRequest(String name,Object value) {
		getServletRequestAttributes().setAttribute(name, value,RequestAttributes.SCOPE_REQUEST);
	}
	/**
	 * 从session域中获取值
	 * @return
	 */
	public static Object getAttributesFormSession(String name) {
		return getServletRequestAttributes().getAttribute(name, RequestAttributes.SCOPE_SESSION);
	}
	
	/**
	 * 向session域中放值
	 * @return
	 */
	public static void setAttributesToSession(String name,Object value) {
		getServletRequestAttributes().setAttribute(name, value,RequestAttributes.SCOPE_SESSION);
	}
}
