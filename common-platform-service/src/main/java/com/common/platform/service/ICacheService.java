package com.common.platform.service;

import java.util.List;

import com.common.platform.utils.dto.MenuInfo;
import com.common.platform.utils.dto.ZTreeNode;

public interface ICacheService {

	public int getMaxDistrictLevel();
	
	public List<ZTreeNode> findDistrictTree();
	
	public void deleteDistrictTree();
	
	public List<MenuInfo> getMenuInfos();
	
}
