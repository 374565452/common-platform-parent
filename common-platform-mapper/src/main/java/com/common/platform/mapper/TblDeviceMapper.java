package com.common.platform.mapper;

import com.common.platform.model.TblDevice;
import com.common.platform.model.TblDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblDeviceMapper {
    int countByExample(TblDeviceExample example);

    int deleteByExample(TblDeviceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblDevice record);

    int insertSelective(TblDevice record);

    List<TblDevice> selectByExample(TblDeviceExample example);

    TblDevice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblDevice record, @Param("example") TblDeviceExample example);

    int updateByExample(@Param("record") TblDevice record, @Param("example") TblDeviceExample example);

    int updateByPrimaryKeySelective(TblDevice record);

    int updateByPrimaryKey(TblDevice record);
}