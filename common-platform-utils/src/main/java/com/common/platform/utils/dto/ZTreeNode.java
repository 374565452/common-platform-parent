package com.common.platform.utils.dto;

public class ZTreeNode {

	private Object id;
	
	private Object pId;
	
	private String name;
	
	private boolean isParent;
	
	public boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(boolean isParent) {
		this.isParent = isParent;
	}

	public Object getId() {
		return id;
	}

	public void setId(Object id) {
		this.id = id;
	}

	public Object getpId() {
		return pId;
	}

	public void setpId(Object pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
