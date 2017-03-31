package com.common.platform.service;

import java.util.List;

import com.common.platform.model.TblDistrict;

public interface IDistrictService {
	
	public List<TblDistrict> getAllDistrict();
	
	public TblDistrict findDistrictById(long id);
	
}
