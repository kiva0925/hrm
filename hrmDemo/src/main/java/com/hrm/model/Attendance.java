package com.hrm.model;
/*
 * 考勤状态表
 */

public class Attendance {
    private Integer aId;

    private String aType;//状态详情

    private Double aSum;//金额

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaType() {
        return aType;
    }

    public void setaType(String aType) {
        this.aType = aType == null ? null : aType.trim();
    }

    public Double getaSum() {
        return aSum;
    }

    public void setaSum(Double aSum) {
        this.aSum = aSum;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "aId=" + aId +
                ", aType='" + aType + '\'' +
                ", aSum=" + aSum +
                '}';
    }
}