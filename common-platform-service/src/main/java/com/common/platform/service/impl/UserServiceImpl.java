package com.common.platform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.platform.mapper.TblUserMapper;
import com.common.platform.model.TblUser;
import com.common.platform.model.TblUserExample;
import com.common.platform.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private TblUserMapper userMapper;
	
	
	@Override
	public List<TblUser> getAllUser() {
		TblUserExample example=new TblUserExample();
		List<TblUser> list = userMapper.selectByExample(example);
		if(list !=null && list.size()>0){
			return list;
		}
		return null;
	}
	
}
