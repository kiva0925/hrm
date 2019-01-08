package com.hrm.model;
/*
 * 薪资扩展表
 */


public class EarningsVo extends Earnings{

    private StaffVo staffVo;

    public StaffVo getStaffVo() {
        return staffVo;
    }

    public void setStaffVo(StaffVo staffVo) {
        this.staffVo = staffVo;
    }

    @Override
    public String toString() {
        return "Earnings{" +
                "eId=" + this.geteId() +
                ", eSalary=" + this.geteSalary() +
                ", ePerf=" + this.getePerf() +
                ", eOvertime=" + this.geteOvertime() +
                ", eRewards=" + this.geteRewards() +
                ", eSecurity=" + this.geteSecurity() +
                ", eSum=" + this.geteSum() +
                ", eTime='" + this.geteTime() + '\'' +
                ", eWhether=" + this.geteWhether() +
                ", eCause='" + this.geteCause() + '\'' +
                ", staffVo=" + staffVo +
                '}';
    }
}