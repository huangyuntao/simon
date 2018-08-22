package com.hyt.simon.util;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 获取web服务器相关信息
 */
@Component
public class WebServerInfoUtil implements ApplicationListener<WebServerInitializedEvent>  {
    private static WebServerInitializedEvent event;
    
    @Override
	public void onApplicationEvent(WebServerInitializedEvent event) {
    	WebServerInfoUtil.event=event;
	}
    /**
     * 获取服务器端口
     * @return
     */
    public static int getPort() {
        int port = event.getWebServer().getPort();
        return port;
    }
    /**
     * 获取服务器IP
     * @return
     */
    public static String getHostAddress() {
    	String hostAddress=null;
		try {
			hostAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
    	return hostAddress;
    }
    /**
     * 获取服务器计算机名称
     * @return
     */
    public static String getHostName() {
    	String hostName=null;
		try {
			hostName = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
    	return hostName;
    }
}
