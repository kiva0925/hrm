package com.hrm.model;
/*
 * 员工表
 */

public class Staff {
    private Integer sId;

    private String sHiredate;//入职时间

    private Double sCorpus;//基本薪资

    private String sAttendance;//考勤时间

    private Integer tId;//职位id

    private Integer bId;//简历id

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsHiredate() {
        return sHiredate;
    }

    public void setsHiredate(String sHiredate) {
        this.sHiredate = sHiredate == null ? null : sHiredate.trim();
    }

    public Double getsCorpus() {
        return sCorpus;
    }

    public void setsCorpus(Double sCorpus) {
        this.sCorpus = sCorpus;
    }

    public String getsAttendance() {
        return sAttendance;
    }

    public void setsAttendance(String sAttendance) {
        this.sAttendance = sAttendance == null ? null : sAttendance.trim();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }
}