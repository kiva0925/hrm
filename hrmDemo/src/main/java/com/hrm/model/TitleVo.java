package com.hrm.model;

public class TitleVo extends Title {
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "TitleVo{" +
                "tId=" + this.gettId() +
                ", tName='" + this.gettName() + '\'' +
                ", tCreation='" + this.gettCreation() + '\'' +
                "department=" + department +
                '}';
    }
}
