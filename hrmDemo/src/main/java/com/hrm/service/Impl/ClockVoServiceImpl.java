package com.hrm.service.Impl;

import com.hrm.dao.BioMapper;
import com.hrm.dao.ClockVoMapper;
import com.hrm.model.*;
import com.hrm.service.ClockVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClockVoServiceImpl implements ClockVoService {
    @Resource
    private ClockVoMapper clockVoMapper;

    @Override
    public List<ClockVo> getClockVos(Clock clock) {
        return clockVoMapper.getClockVos(clock);
    }
}
