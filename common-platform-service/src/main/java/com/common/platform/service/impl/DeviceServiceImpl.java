package com.common.platform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.platform.dto.DeviceModelEx;
import com.common.platform.mapper.ex.TblDeviceExMapper;
import com.common.platform.service.IDeviceService;
import com.common.platform.utils.dto.PageDto;
import com.common.platform.utils.dto.PageModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class DeviceServiceImpl implements IDeviceService{

	@Autowired
	private TblDeviceExMapper exMapper;
	
	@Override
	public PageDto<DeviceModelEx> getPageDevice(int page) {
		
		PageModel model=new PageModel();
		PageHelper.startPage(page, model.getPageSize());
		
		List<DeviceModelEx> list = exMapper.selectDetailDevice();
		if(list !=null && list.size()>0){
			model.setCurrentPage(page);
			PageDto<DeviceModelEx> dto=new PageDto<>();
			PageInfo<DeviceModelEx> infos=new PageInfo<>(list);
			model.setAllRecorder(infos.getTotal());
			
			dto.setData(list);
			dto.setModel(model);
			return dto;
			
		}
		return null;
	}

	@Override
	public PageDto<DeviceModelEx> getPageDeviceByCode(int page,String code) {
		PageModel model=new PageModel();
		PageHelper.startPage(page, model.getPageSize());
		
		List<DeviceModelEx> list = exMapper.searchDetailDeviceByCode(code);
		if(list !=null && list.size()>0){
			model.setCurrentPage(page);
			PageDto<DeviceModelEx> dto=new PageDto<>();
			PageInfo<DeviceModelEx> infos=new PageInfo<>(list);
			model.setAllRecorder(infos.getTotal());
			
			dto.setData(list);
			dto.setModel(model);
			return dto;
			
		}
		return null;
	}

}
