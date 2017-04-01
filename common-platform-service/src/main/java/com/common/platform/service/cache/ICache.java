package com.common.platform.service.cache;

public interface ICache {

	public static String CACHE_DISTRICT_KEY="cache:district";
	
	public static String CACHE_MAX_DISTRICT_LEVEL_KEY="cache:max_district_level";
	
	public Object getCacheValue(String key);
	
	public boolean setCacheValue(String key,Object value);
	
	public boolean updateCacheValue(String key ,Object value);
	
}
