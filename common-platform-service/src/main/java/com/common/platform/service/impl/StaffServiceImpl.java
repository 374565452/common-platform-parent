package com.common.platform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.platform.mapper.TblStaffMapper;
import com.common.platform.model.TblStaff;
import com.common.platform.model.TblStaffExample;
import com.common.platform.model.TblStaffExample.Criteria;
import com.common.platform.service.IStaffService;
import com.common.platform.utils.dto.PageDto;
import com.common.platform.utils.dto.PageModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StaffServiceImpl implements IStaffService{

	@Autowired
	private TblStaffMapper mapper;
	
	@Override
	public List<TblStaff> getAllStaff() {
		TblStaffExample example=new TblStaffExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(0);
		example.setOrderByClause("id asc");
		List<TblStaff> list = mapper.selectByExample(example);
		if(list != null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public PageDto<TblStaff> getPageStaff(int page) {
		TblStaffExample example=new TblStaffExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(0);
		
		PageModel model=new PageModel();
		PageHelper.startPage(page, model.getPageSize());
		example.setOrderByClause("id asc");
		
		List<TblStaff> list = mapper.selectByExample(example);
		if(list != null && list.size()>0){
			PageDto<TblStaff> dto=new PageDto<>();
			model.setCurrentPage(page);
			PageInfo<TblStaff> infos=new PageInfo<>(list);
			model.setAllRecorder(infos.getTotal());
			dto.setData(list);
			dto.setModel(model);
			return dto;
			//return list;
		}
		return null;
	}

}
