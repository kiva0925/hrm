package com.hrm.model;
/*
 * 奖惩表
 */

public class Prize {
    private Integer pId;

    private String pCause;//奖惩原因

    private Double pSum;//奖惩金额

    private String pTime;//奖惩时间

    private Integer sId;//员工id

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpCause() {
        return pCause;
    }

    public void setpCause(String pCause) {
        this.pCause = pCause == null ? null : pCause.trim();
    }

    public Double getpSum() {
        return pSum;
    }

    public void setpSum(Double pSum) {
        this.pSum = pSum;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime == null ? null : pTime.trim();
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Prize{" +
                "pId=" + pId +
                ", pCause='" + pCause + '\'' +
                ", pSum=" + pSum +
                ", pTime='" + pTime + '\'' +
                ", sId=" + sId +
                '}';
    }
}