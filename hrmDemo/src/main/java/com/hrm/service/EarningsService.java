package com.hrm.service;


import com.hrm.model.Earnings;
import com.hrm.model.EarningsVo;

import java.util.List;

public interface EarningsService {
    int addEarnings();
    int addEarnings(Integer sId);
    int deleteEarnings(Integer qId);
    int updateEarnings(Earnings earnings);
    List<Earnings> getEarnings(Earnings earnings);
    int updateAllEarnings(List<EarningsVo> earningsVo);
}
