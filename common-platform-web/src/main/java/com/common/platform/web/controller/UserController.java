package com.common.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.platform.model.TblStaff;
import com.common.platform.service.IStaffService;
import com.common.platform.utils.dto.PageDto;

@Controller
@RequestMapping("/common/platform/user")
public class UserController extends BaseController{

	@Autowired
	private IStaffService staffService;
	
	@RequestMapping("/{page}")
	public String findUserByPage(@PathVariable("page") int page){
		
		PageDto<TblStaff> dto = staffService.getPageStaff(page);
		request.setAttribute("staff", dto);
		
		return "c_user";
	}
	
}
