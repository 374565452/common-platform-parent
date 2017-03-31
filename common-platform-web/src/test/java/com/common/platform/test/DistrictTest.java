package com.common.platform.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.common.platform.model.TblDistrict;
import com.common.platform.service.IDistrictService;

public class DistrictTest {

	@Test
	public void testDeleteByUid(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		
		IDistrictService ds=ac.getBean(IDistrictService.class);
		
		ds.findDistrictById(1);
		
		//List<TblDistrict> allDistrict = ds.getAllDistrict();
		//IDeviceService ds = ac.getBean(IDeviceService.class);
		//ds.deleteDeviceByUid("47f11795-17cf-483d-9de1-0ef3674c170e");
		//System.out.println(allDistrict.size());
		
		//Device d=ds.getDeviceByUid("47f11795-17cf-483d-9de1-0ef3674c170e");
		//System.out.println(d.getDeleted().toString());
		
	}
	
}
