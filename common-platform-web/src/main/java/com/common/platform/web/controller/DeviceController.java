package com.common.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.platform.dto.DeviceModelEx;
import com.common.platform.service.IDeviceService;
import com.common.platform.utils.dto.PageDto;

@Controller
@RequestMapping("/common/platform/device")
public class DeviceController extends BaseController{

	@Autowired
	private IDeviceService deviceService;
	
	
	
	@RequestMapping("/{page}")
	public String getDeviceModelByPage(@PathVariable("page")int page){
	
		//String savedDir = request.getSession().getServletContext().getRealPath("fileDir"); 
//System.out.println(savedDir+"=========================");
		String param=request.getParameter("search");
//System.out.println(param);		
		if(param == null){
			PageDto<DeviceModelEx> dto=deviceService.getPageDevice(page);
			request.setAttribute("device", dto);
			setModel(dto);
		}else{
			PageDto<DeviceModelEx> dto=deviceService.getPageDeviceByCode(page, param);
//System.out.println(dto.getData().size());
			request.setAttribute("device", dto);
			request.setAttribute("search", param);
			setModel(dto);
		}
		setRealPath();
		return "c_device_list";
	}
	
}
