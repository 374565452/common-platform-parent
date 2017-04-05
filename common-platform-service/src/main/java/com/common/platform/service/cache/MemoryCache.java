package com.common.platform.service.cache;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

@Repository(value="memoryCache")
public class MemoryCache implements ICache{
	
	private ConcurrentHashMap<String, Object> cacheMap=new ConcurrentHashMap<>();
	
	@Override
	public Object getCacheValue(String key) {
		if(cacheMap.containsKey(key)){
			return cacheMap.get(key);
		}
		return null;
	}

	@Override
	public boolean setCacheValue(String key, Object value) {
		if(!cacheMap.containsKey(key)){
			cacheMap.remove(key);
		}
		cacheMap.put(key, value);
		return true;
	}

	@Override
	public boolean updateCacheValue(String key, Object value) {
		if( !cacheMap.containsKey(key)){
			return false;
		}
		Object obj=cacheMap.get(key);
		if(obj != null){
			obj=null;
		}
		cacheMap.put(key, value);
		return true;
	}

	@Override
	public boolean deleteValue(String key) {
		if(cacheMap.containsKey(key)){
			cacheMap.remove(key);
		}
		return true;
	}
}
