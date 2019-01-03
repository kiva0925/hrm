package com.hrm.model;

public class ManageVo extends Manage {
    private Groom groom;
    private StaffVo staffVo;

    public Groom getGroom() {
        return groom;
    }

    public void setGroom(Groom groom) {
        this.groom = groom;
    }

    public StaffVo getStaffVo() {
        return staffVo;
    }

    public void setStaffVo(StaffVo staffVo) {
        this.staffVo = staffVo;
    }

    @Override
    public String toString() {
        return "ManageVo{" +
                "mId=" + this.getmId() +
                ", gId=" + this.getgId() +
                ", sId=" + this.getsId() +
                "groom=" + groom +
                ", staffVo=" + staffVo +
                '}';
    }
}