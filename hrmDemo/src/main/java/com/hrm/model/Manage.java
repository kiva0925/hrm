package com.hrm.model;
/*
 * 员工培训表
 */

public class Manage {
    private Integer mId;

    private Integer gId;

    private Integer sId;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "mId=" + mId +
                ", gId=" + gId +
                ", sId=" + sId +
                '}';
    }
}