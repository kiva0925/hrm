package com.hrm.model;

public class RecruitVo extends Recruit{

    private TitleVo titleVo;//职务

    public TitleVo getTitleVo() {
        return titleVo;
    }

    public void setTitleVo(TitleVo titleVo) {
        this.titleVo = titleVo;
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
                ", titleVo=" + titleVo +
                '}';
    }
}
