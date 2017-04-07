package com.common.platform.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.common.platform.model.TblStaff;
import com.common.platform.model.TblUser;
import com.common.platform.service.IStaffService;
import com.common.platform.service.IUserService;

public class UserTest {

	@Test
	public void userT(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		
		//IUserService service=ac.getBean(IUserService.class);
		//List<TblUser> users=service.getAllUser();
		//System.out.println(users);
		IStaffService service=ac.getBean(IStaffService.class);
		List<TblStaff> list = service.getAllStaff("test");
		System.out.println(list.size());
	}
	
}
