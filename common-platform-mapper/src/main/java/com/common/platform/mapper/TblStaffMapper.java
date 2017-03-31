package com.common.platform.mapper;

import com.common.platform.model.TblStaff;
import com.common.platform.model.TblStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblStaffMapper {
    int countByExample(TblStaffExample example);

    int deleteByExample(TblStaffExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblStaff record);

    int insertSelective(TblStaff record);

    List<TblStaff> selectByExample(TblStaffExample example);

    TblStaff selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblStaff record, @Param("example") TblStaffExample example);

    int updateByExample(@Param("record") TblStaff record, @Param("example") TblStaffExample example);

    int updateByPrimaryKeySelective(TblStaff record);

    int updateByPrimaryKey(TblStaff record);
}