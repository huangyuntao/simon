package com.hyt.simon.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor  implements HandlerInterceptor{  
  
    private static final Logger log = LogManager.getLogger(LoginInterceptor.class);  
  
    /** 
     * 进入controller层之前拦截请求 
     * @param httpServletRequest 
     * @param httpServletResponse 
     * @param o 
     * @return 
     * @throws Exception 
     */  
    @Override  
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {  
  
        log.info("---------------------开始进入请求地址拦截----------------------------");  
        HttpSession session = httpServletRequest.getSession();  
        if(!StringUtils.isEmpty(session.getAttribute("userName"))){  
            return true;  
        }  
        else{  
            PrintWriter printWriter = httpServletResponse.getWriter();  
            printWriter.write("{code:0,message:\"session is invalid,please login again!\"}");  
            return false;  
        }  
  
    }  
  
    @Override  
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {  
        log.info("--------------处理请求完成后视图渲染之前的处理操作---------------");  
    }  
  
    @Override  
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {  
        log.info("---------------视图渲染之后的操作-------------------------0");  
    }  
}  
