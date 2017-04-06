package com.common.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.platform.mapper.ex.TblDisLevelExMapper;
import com.common.platform.service.IDisLevelService;

@Service
public class DisLevelService implements IDisLevelService{
	
	@Autowired
	private TblDisLevelExMapper mapper;
	
	@Override
	public int findMaxLevel() {
		return mapper.maxId();
	}

}
