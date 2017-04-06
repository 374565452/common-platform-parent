package com.common.platform.mapper.ex;

import com.common.platform.dto.DistrictDto;

public interface TblDistrictExMapper {
    
    DistrictDto selectQualiedDistrict(long id);
}