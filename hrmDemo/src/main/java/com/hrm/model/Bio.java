package com.hrm.model;
/*
 * 简历表
 */

public class Bio {
    private Integer bId;

    private String bName;//姓名

    private String bSex;//性别

    private String bSchooltag;//毕业学校

    private String bEducation;//最高学历

    private String bSpecialty;//专业

    private String bBirthday;//出生年月

    private String bPlace;//籍贯

    private String bPhone;//手机号

    private String bAddress;//通讯地址

    private String bEmail;//电子信箱

    private String bEbackground;//教育背景

    private String bSkill;//专业技能

    private String bExperience;//项目经验

    private Integer uId;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbSex() {
        return bSex;
    }

    public void setbSex(String bSex) {
        this.bSex = bSex == null ? null : bSex.trim();
    }

    public String getbSchooltag() {
        return bSchooltag;
    }

    public void setbSchooltag(String bSchooltag) {
        this.bSchooltag = bSchooltag == null ? null : bSchooltag.trim();
    }

    public String getbEducation() {
        return bEducation;
    }

    public void setbEducation(String bEducation) {
        this.bEducation = bEducation == null ? null : bEducation.trim();
    }

    public String getbSpecialty() {
        return bSpecialty;
    }

    public void setbSpecialty(String bSpecialty) {
        this.bSpecialty = bSpecialty == null ? null : bSpecialty.trim();
    }

    public String getbBirthday() {
        return bBirthday;
    }

    public void setbBirthday(String bBirthday) {
        this.bBirthday = bBirthday == null ? null : bBirthday.trim();
    }

    public String getbPlace() {
        return bPlace;
    }

    public void setbPlace(String bPlace) {
        this.bPlace = bPlace == null ? null : bPlace.trim();
    }

    public String getbPhone() {
        return bPhone;
    }

    public void setbPhone(String bPhone) {
        this.bPhone = bPhone == null ? null : bPhone.trim();
    }

    public String getbAddress() {
        return bAddress;
    }

    public void setbAddress(String bAddress) {
        this.bAddress = bAddress == null ? null : bAddress.trim();
    }

    public String getbEmail() {
        return bEmail;
    }

    public void setbEmail(String bEmail) {
        this.bEmail = bEmail == null ? null : bEmail.trim();
    }

    public String getbEbackground() {
        return bEbackground;
    }

    public void setbEbackground(String bEbackground) {
        this.bEbackground = bEbackground == null ? null : bEbackground.trim();
    }

    public String getbSkill() {
        return bSkill;
    }

    public void setbSkill(String bSkill) {
        this.bSkill = bSkill == null ? null : bSkill.trim();
    }

    public String getbExperience() {
        return bExperience;
    }

    public void setbExperience(String bExperience) {
        this.bExperience = bExperience == null ? null : bExperience.trim();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "Bio{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", bSex='" + bSex + '\'' +
                ", bSchooltag='" + bSchooltag + '\'' +
                ", bEducation='" + bEducation + '\'' +
                ", bSpecialty='" + bSpecialty + '\'' +
                ", bBirthday='" + bBirthday + '\'' +
                ", bPlace='" + bPlace + '\'' +
                ", bPhone='" + bPhone + '\'' +
                ", bAddress='" + bAddress + '\'' +
                ", bEmail='" + bEmail + '\'' +
                ", bEbackground='" + bEbackground + '\'' +
                ", bSkill='" + bSkill + '\'' +
                ", bExperience='" + bExperience + '\'' +
                ", uId=" + uId +
                '}';
    }
}