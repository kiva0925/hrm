package com.hrm.model;
/*
 * 招聘表
 */

public class Recruit {
    private Integer rId;

    private String rTheme;//招聘主题

    private String rContent;//招聘内容

    private String rRequire;//招聘要求

    private Integer rCount;//招聘人数

    private String rTime;//发布时间

    private Integer tId;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrTheme() {
        return rTheme;
    }

    public void setrTheme(String rTheme) {
        this.rTheme = rTheme == null ? null : rTheme.trim();
    }

    public String getrContent() {
        return rContent;
    }

    public void setrContent(String rContent) {
        this.rContent = rContent == null ? null : rContent.trim();
    }

    public String getrRequire() {
        return rRequire;
    }

    public void setrRequire(String rRequire) {
        this.rRequire = rRequire == null ? null : rRequire.trim();
    }

    public Integer getrCount() {
        return rCount;
    }

    public void setrCount(Integer rCount) {
        this.rCount = rCount;
    }

    public String getrTime() {
        return rTime;
    }

    public void setrTime(String rTime) {
        this.rTime = rTime == null ? null : rTime.trim();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "rId=" + rId +
                ", rTheme='" + rTheme + '\'' +
                ", rContent='" + rContent + '\'' +
                ", rRequire='" + rRequire + '\'' +
                ", rCount=" + rCount +
                ", rTime='" + rTime + '\'' +
                ", tId=" + tId +
                '}';
    }
}