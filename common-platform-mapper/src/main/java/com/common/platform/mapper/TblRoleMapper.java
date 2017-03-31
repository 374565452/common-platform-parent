package com.common.platform.mapper;

import com.common.platform.model.TblRole;
import com.common.platform.model.TblRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRoleMapper {
    int countByExample(TblRoleExample example);

    int deleteByExample(TblRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblRole record);

    int insertSelective(TblRole record);

    List<TblRole> selectByExample(TblRoleExample example);

    TblRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblRole record, @Param("example") TblRoleExample example);

    int updateByExample(@Param("record") TblRole record, @Param("example") TblRoleExample example);

    int updateByPrimaryKeySelective(TblRole record);

    int updateByPrimaryKey(TblRole record);
}