package com.hrm.service;


import com.hrm.model.Prize;

import java.util.List;

public interface PrizeService {
    int addPrize(Prize prize);
    int deletePrize(Integer pId);
    int updatePrize(Prize prize);
    List<Prize> getPrize(Prize prize);
}
