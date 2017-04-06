package com.common.platform.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.platform.service.ICacheService;
import com.common.platform.service.IModuleService;
import com.common.platform.utils.JsonResult;
import com.common.platform.utils.dto.MenuInfo;

@Controller
@RequestMapping("/common/platform/module")
public class ModuleController extends BaseController{

	@Autowired
	private ICacheService cacheService;
	
	@Autowired
	private IModuleService moduleService;
	
	@RequestMapping("/menu")
	@ResponseBody
	public JsonResult getHomeMenu(){
		List<MenuInfo> menus=cacheService.getMenuInfos();
		return onResult(menus, 500, "菜单初始化失败");
	}
	
}
