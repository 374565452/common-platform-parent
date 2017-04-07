package com.common.platform.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.platform.mapper.TblRoleMapper;
import com.common.platform.model.TblRole;
import com.common.platform.model.TblRoleExample;
import com.common.platform.model.TblRoleExample.Criteria;
import com.common.platform.service.IRoleService;
import com.common.platform.utils.dto.ZTreeNode;

@Service
public class RoleServiceImpl implements IRoleService{

	@Autowired
	private TblRoleMapper mapper;
	
	@Override
	public List<TblRole> getAvailableRole() {
		TblRoleExample example=new TblRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(0);
		List<TblRole> list = mapper.selectByExample(example);
		if(list != null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public List<ZTreeNode> getRoleTree() {
		List<TblRole> role = getAvailableRole();
		if(role != null && role.size()>0){
			List<ZTreeNode> nodes=new ArrayList<>();
			ZTreeNode n=new ZTreeNode();
			n.setId(0);
			n.setName("角色");
			n.setIsParent(true);
			n.setpId(null);
			nodes.add(n);
			for(TblRole r :role){
				ZTreeNode zn=new ZTreeNode();
				zn.setId(r.getId());
				zn.setName(r.getRoleName());
				zn.setIsParent(false);
				zn.setpId(n.getId());
				nodes.add(zn);
			}
			return nodes;
		}
		return null;
	}

}
