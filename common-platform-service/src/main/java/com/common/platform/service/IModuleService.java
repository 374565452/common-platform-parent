package com.common.platform.service;

import java.util.List;

import com.common.platform.model.TblModule;
import com.common.platform.utils.dto.MenuInfo;

public interface IModuleService {

	public List<TblModule> getModuleByLevel(int level);
	
	public List<TblModule> getModuleByPid(long pid);
	
	public List<MenuInfo> getMenus();
	
}
