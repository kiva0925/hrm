package com.hrm.model;

public class StaffVo extends Staff {
    private TitleVo titleVo;
    private Bio bio;
    private Stype stype;

    public TitleVo getTitleVo() {
        return titleVo;
    }

    public void setTitleVo(TitleVo titleVo) {
        this.titleVo = titleVo;
    }

    public Bio getBio() {
        return bio;
    }

    public void setBio(Bio bio) {
        this.bio = bio;
    }

    public Stype getStype() {
        return stype;
    }

    public void setStype(Stype stype) {
        this.stype = stype;
    }

    @Override
    public String toString() {
        return "StaffVo{" +
                "sId=" + this.getsId() +
                ", sHiredate='" + this.getsHiredate() + '\'' +
                ", sCorpus=" + this.getsCorpus() +
                ", sAttendance='" + this.getsAttendance() + '\'' +
                ", stype=" + stype +
                "titleVo=" + titleVo +
                ", bio=" + bio +
                '}';
    }
}
