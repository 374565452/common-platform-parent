package com.common.platform.service;

import java.util.List;

import com.common.platform.model.TblStaff;
import com.common.platform.utils.dto.PageDto;

public interface IStaffService {

	public List<TblStaff> getAllStaff();
	
	public PageDto<TblStaff> getPageStaff(int page);
	
	public List<TblStaff> getAllStaff(String like);
	
	public PageDto<TblStaff> getSearchStaff(int page,String lik);
	
}
