package com.common.platform.mapper;

import com.common.platform.model.TblRoleModule;
import com.common.platform.model.TblRoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRoleModuleMapper {
    int countByExample(TblRoleModuleExample example);

    int deleteByExample(TblRoleModuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblRoleModule record);

    int insertSelective(TblRoleModule record);

    List<TblRoleModule> selectByExample(TblRoleModuleExample example);

    TblRoleModule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblRoleModule record, @Param("example") TblRoleModuleExample example);

    int updateByExample(@Param("record") TblRoleModule record, @Param("example") TblRoleModuleExample example);

    int updateByPrimaryKeySelective(TblRoleModule record);

    int updateByPrimaryKey(TblRoleModule record);
}