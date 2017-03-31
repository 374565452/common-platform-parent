package com.common.platform.mapper;

import com.common.platform.model.TblStaffRoleDis;
import com.common.platform.model.TblStaffRoleDisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblStaffRoleDisMapper {
    int countByExample(TblStaffRoleDisExample example);

    int deleteByExample(TblStaffRoleDisExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblStaffRoleDis record);

    int insertSelective(TblStaffRoleDis record);

    List<TblStaffRoleDis> selectByExample(TblStaffRoleDisExample example);

    TblStaffRoleDis selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblStaffRoleDis record, @Param("example") TblStaffRoleDisExample example);

    int updateByExample(@Param("record") TblStaffRoleDis record, @Param("example") TblStaffRoleDisExample example);

    int updateByPrimaryKeySelective(TblStaffRoleDis record);

    int updateByPrimaryKey(TblStaffRoleDis record);
}