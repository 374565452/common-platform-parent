package com.common.platform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.platform.mapper.TblDistrictMapper;
import com.common.platform.model.TblDistrict;
import com.common.platform.model.TblDistrictExample;
import com.common.platform.model.TblDistrictExample.Criteria;
import com.common.platform.service.IDistrictService;

@Service
public class DistrictServiceImpl implements IDistrictService {

	@Autowired
	private TblDistrictMapper mapper;
	
	@Override
	public List<TblDistrict> getAllDistrict() {
		TblDistrictExample example =new TblDistrictExample();
		System.out.println("bbbbbbdddddbbbbbbbbbbbbbbbbbbbb");
		try{
			List<TblDistrict> diss=mapper.selectByExample(example);
			System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			if(diss != null && diss.size()>0){
				return diss;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public TblDistrict findDistrictById(long id) {
		TblDistrictExample example =new TblDistrictExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		System.out.println(mapper+"-==========");
		List<TblDistrict> list = mapper.selectByExample(example);
		System.out.println(list.size() +"==================");
		return null;
	}

}
