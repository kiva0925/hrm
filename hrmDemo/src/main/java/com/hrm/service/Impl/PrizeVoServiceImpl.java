package com.hrm.service.Impl;

import com.hrm.dao.PrizeVoMapper;
import com.hrm.model.Prize;
import com.hrm.service.PrizeVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PrizeVoServiceImpl implements PrizeVoService {
    @Resource
    private PrizeVoMapper prizeVoMapper;

    @Override
    public List<Prize> getPrizes(Prize prize) {
        return prizeVoMapper.getPrizes(prize);
    }
}
