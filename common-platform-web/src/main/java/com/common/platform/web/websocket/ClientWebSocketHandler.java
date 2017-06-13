package com.common.platform.web.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

@Component
public class ClientWebSocketHandler implements WebSocketHandler{

	@Override
	public void afterConnectionClosed(WebSocketSession arg0, CloseStatus arg1) throws Exception {
		//客户端退出时，执行此函数
System.out.println("close a web client -------------");
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		//客户端连接后，执行此函数
System.out.println("connect a web client ----------");
		session.sendMessage(new TextMessage("web Socket test !"));
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> msg) throws Exception {
		//在此函数中，处理数据接收
System.out.println("recv the data from the web client -------");
		System.out.println(msg.getPayload().toString());
	}

	@Override
	public void handleTransportError(WebSocketSession arg0, Throwable arg1) throws Exception {
		//数据发送失败后，执行此函数
	}

	@Override
	public boolean supportsPartialMessages() {
		return false;
	}

}
