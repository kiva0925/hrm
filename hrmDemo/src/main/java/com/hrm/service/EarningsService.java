package com.hrm.service;


import com.hrm.model.Earnings;

import java.util.List;

public interface EarningsService {
    int addEarnings(Earnings earnings);
    int deleteEarnings(Integer qId);
    int updateEarnings(Earnings earnings);
    List<Earnings> getEarnings(Earnings earnings);
}
