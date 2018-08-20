package com.hyt.simon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hyt.simon.interceptor.LoginInterceptor;

/**
 * 将拦截器注册到项目中
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer{
	
	 @Bean
    public LoginInterceptor getLoginInterceptor() {
        return new LoginInterceptor();
    }
	
    @Override
    public void addInterceptors(InterceptorRegistry registry){
    	//登录拦截器
        registry.addInterceptor(getLoginInterceptor())
        		.addPathPatterns("/**")
        		.excludePathPatterns("/","/ok","/webSocket/test","/css/**","/plugs/**","/js/**","/img/**","/download/**","/admin/**");
    }
}