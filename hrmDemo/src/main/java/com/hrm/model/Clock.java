package com.hrm.model;
/*
 * 考勤表
 */

public class Clock {
    private Integer cId;

    private String cData;//考勤日期

    private String cOnduty;//上班打卡

    private String cOffduty;//下班打卡

    private Integer aId;//考勤状态id

    private Integer sId;//员工id

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcData() {
        return cData;
    }

    public void setcData(String cData) {
        this.cData = cData == null ? null : cData.trim();
    }

    public String getcOnduty() {
        return cOnduty;
    }

    public void setcOnduty(String cOnduty) {
        this.cOnduty = cOnduty == null ? null : cOnduty.trim();
    }

    public String getcOffduty() {
        return cOffduty;
    }

    public void setcOffduty(String cOffduty) {
        this.cOffduty = cOffduty == null ? null : cOffduty.trim();
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "cId=" + cId +
                ", cData='" + cData + '\'' +
                ", cOnduty='" + cOnduty + '\'' +
                ", cOffduty='" + cOffduty + '\'' +
                ", aId=" + aId +
                ", sId=" + sId +
                '}';
    }
}