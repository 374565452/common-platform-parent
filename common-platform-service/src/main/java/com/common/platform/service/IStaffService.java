package com.common.platform.service;

import java.util.List;

import com.common.platform.model.TblStaff;
import com.common.platform.utils.dto.PageDto;

public interface IStaffService {

	public List<TblStaff> getAllStaff();
	
	public PageDto<TblStaff> getPageStaff(int page);
	
	/**
	 * 查询符合条件的所有用户信息
	 * @param like 条件
	 * @return
	 */
	public List<TblStaff> getAllStaff(String like);
	
	public PageDto<TblStaff> getSearchStaff(int page,String lik);
	
}
