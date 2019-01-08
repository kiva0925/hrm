package com.hrm.service.Impl;

import com.hrm.dao.EarningsMapper;
import com.hrm.model.*;
import com.hrm.service.ClockVoService;
import com.hrm.service.EarningsService;
import com.hrm.service.PrizeVoService;
import com.hrm.service.StaffVoService;
import com.hrm.util.MyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EarningsServiceImpl implements EarningsService {
    @Resource
    private EarningsMapper earningsMapper;
    @Resource
    private StaffVoService staffVoService;
    @Resource
    private PrizeVoService prizeVoService;
    @Resource
    private ClockVoService clockVoService;

    @Override
    public int addEarnings() {
        Integer sign = 0;
        Earnings earnings = new Earnings();
        StaffVo staffVo = new StaffVo();
        staffVo.setsHiredate(MyUtil.getLastMonth());
        List<StaffVo> staffVos = staffVoService.getStaffVos(staffVo);
        Prize prize = new Prize();
        Clock clock = new Clock();
        Double sum = 0.0;
        for (StaffVo vo : staffVos) {
            earnings.setsId(vo.getsId());//员工id
            if(vo.getStype().getStId()==0){
                vo.setsCorpus(vo.getsCorpus()*0.8);
            }
            prize.setsId(vo.getsId());
            prize.setpTime(MyUtil.getLastMonth());
            List<Prize> prizes = prizeVoService.getPrizes(prize);
            Double rewards = 0.0;
            if(prizes.size()>0){
                for (Prize p : prizes) {
                    rewards += p.getpSum();
                }
            }
            earnings.seteRewards(rewards);//奖惩费用
            sum += rewards;
            clock.setsId(vo.getsId());
            clock.setcData(MyUtil.getLastMonth());
            List<ClockVo> clockVos = clockVoService.getClockVos(clock);
            if(clockVos.size()>0){
                for (int i = 0; i < clockVos.size(); i++) {
                    if(clockVos.get(i).getcOffduty()==null){
                        clockVos.remove(clockVos.get(i));
                    }
                }
            }
            if(clockVos.size()>=22){
                earnings.seteSalary(vo.getsCorpus());//当月薪资
                earnings.seteOvertime((clockVos.size()-22)*(vo.getsCorpus()/22));
                sum += earnings.geteOvertime();
            }else {
                earnings.seteSalary((vo.getsCorpus()/22)*clockVos.size());//当月薪资
            }
            sum += earnings.geteSalary();
            earnings.setePerf(vo.getsCorpus()*0.1);//绩效奖金
            sum += earnings.getePerf();
            earnings.seteSecurity(-200.0);//社保
            sum += earnings.geteSecurity();
            earnings.seteSum(sum);
            earnings.seteTime(MyUtil.getLastMonth());
            sign += earningsMapper.insertSelective(earnings);
        }
        return sign;
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

    @Override
    public int updateAllEarnings(List<EarningsVo> earningsVo) {
        Integer sign = 0;
        for (EarningsVo vo : earningsVo) {
            vo.seteWhether(1);
            sign += earningsMapper.updateByPrimaryKeySelective(vo);
        }
        return sign;
    }
}
