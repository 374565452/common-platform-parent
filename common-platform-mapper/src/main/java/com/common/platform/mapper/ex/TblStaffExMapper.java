package com.common.platform.mapper.ex;

import java.util.List;

import com.common.platform.model.TblStaff;

public interface TblStaffExMapper {

	public List<TblStaff> searchByName(String param);
	
}
