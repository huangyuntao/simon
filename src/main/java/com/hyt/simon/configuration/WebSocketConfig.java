package com.hyt.simon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class WebSocketConfig {
	/**
	 * serverEndpointExporter
	 * 这个bean会自动注册使用了@ServerEndpoint注解声明的Websocket endpoint
	 * @return
	 */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}