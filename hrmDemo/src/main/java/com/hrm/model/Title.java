package com.hrm.model;
/*
 * 职位表
 */

public class Title {
    private Integer tId;

    private String tName;//职位名称

    private String tCreation;//创建时间

    private Integer dId;//部门id

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettCreation() {
        return tCreation;
    }

    public void settCreation(String tCreation) {
        this.tCreation = tCreation == null ? null : tCreation.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "Title{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tCreation='" + tCreation + '\'' +
                ", dId=" + dId +
                '}';
    }
}