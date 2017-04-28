package com.common.platform.gateway.manager;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BroadcastSessionManager {

	private static Map<Integer, BroadcastSession> sessionManager = new ConcurrentHashMap<>();

	public BroadcastSession getSession(Integer key) {
		if (sessionManager != null && sessionManager.containsKey(key)) {
			return sessionManager.get(key);
		}
		return null;
	}

	public void putSession(Integer key, BroadcastSession session) {
		sessionManager.put(key, session);
	}

	public BroadcastSession removeSession(Integer key) {
		BroadcastSession session = null;
		if (sessionManager.containsKey(key)) {
			session = sessionManager.remove(key);
		}
		return session;
	}

	private static class LazyHolder {
		private static final BroadcastSessionManager INSTANCE = new BroadcastSessionManager();
	}

	public static BroadcastSessionManager getInstance() {
		return LazyHolder.INSTANCE;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("current size is ");
		buffer.append(sessionManager.size());
		return buffer.toString();
	}

}
