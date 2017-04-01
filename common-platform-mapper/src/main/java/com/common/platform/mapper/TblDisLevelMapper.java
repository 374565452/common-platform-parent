package com.common.platform.mapper;

import com.common.platform.model.TblDisLevel;
import com.common.platform.model.TblDisLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblDisLevelMapper {
    int countByExample(TblDisLevelExample example);

    int deleteByExample(TblDisLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblDisLevel record);

    int insertSelective(TblDisLevel record);

    List<TblDisLevel> selectByExample(TblDisLevelExample example);

    TblDisLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblDisLevel record, @Param("example") TblDisLevelExample example);

    int updateByExample(@Param("record") TblDisLevel record, @Param("example") TblDisLevelExample example);

    int updateByPrimaryKeySelective(TblDisLevel record);

    int updateByPrimaryKey(TblDisLevel record);
    
    int maxId();
}