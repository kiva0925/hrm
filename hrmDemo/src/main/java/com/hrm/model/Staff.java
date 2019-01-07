package com.hrm.model;

public class Staff {
    private Integer sId;

    private String sHiredate;

    private Double sCorpus;

    private String sAttendance;

    private Integer tId;

    private Integer bId;

    private Integer stId;

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

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "sId=" + sId +
                ", sHiredate='" + sHiredate + '\'' +
                ", sCorpus=" + sCorpus +
                ", sAttendance='" + sAttendance + '\'' +
                ", tId=" + tId +
                ", bId=" + bId +
                ", stId=" + stId +
                '}';
    }
}