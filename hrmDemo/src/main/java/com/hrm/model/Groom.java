package com.hrm.model;

public class Groom {
    private Integer gId;//培训id

    private String gContent;//培训内容

    private String gRequire;//培训要求

    private String gBegintime;//开始时间

    private String gEndtime;//结束时间

    private String gType;//状态

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgContent() {
        return gContent;
    }

    public void setgContent(String gContent) {
        this.gContent = gContent == null ? null : gContent.trim();
    }

    public String getgRequire() {
        return gRequire;
    }

    public void setgRequire(String gRequire) {
        this.gRequire = gRequire == null ? null : gRequire.trim();
    }

    public String getgBegintime() {
        return gBegintime;
    }

    public void setgBegintime(String gBegintime) {
        this.gBegintime = gBegintime == null ? null : gBegintime.trim();
    }

    public String getgEndtime() {
        return gEndtime;
    }

    public void setgEndtime(String gEndtime) {
        this.gEndtime = gEndtime == null ? null : gEndtime.trim();
    }

    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType == null ? null : gType.trim();
    }

    @Override
    public String toString() {
        return "Groom{" +
                "gId=" + gId +
                ", gContent='" + gContent + '\'' +
                ", gRequire='" + gRequire + '\'' +
                ", gBegintime='" + gBegintime + '\'' +
                ", gEndtime='" + gEndtime + '\'' +
                ", gType='" + gType + '\'' +
                '}';
    }
}