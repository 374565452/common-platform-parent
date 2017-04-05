package com.common.platform.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.platform.mapper.TblDistrictMapper;
import com.common.platform.model.TblDistrict;
import com.common.platform.model.TblDistrictExample;
import com.common.platform.model.TblDistrictExample.Criteria;
import com.common.platform.service.ICacheService;
import com.common.platform.service.IDistrictService;
import com.common.platform.utils.dto.LazyTreeNode;
import com.common.platform.utils.dto.ZTreeNode;

@Service
public class DistrictServiceImpl implements IDistrictService {

	@Autowired
	private TblDistrictMapper mapper;
	
	@Autowired
	private ICacheService cacheService;
	
	@Override
	public List<TblDistrict> getAllDistrict() {
		TblDistrictExample example =new TblDistrictExample();
		//System.out.println("bbbbbbdddddbbbbbbbbbbbbbbbbbbbb");
		try{
			List<TblDistrict> diss=mapper.selectByExample(example);
			//System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
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
		//System.out.println(mapper+"-==========");
		List<TblDistrict> list = mapper.selectByExample(example);
		//System.out.println(list.size() +"==================");
		return null;
	}

	@Override
	public List<TblDistrict> findDistrictsByPid(long pid) {
		TblDistrictExample example =new TblDistrictExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(pid);
		List<TblDistrict> list=mapper.selectByExample(example);
		if(list != null && list.size()>0){
			return list;
		}
		return null;
	}

	
	public void queryDistrictTree(List<ZTreeNode> nodes){
System.out.println("-----district--------");
		List<TblDistrict> rootDis=findDistrictsByPid(0);
		if(rootDis != null){
System.out.println("---root district tree is "+rootDis.size());
			for(TblDistrict dis :rootDis){
				ZTreeNode r1=new ZTreeNode();
				r1.setId(dis.getId());
				r1.setpId(null);
				r1.setName(dis.getDisName());
				nodes.add(r1);
				
				if(dis.getAreaLevelId()< cacheService.getMaxDistrictLevel()){
					queryDistrictChildTree(nodes,dis.getId());
				}
				
			}
		}else{
			//数据库中没有相应的区域树
		}
	}
	
	private void queryDistrictChildTree(List<ZTreeNode> nodes ,long pid){
		List<TblDistrict> rootDis=findDistrictsByPid(pid);
		if(rootDis != null){
System.out.println("the pid = [ "+pid+" ] has the [ " +rootDis.size() +" ] children !");
			for(TblDistrict dis :rootDis){
				ZTreeNode r1=new ZTreeNode();
				r1.setId(dis.getId());
				r1.setpId(pid);
				r1.setName(dis.getDisName());
				nodes.add(r1);
				
				if(dis.getAreaLevelId()< cacheService.getMaxDistrictLevel()){
					queryDistrictChildTree(nodes,dis.getId());
				}
				
			}
		}
	}

	@Override
	public List<LazyTreeNode> findLazyTreeNode(long id) {
		List<TblDistrict> lists=findDistrictsByPid(id);
		if(lists != null && lists.size()>0){
			List<LazyTreeNode> treeNodes=new ArrayList<>();
			for(TblDistrict td:lists){
				LazyTreeNode n=new LazyTreeNode();
				n.setId(td.getId());
				n.setpId(id);
				n.setName(td.getDisName());
				if(td.getAreaLevelId()==cacheService.getMaxDistrictLevel()){
					n.setParent(false);
				}else{
					n.setParent(true);
				}
				treeNodes.add(n);
			}
			return treeNodes;
		}
		return null;
	}
	
}
