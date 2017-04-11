package com.common.platform.mapper.ex;

import java.util.List;

import com.common.platform.dto.DeviceModelEx;

public interface TblDeviceExMapper {
    public List<DeviceModelEx> selectDetailDevice();
    
    public List<DeviceModelEx> searchDetailDeviceByCode(String param);
    
}