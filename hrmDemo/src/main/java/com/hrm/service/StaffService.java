package com.hrm.service;

import com.hrm.model.Staff;

public interface StaffService {
    int addStaff(Staff staff);
    int updateStaff(Staff staff);
    Staff getStaffByBid(Integer bId);
}
