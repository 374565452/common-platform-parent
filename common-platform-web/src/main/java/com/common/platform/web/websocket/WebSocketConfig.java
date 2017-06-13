package com.common.platform.web.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.HandshakeInterceptor;

/**
 * 在spring中注册websocket服务
 * @author Administrator
 *
 */
@Configuration
@Component
@EnableWebMvc
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer{

	@Autowired
	private HandshakeInterceptor webSocketHandshakeInterceptor;
	
	@Autowired
	private WebSocketHandler clientWebSocketHandler; 
	
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(clientWebSocketHandler, "/websocket")
				.addInterceptors(webSocketHandshakeInterceptor);
		registry.addHandler(clientWebSocketHandler, "/sockjs/websocket")
				.addInterceptors(webSocketHandshakeInterceptor).withSockJS();
	}

}
