package com.common.platform.utils.dto;

public class DistrictParam {

	private String disName;
	
	private String disCode;
	
	private int actionType;
	
	private long parentId;
	
	private double longitude;
	
	private double latitude;
	
	private String disAddress;
	
	private String disRemark;

	public String getDisName() {
		return disName;
	}

	public void setDisName(String disName) {
		this.disName = disName;
	}

	public String getDisCode() {
		return disCode;
	}

	public void setDisCode(String disCode) {
		this.disCode = disCode;
	}

	public int getActionType() {
		return actionType;
	}

	public void setActionType(int actionType) {
		this.actionType = actionType;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getDisAddress() {
		return disAddress;
	}

	public void setDisAddress(String disAddress) {
		this.disAddress = disAddress;
	}

	public String getDisRemark() {
		return disRemark;
	}

	public void setDisRemark(String disRemark) {
		this.disRemark = disRemark;
	}
}
