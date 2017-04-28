package com.common.platform.gateway.manager;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.common.platform.gateway.annotation.BroadcastBusiness;
import com.common.platform.utils.CommonClassUtils;

public class BusinessAndProtocolClassManager {

	public static Map<Short, Class<?>> businessClass;

	public static Map<Short, Class<?>> protocolClass;

	public static void initBusinessClass() throws ClassNotFoundException, IOException {
		String packageName = "com.common.platform.gateway.business";
		Map<Short, Class<?>> temp = new HashMap<>();
		Set<Class<?>> classes = CommonClassUtils.getBusinessClasses(packageName);
		if (classes != null) {
			for (Class<?> c : classes) {
				if (c.isAnnotationPresent(BroadcastBusiness.class)) {
					BroadcastBusiness annotation = c.getAnnotation(BroadcastBusiness.class);
					temp.put(annotation.broadcastCommand(), c);
				}
			}
		}
		businessClass=Collections.unmodifiableMap(temp);//指定映射的不可修改视图。此方法允许模块为用户提供对内部映射的“只读”访问。
	}

	public static void initProtocolTypeClass (){
		
	}
	
	public static Class<?> getBusinessClass(short command) {
		if (businessClass != null && businessClass.containsKey(command)) {
			return businessClass.get(command);
		} else {
			return null;
		}
	}

	public static Class<?> getProtocolClass(short command) {
		if (protocolClass != null && protocolClass.containsKey(command)) {
			return protocolClass.get(command);
		} else {
			return null;
		}
	}

}
