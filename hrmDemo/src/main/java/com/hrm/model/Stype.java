package com.hrm.model;
/*
* 员工状态表
*/

public class Stype {
    private Integer stId;

    private String stCase;//情况

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStCase() {
        return stCase;
    }

    public void setStCase(String stCase) {
        this.stCase = stCase == null ? null : stCase.trim();
    }

    @Override
    public String toString() {
        return "Stype{" +
                "stId=" + stId +
                ", stCase='" + stCase + '\'' +
                '}';
    }
}