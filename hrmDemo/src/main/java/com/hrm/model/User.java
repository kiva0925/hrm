package com.hrm.model;
/*
 * 用户表
 */

public class User {
    private Integer uId;

    private String uName;//昵称

    private String uPass;//密码

    private Integer uType;//状态

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass == null ? null : uPass.trim();
    }

    public Integer getuType() {
        return uType;
    }

    public void setuType(Integer uType) {
        this.uType = uType;
    }
}