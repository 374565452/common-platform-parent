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
		String param=request.getParameter("search");
		//System.out.println(param);
		if(param == null){
			PageDto<TblStaff> dto = staffService.getPageStaff(page);
			request.setAttribute("staff", dto);
			setModel(dto);
		}else{
			PageDto<TblStaff> dto = staffService.getSearchStaff(page, param);
//System.out.println(dto.getData().size()+"=="+param +"=="+dto.getModel().getTotalPage());
			request.setAttribute("staff", dto);
			request.setAttribute("search", param);
			setModel(dto);
		}
		setRealPath();
		return "c_user";
	}
	
}
