package com.common.platform.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.common.platform.dto.DeviceModelEx;
import com.common.platform.service.IDeviceService;
import com.common.platform.utils.dto.PageDto;

public class DeviceTest {

	@Test
	public void testDetailDevice(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		IDeviceService ds=ac.getBean(IDeviceService.class);
		
		//PageDto<DeviceModelEx> dto=ds.getPageDevice(1);
		PageDto<DeviceModelEx> dto=ds.getPageDeviceByCode(1, "1");
		System.out.println(dto.getData().size());
		System.out.println(dto.getModel().getTotalPage());
		System.out.println(dto.getModel().getAllRecorder());
		
	}
	
}
