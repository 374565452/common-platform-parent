package com.common.platform.dto;

public class DistrictDto {

	private long id;
	
	private long parentId;
	
	private String disName;
	
	private String parentName;
	
	private String disLevelName;
	
	private String disCode;
	
	private String disLogicAddress;
	
	private double longitude;
	
	private double latitude;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getDisName() {
		return disName;
	}

	public void setDisName(String disName) {
		this.disName = disName;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getDisLevelName() {
		return disLevelName;
	}

	public void setDisLevelName(String disLevelName) {
		this.disLevelName = disLevelName;
	}

	public String getDisCode() {
		return disCode;
	}

	public void setDisCode(String disCode) {
		this.disCode = disCode;
	}

	public String getDisLogicAddress() {
		return disLogicAddress;
	}

	public void setDisLogicAddress(String disLogicAddress) {
		this.disLogicAddress = disLogicAddress;
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
	
}
