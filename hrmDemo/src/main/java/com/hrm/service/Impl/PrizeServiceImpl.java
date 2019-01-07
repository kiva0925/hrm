package com.hrm.service.Impl;

import com.hrm.dao.PrizeMapper;
import com.hrm.model.Prize;
import com.hrm.model.PrizeExample;
import com.hrm.service.PrizeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PrizeServiceImpl implements PrizeService {
    @Resource
    private PrizeMapper prizeMapper;

    @Override
    public int addPrize(Prize prize) {
        return prizeMapper.insertSelective(prize);
    }

    @Override
    public int deletePrize(Integer pId) {
        return prizeMapper.deleteByPrimaryKey(pId);
    }

    @Override
    public int updatePrize(Prize prize) {
        return prizeMapper.updateByPrimaryKeySelective(prize);
    }

    @Override
    public List<Prize> getPrize(Prize prize) {
        PrizeExample prizeExample = new PrizeExample();
        PrizeExample.Criteria criterion = prizeExample.createCriteria();
        if(prize.getsId()!=null){
            criterion.andSIdEqualTo(prize.getsId());
        }
        List<Prize> prizes = prizeMapper.selectByExample(prizeExample);
        if(prizes.size()>0){
            return prizes;
        }
        return null;
    }
}
