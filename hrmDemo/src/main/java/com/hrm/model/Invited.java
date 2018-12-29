package com.hrm.model;

public class Invited {
    private Integer iId;

    private Integer uId;

    private Integer rId;

    private Integer bId;

    private String iTime;

    private Integer iType;//状态：0为未读，1为已读

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getiTime() {
        return iTime;
    }

    public void setiTime(String iTime) {
        this.iTime = iTime == null ? null : iTime.trim();
    }

    public Integer getiType() {
        return iType;
    }

    public void setiType(Integer iType) {
        this.iType = iType;
    }

    @Override
    public String toString() {
        return "Invited{" +
                "iId=" + iId +
                ", uId=" + uId +
                ", rId=" + rId +
                ", bId=" + bId +
                ", iTime='" + iTime + '\'' +
                ", iType=" + iType +
                '}';
    }
}