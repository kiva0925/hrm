package com.hrm.service.Impl;

import com.hrm.dao.ClockVoMapper;
import com.hrm.dao.EarningsVoMapper;
import com.hrm.model.Clock;
import com.hrm.model.ClockVo;
import com.hrm.model.Earnings;
import com.hrm.model.EarningsVo;
import com.hrm.service.ClockVoService;
import com.hrm.service.EarningsVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EarningsVoServiceImpl implements EarningsVoService {
    @Resource
    private EarningsVoMapper earningsVoMapper;

    @Override
    public List<EarningsVo> getEarningsVo(Earnings earnings) {
        return earningsVoMapper.getEarningsVo(earnings);
    }
}
