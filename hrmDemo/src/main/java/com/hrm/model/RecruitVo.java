package com.hrm.model;

public class RecruitVo extends Recruit{

    private Title title;//职务

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "RecruitVo{" +
                "rId=" + this.getrId() +
                ", rTheme='" + this.getrTheme() + '\'' +
                ", rContent='" + this.getrContent() + '\'' +
                ", rRequire='" + this.getrRequire() + '\'' +
                ", rCount=" + this.getrCount() +
                ", rTime='" + this.getrTime() + '\'' +
                ", title=" + title +
                '}';
    }
}
