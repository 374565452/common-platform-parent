package com.common.platform.service;

import com.common.platform.dto.DeviceModelEx;
import com.common.platform.utils.dto.PageDto;

public interface IDeviceService {

	public PageDto<DeviceModelEx> getPageDevice(int page);
	
	public PageDto<DeviceModelEx> getPageDeviceByCode(int page,String code);
	
}
