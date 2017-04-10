package com.common.platform.mapper;

import com.common.platform.model.TblDeviceType;
import com.common.platform.model.TblDeviceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblDeviceTypeMapper {
    int countByExample(TblDeviceTypeExample example);

    int deleteByExample(TblDeviceTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblDeviceType record);

    int insertSelective(TblDeviceType record);

    List<TblDeviceType> selectByExample(TblDeviceTypeExample example);

    TblDeviceType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblDeviceType record, @Param("example") TblDeviceTypeExample example);

    int updateByExample(@Param("record") TblDeviceType record, @Param("example") TblDeviceTypeExample example);

    int updateByPrimaryKeySelective(TblDeviceType record);

    int updateByPrimaryKey(TblDeviceType record);
}