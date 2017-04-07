package com.common.platform.service;

import java.util.List;

import com.common.platform.model.TblRole;
import com.common.platform.utils.dto.ZTreeNode;

public interface IRoleService {

	public List<TblRole> getAvailableRole();
	
	public List<ZTreeNode> getRoleTree();
	
}
