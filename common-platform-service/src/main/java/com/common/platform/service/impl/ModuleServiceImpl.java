package com.common.platform.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.platform.mapper.TblModuleMapper;
import com.common.platform.model.TblModule;
import com.common.platform.model.TblModuleExample;
import com.common.platform.model.TblModuleExample.Criteria;
import com.common.platform.service.IModuleService;
import com.common.platform.utils.dto.MenuInfo;

@Service
public class ModuleServiceImpl implements IModuleService{

	@Autowired
	private TblModuleMapper mapper;
	
	@Override
	public List<TblModule> getModuleByLevel(int level) {
		TblModuleExample example=new TblModuleExample();
		Criteria criteria = example.createCriteria();
		criteria.andLevelEqualTo(level);
		example.setOrderByClause("order_no asc");
		
		List<TblModule> list = mapper.selectByExample(example);
		if(list != null && list.size()>0){
			return list;
		}
		
		return null;
	}

	@Override
	public List<TblModule> getModuleByPid(long pid) {
		TblModuleExample example=new TblModuleExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(pid);
		example.setOrderByClause("order_no asc");
		
		List<TblModule> list = mapper.selectByExample(example);
		if(list != null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public List<MenuInfo> getMenus() {
		List<TblModule> l1=getModuleByLevel(1);
		if(l1!=null && l1.size()>0){
			List<MenuInfo> menus=new ArrayList<>();
			for(TblModule m : l1){
				MenuInfo menu=new MenuInfo();
				menu.setIcon(m.getModuleIcon());
				menu.setMenuName(m.getModuleName());
				menu.setUrl(m.getModuleUrl());
				List<TblModule> child=getModuleByPid(m.getId());
				
				if(child != null && child.size()>0){
					List<MenuInfo> childMenus=new ArrayList<>();
					for(TblModule m2:child){
						MenuInfo menu2=new MenuInfo();
						menu2.setIcon(m2.getModuleIcon());
						menu2.setMenuName(m2.getModuleName());
						menu2.setUrl(m2.getModuleUrl());
						childMenus.add(menu2);
					}
					menu.setChildren(childMenus);
				}
				menus.add(menu);
			}
			
			return menus;
			
		}
		
		return null;
	}

}
