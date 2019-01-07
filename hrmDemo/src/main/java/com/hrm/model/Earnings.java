package com.hrm.model;
/*
 * 薪资表
 */


public class Earnings {
    private Integer eId;

    private Double eSalary;//当月薪资

    private Double ePerf;//绩效奖金

    private Double eOvertime;//加班费用

    private Double eRewards;//奖惩费用

    private Double eSecurity;//社保

    private Double eSum;//总额

    private String eTime;//结算时间

    private Integer eWhether;//是否复议

    private String eCause;//异议原因

    private Integer sId;//异议原因

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Double geteSalary() {
        return eSalary;
    }

    public void seteSalary(Double eSalary) {
        this.eSalary = eSalary;
    }

    public Double getePerf() {
        return ePerf;
    }

    public void setePerf(Double ePerf) {
        this.ePerf = ePerf;
    }

    public Double geteOvertime() {
        return eOvertime;
    }

    public void seteOvertime(Double eOvertime) {
        this.eOvertime = eOvertime;
    }

    public Double geteRewards() {
        return eRewards;
    }

    public void seteRewards(Double eRewards) {
        this.eRewards = eRewards;
    }

    public Double geteSecurity() {
        return eSecurity;
    }

    public void seteSecurity(Double eSecurity) {
        this.eSecurity = eSecurity;
    }

    public Double geteSum() {
        return eSum;
    }

    public void seteSum(Double eSum) {
        this.eSum = eSum;
    }

    public String geteTime() {
        return eTime;
    }

    public void seteTime(String eTime) {
        this.eTime = eTime == null ? null : eTime.trim();
    }

    public Integer geteWhether() {
        return eWhether;
    }

    public void seteWhether(Integer eWhether) {
        this.eWhether = eWhether;
    }

    public String geteCause() {
        return eCause;
    }

    public void seteCause(String eCause) {
        this.eCause = eCause == null ? null : eCause.trim();
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Earnings{" +
                "eId=" + eId +
                ", eSalary=" + eSalary +
                ", ePerf=" + ePerf +
                ", eOvertime=" + eOvertime +
                ", eRewards=" + eRewards +
                ", eSecurity=" + eSecurity +
                ", eSum=" + eSum +
                ", eTime='" + eTime + '\'' +
                ", eWhether=" + eWhether +
                ", eCause='" + eCause + '\'' +
                ", sId=" + sId +
                '}';
    }
}