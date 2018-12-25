package com.hrm.model;

import java.util.ArrayList;
import java.util.List;

public class DepartmentVo {

    private Integer dId;

    private String dName;//部门名称

    private String dCreation;//创建时间

    private List<Title> titles = new ArrayList<>();

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
        this.dName = dName;
    }

    public String getdCreation() {
        return dCreation;
    }

    public void setdCreation(String dCreation) {
        this.dCreation = dCreation;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "DepartmentVo{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", dCreation='" + dCreation + '\'' +
                ", titles=" + titles +
                '}';
    }
}
