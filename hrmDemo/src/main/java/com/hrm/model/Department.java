package com.hrm.model;
/*
 * 部门表
 */

public class Department {
    private Integer dId;

    private String dName;//部门名称

    private String dCreation;//创建时间

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdCreation() {
        return dCreation;
    }

    public void setdCreation(String dCreation) {
        this.dCreation = dCreation == null ? null : dCreation.trim();
    }

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", dCreation='" + dCreation + '\'' +
                '}';
    }
}