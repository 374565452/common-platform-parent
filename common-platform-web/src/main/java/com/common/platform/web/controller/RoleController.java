package com.common.platform.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.platform.service.ICacheService;
import com.common.platform.service.IModuleService;
import com.common.platform.service.IRoleService;
import com.common.platform.utils.JsonResult;
import com.common.platform.utils.dto.MenuInfo;
import com.common.platform.utils.dto.ZTreeNode;

@Controller
@RequestMapping("/common/platform/role")
public class RoleController extends BaseController{

	@Autowired
	private IRoleService roleService;
	
	@Autowired
	private IModuleService moduleService;
	
	@Autowired
	
	private ICacheService cacheService;
	
	@RequestMapping("/all")
	@ResponseBody
	public JsonResult getAllAvailableRole(){
		//List<MenuInfo> menuInfos = cacheService.getMenuInfos();
		//request.setAttribute("menuInfo", menuInfos);
		//List<TblRole> roles = roleService.getAvailableRole();
		List<ZTreeNode> tree = roleService.getRoleTree();
		return onResult(tree, 500, "获取角色失败！");
	}
	
	@RequestMapping("/auth/{id}")
	@ResponseBody
	public JsonResult getAuth(@PathVariable("id")long id){
		List<MenuInfo> menuInfos = cacheService.getMenuInfos();
		return onResult(menuInfos, 500, "获取角色拥有权限失败！");
	}
	
}
