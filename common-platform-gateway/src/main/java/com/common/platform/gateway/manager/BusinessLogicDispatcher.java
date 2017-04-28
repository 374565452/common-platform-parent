package com.common.platform.gateway.manager;

import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.common.platform.gateway.business.BusinessLogicBase;
import com.common.platform.gateway.coder.BroadcastProtocol;

/**
 * 业务处理逻辑分发器
 *
 */
public class BusinessLogicDispatcher {
	
	public static final int MAX_THREAD_NUM= 2*Runtime.getRuntime().availableProcessors();
	
	//
	public static ExecutorService service =
			Executors.newFixedThreadPool(MAX_THREAD_NUM);
	
	public static void submit(BroadcastSession session, BroadcastProtocol protocol) 
			throws Exception {
		
		//RequestMsgBase msg = (RequestMsgBase) msgObject;
		
		/*
		 * 反射原理下，无参（默认构造函数动态创建对象）
		 * BusinessLogicExecutorBase executor = 
				(BusinessLogicExecutorBase) executorClass.newInstance();
		executor.setChannel(channel);
		executor.setMsgObject(msgObject);
		*/
		/**
		 *此处代码，在调试过程中出现异常，没有定义两参数的构造函数
		 *因为子类继承父类时，虽然父类有两个参数的构造函数，但是子类中同样也是需要两个参数的构造函数才可以用下面的方式
		 *来动态创建对象。
		 *如果不想在子类中，还需要写同样的构造方法，可以用以上的方式来解决，通过set属性的方式来传值
		 */
		/*Class<?> executorClass = BusinessAndProtocolClassManager.getBusinessClass(protocol.getCommand());
		try {
			Constructor<?> constructor = executorClass.getDeclaredConstructor(new Class[]{BroadcastSession.class,BroadcastProtocol.class});
			BusinessLogicBase executor =(BusinessLogicBase)constructor.newInstance(new Object[]{session,protocol});
			service.submit(executor);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		call(session,protocol,protocol.getCommand());
	}
	
	private static void call(BroadcastSession session ,BroadcastProtocol protocol, short command) throws Exception{
		short c=command;
		if(protocol!=null){
			c=protocol.getCommand();
		}
		Class<?> executorClass = BusinessAndProtocolClassManager.getBusinessClass(c);
		BusinessLogicBase executor = 
				(BusinessLogicBase) executorClass.newInstance();
		executor.setSession(session);
		executor.setProtocol(protocol);
		service.submit(executor);
	}
	
	public static void submit(BroadcastSession session,short command) throws Exception{
		/*Class<?> executorClass = BusinessAndProtocolClassManager.getBusinessClass(command);
		BusinessLogicBase executor = 
				(BusinessLogicBase) executorClass.newInstance();
		executor.setSession(session);
		service.submit(executor);*/
		call(session,null,command);
	}
	
}
