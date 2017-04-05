package com.common.platform.service.cache;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.platform.service.ICacheService;
import com.common.platform.service.IDisLevelService;
import com.common.platform.service.IDistrictService;
import com.common.platform.utils.dto.ZTreeNode;

@Service
public class CacheService implements ICacheService{

	@Resource(name="memoryCache")
	private ICache cache;
	
	@Autowired
	private IDisLevelService disLevelService;
	
	@Autowired
	private IDistrictService districtService;
	
	@Override
	public int getMaxDistrictLevel() {
		Object value = cache.getCacheValue(ICache.CACHE_MAX_DISTRICT_LEVEL_KEY);
		if(value == null){
			int max=disLevelService.findMaxLevel();
			//得到数据后，将其进行缓存起来
System.out.println("-----read max from db----------------");
			cache.setCacheValue(ICache.CACHE_MAX_DISTRICT_LEVEL_KEY, new Integer(max));
			return max;
		}else{
			return ((Integer)value).intValue();
		}
	}

	@Override
	public List<ZTreeNode> findDistrictTree() {
		List<ZTreeNode> treeNodes;
		Object nodes=cache.getCacheValue(ICache.CACHE_DISTRICT_KEY);
		if(nodes == null){
			treeNodes=new ArrayList<>();
			districtService.queryDistrictTree(treeNodes);
			cache.setCacheValue(ICache.CACHE_DISTRICT_KEY, treeNodes);
		}else{
System.out.println("read the district from cache------------------");
			treeNodes=(List<ZTreeNode>)nodes;
		}
		return treeNodes;
	}

	@Override
	public void deleteDistrictTree() {
		//cache.setCacheValue(ICache.CACHE_DISTRICT_KEY, null);
		cache.deleteValue(ICache.CACHE_DISTRICT_KEY);
	}
}
