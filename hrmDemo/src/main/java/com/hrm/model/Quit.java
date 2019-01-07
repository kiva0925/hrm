package com.hrm.model;
/*
 * 离职表
 */

public class Quit {
    private Integer qId;

    private String qCause;//离职原因

    private String qTime;//离职时间

    private Integer sId;//员工id

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getqCause() {
        return qCause;
    }

    public void setqCause(String qCause) {
        this.qCause = qCause == null ? null : qCause.trim();
    }

    public String getqTime() {
        return qTime;
    }

    public void setqTime(String qTime) {
        this.qTime = qTime == null ? null : qTime.trim();
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Quit{" +
                "qId=" + qId +
                ", qCause='" + qCause + '\'' +
                ", qTime='" + qTime + '\'' +
                ", sId=" + sId +
                '}';
    }
}