package com.common.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.platform.dto.DeviceModelEx;
import com.common.platform.model.TblStaff;
import com.common.platform.service.IDeviceService;
import com.common.platform.service.IStaffService;
import com.common.platform.utils.dto.PageDto;

@Controller
@RequestMapping("/common/platform")
public class PageController extends BaseController{

	@Autowired 
	private IStaffService staffService;
	
	@Autowired
	private IDeviceService deviceService;
	
	@RequestMapping("/{page}")
	public String getPage(@PathVariable("page") String pa){
		if(pa.equals("c_user")){
			PageDto<TblStaff> dto = staffService.getPageStaff(1);
			request.setAttribute("staff", dto);
			setModel(dto);
			request.setAttribute("realPath", "common/platform/user");
			//setRealPath();
		}
		else if(pa.equals("c_device_list")){
			PageDto<DeviceModelEx> dto=deviceService.getPageDevice(1);
			request.setAttribute("device", dto);
			setModel(dto);
			//setRealPath();
			request.setAttribute("realPath", "common/platform/device");
		}
		return pa;
	}
	
}
