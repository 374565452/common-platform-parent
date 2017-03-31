package com.common.platform.mapper;

import com.common.platform.model.TblModule;
import com.common.platform.model.TblModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblModuleMapper {
    int countByExample(TblModuleExample example);

    int deleteByExample(TblModuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblModule record);

    int insertSelective(TblModule record);

    List<TblModule> selectByExample(TblModuleExample example);

    TblModule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblModule record, @Param("example") TblModuleExample example);

    int updateByExample(@Param("record") TblModule record, @Param("example") TblModuleExample example);

    int updateByPrimaryKeySelective(TblModule record);

    int updateByPrimaryKey(TblModule record);
}