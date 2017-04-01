package com.common.platform.service;

import java.util.List;

import com.common.platform.model.TblDistrict;
import com.common.platform.utils.dto.ZTreeNode;

public interface IDistrictService {
	
	public List<TblDistrict> getAllDistrict();
	
	public TblDistrict findDistrictById(long id);
	
	public List<TblDistrict> findDistrictsByPid(long pid);
	
	public void queryDistrictTree(List<ZTreeNode> nodes);
}
