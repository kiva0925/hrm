package com.hrm.service.Impl;

import com.hrm.dao.EarningsMapper;
import com.hrm.model.Earnings;
import com.hrm.model.EarningsExample;
import com.hrm.service.EarningsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EarningsServiceImpl implements EarningsService {
    @Resource
    private EarningsMapper earningsMapper;

    @Override
    public int addEarnings(Earnings earnings) {
        return earningsMapper.insertSelective(earnings);
    }

    @Override
    public int deleteEarnings(Integer qId) {
        return earningsMapper.deleteByPrimaryKey(qId);
    }

    @Override
    public int updateEarnings(Earnings earnings) {
        return earningsMapper.updateByPrimaryKeySelective(earnings);
    }

    @Override
    public List<Earnings> getEarnings(Earnings earnings) {
        EarningsExample earningsExample = new EarningsExample();
        EarningsExample.Criteria criterion = earningsExample.createCriteria();
        if(earnings.getsId()!=null){
            criterion.andSIdEqualTo(earnings.getsId());
        }
        List<Earnings> earningss = earningsMapper.selectByExample(earningsExample);
        if(earningss.size()>0){
            return earningss;
        }
        return null;
    }
}
