package com.hrm.service;


import com.hrm.model.Clock;
import com.hrm.model.ClockVo;

import java.util.List;

public interface ClockVoService {
    List<ClockVo> getClockVos(Clock clock);
}
