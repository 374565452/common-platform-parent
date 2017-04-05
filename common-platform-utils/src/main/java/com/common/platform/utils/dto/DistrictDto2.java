package com.common.platform.utils.dto;

import java.util.Date;

public class DistrictDto {
	private Long id;

    private String disName;

    private String disCode;

    private String disLogicAddress;

    private Long areaLevelId;

    private Long parentId;

    private Double longitude;

    private Double latitude;

    private Date createdDate;

    private Date updatedDate;

    private Integer status;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName == null ? null : disName.trim();
    }

    public String getDisCode() {
        return disCode;
    }

    public void setDisCode(String disCode) {
        this.disCode = disCode == null ? null : disCode.trim();
    }

    public String getDisLogicAddress() {
        return disLogicAddress;
    }

    public void setDisLogicAddress(String disLogicAddress) {
        this.disLogicAddress = disLogicAddress == null ? null : disLogicAddress.trim();
    }

    public Long getAreaLevelId() {
        return areaLevelId;
    }

    public void setAreaLevelId(Long areaLevelId) {
        this.areaLevelId = areaLevelId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
