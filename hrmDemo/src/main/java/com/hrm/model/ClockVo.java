package com.hrm.model;
/*
 * 考勤表
 */

public class ClockVo extends Clock{
    private Attendance attendance;
    private StaffVo staffVo;

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public StaffVo getStaffVo() {
        return staffVo;
    }

    public void setStaffVo(StaffVo staffVo) {
        this.staffVo = staffVo;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "cId=" + this.getcId() +
                ", cData='" + this.getcData() + '\'' +
                ", cOnduty='" + this.getcOnduty() + '\'' +
                ", cOffduty='" + this.getcOffduty() + '\'' +
                ", attendance=" + attendance +
                ", staffVo=" + staffVo +
                '}';
    }
}