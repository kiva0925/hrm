package com.hrm.service.Impl;

import com.hrm.dao.ClockMapper;
import com.hrm.dao.PrizeMapper;
import com.hrm.model.Clock;
import com.hrm.model.Prize;
import com.hrm.model.StaffVo;
import com.hrm.service.ClockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ClockServiceImpl implements ClockService {
    @Resource
    private ClockMapper clockMapper;
    @Resource
    private PrizeMapper prizeMapper;

    @Override
    public int addClock(Clock clock,String punch, StaffVo staffVo) {
        Date date = new Date();
        SimpleDateFormat Sdf = new SimpleDateFormat("yyyy-MM-dd");
        clock.setcData(Sdf.format(date));
        if(punch.compareTo(clock.getcOnduty())>0){
            clock.setaId(0);//正常打卡
        }else {
            clock.setaId(1);//迟到
            addPrize(clock,1,staffVo);
        }
        return clockMapper.insertSelective(clock);
    }

    @Override
    public int updateClock(Clock clock,String punch, StaffVo staffVo) {
        if(punch.compareTo(clock.getcOffduty())==0){
            System.out.println("正常打卡");
            clock.setaId(clock.getaId()+0);//正常打卡
        }else if(punch.compareTo(clock.getcOffduty())<0) {
            System.out.println("加班");
            addPrize(clock,0,staffVo);
            clock.setaId(clock.getaId()+0);//加班
        }else {
            if(clock.getaId()==0){
                System.out.println("早退");
                clock.setaId(clock.getaId()+1);//早退
            }else {
                System.out.println("迟到+早退");
                clock.setaId(clock.getaId()+2);//迟到+早退
            }
            addPrize(clock,2,staffVo);
        }
        System.out.println(clock);
        return clockMapper.updateByPrimaryKeySelective(clock);
    }

    private void addPrize(Clock clock, int type, StaffVo staffVo) {
        Prize prize = new Prize();
        prize.setsId(clock.getsId());//员工
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(date);
        prize.setpTime(dateNowStr);//时间
        if(type==0){//加班
            String[] split = staffVo.getsAttendance().split(" - ");
            int sTime = Integer.parseInt(split[1].substring(0,2));
            int nowTime = Integer.parseInt(clock.getcOffduty().substring(0, 2));
            System.out.println(staffVo.getsCorpus()/22/8*1.5*(nowTime-sTime+1));//加班工资
            prize.setpSum(staffVo.getsCorpus()/22/8*1.5*(nowTime-sTime+1));//加班工资
            prize.setpCause("加班"+(nowTime-sTime+1)+"小时");//原因【加班】
        }else if(type>0){
            prize.setpSum(-50.0);
            if(type==1){
                prize.setpCause("迟到");//原因【迟到】
            }else {
                prize.setpCause("早退");//原因【早退】
            }
        }
        prizeMapper.insertSelective(prize);
    }
}
