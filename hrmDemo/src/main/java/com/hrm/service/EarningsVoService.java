package com.hrm.service;

import com.hrm.model.Earnings;
import com.hrm.model.EarningsVo;

import java.util.List;

public interface EarningsVoService {
    List<EarningsVo> getEarningsVo(Earnings earnings);
}
