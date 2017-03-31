package com.common.platform.model;

import java.util.Date;

public class TblDisLevel {
    private Integer id;

    private String disLevelName;

    private Date createDate;

    private Integer status;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisLevelName() {
        return disLevelName;
    }

    public void setDisLevelName(String disLevelName) {
        this.disLevelName = disLevelName == null ? null : disLevelName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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