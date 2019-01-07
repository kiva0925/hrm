package com.hrm.service;


import com.hrm.model.Clock;
import com.hrm.model.StaffVo;

public interface ClockService {
    int addClock(Clock clock,String punch, StaffVo staffVo);
    int updateClock(Clock clock, String punch, StaffVo staffVo);
}
