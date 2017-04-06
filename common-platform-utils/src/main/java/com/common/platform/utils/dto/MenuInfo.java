package com.common.platform.utils.dto;

import java.util.List;

public class MenuInfo {

	private String menuName;
	
	private String url;
	
	private String icon;

	private List<MenuInfo> children;
	
	public List<MenuInfo> getChildren() {
		return children;
	}

	public void setChildren(List<MenuInfo> children) {
		this.children = children;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	//private 
	
}
