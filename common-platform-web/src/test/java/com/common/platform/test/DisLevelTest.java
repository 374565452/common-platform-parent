package com.common.platform.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.common.platform.service.IDisLevelService;

public class DisLevelTest {

	@Test
	public void disLevelMaxTest() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");

		IDisLevelService ds = ac.getBean(IDisLevelService.class);
		System.out.println(ds.findMaxLevel());
	}

}
