package com.common.platform.mapper;

import com.common.platform.model.TblDistrict;
import com.common.platform.model.TblDistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblDistrictMapper {
    int countByExample(TblDistrictExample example);

    int deleteByExample(TblDistrictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblDistrict record);

    int insertSelective(TblDistrict record);

    List<TblDistrict> selectByExample(TblDistrictExample example);

    TblDistrict selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblDistrict record, @Param("example") TblDistrictExample example);

    int updateByExample(@Param("record") TblDistrict record, @Param("example") TblDistrictExample example);

    int updateByPrimaryKeySelective(TblDistrict record);

    int updateByPrimaryKey(TblDistrict record);
}