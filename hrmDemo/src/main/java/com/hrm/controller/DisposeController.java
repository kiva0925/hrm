package com.hrm.controller;

import com.hrm.model.Earnings;
import com.hrm.model.EarningsVo;
import com.hrm.model.Prize;
import com.hrm.model.Quit;
import com.hrm.service.EarningsService;
import com.hrm.service.EarningsVoService;
import com.hrm.service.PrizeService;
import com.hrm.service.QuitService;
import com.hrm.util.MyUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DisposeController {
    @Resource
    private EarningsService earningsService;
    @Resource
    private EarningsVoService earningsVoService;
    @Resource
    private QuitService quitService;
    @Resource
    private PrizeService prizeService;

    @RequestMapping("/dispose")
    public String dispose(Integer aging,Model model)throws Exception{
        if(aging==null){
            aging=0;
        }
        if(aging!=2){//异议处理
            Earnings earnings = new Earnings();
            earnings.seteTime(MyUtil.getLastMonth());
            List<EarningsVo> earningsVos = earningsVoService.getEarningsVo(earnings);
            for (int i = 0; i < earningsVos.size(); i++) {
                if(earningsVos.get(i).geteWhether()!=2){//无异议的工资条删除
                    earningsVos.remove(i);
                }
            }
            model.addAttribute("earningsVos",earningsVos);
        }
        if(aging!=1){//离职处理
            Quit quit = new Quit();
            List<Quit> quits = quitService.getQuit(quit);
            for (int i = 0; i < quits.size(); i++) {//已离职的员工删除
                if(quits.get(i).getqTime()!=null){
                    quits.remove(i);
                }
            }
            model.addAttribute("quits",quits);
        }
        return "admin/dispose";
    }

    @RequestMapping("/updateQuit")
    public String updateQuit(Quit quit)throws Exception{
        List<Quit> quit1 = quitService.getQuit(quit);
        if(quit1.size()>0){
            if(quitService.updateQuit(quit1.get(0))>0){
                System.out.println("处理完成");
            }else {
                System.out.println("处理失败");
            }
        }else {
            System.out.println("处理失败");
        }
        return "redirect:dispose";
    }

    @ResponseBody
    @RequestMapping("/addMoney")
    public void addMoney(Integer eId,Double pSum)throws Exception{
        Earnings earnings = new Earnings();
        earnings.seteId(eId);
        List<Earnings> es = earningsService.getEarnings(earnings);
        if(es.size()>0){
            earnings=es.get(0);
        }
        Prize prize = new Prize();
        prize.setpSum(pSum);//奖惩金额
        prize.setpTime(MyUtil.getCurrent());//奖惩时间
        prize.setpCause("由于"+earnings.geteCause()+"，故加钱");//奖惩原因
        prize.setsId(earnings.getsId());//奖惩员工
        prizeService.addPrize(prize);
        earnings.seteWhether(1);//变回无异议状态
        earnings.seteCause("已处理:加钱");
        earningsService.updateEarnings(earnings);//修改信息存入数据库
    }

    @RequestMapping("/reject")
    public String reject(Integer eId)throws Exception{
        Earnings earnings = new Earnings();
        earnings.seteId(eId);
        List<Earnings> es = earningsService.getEarnings(earnings);
        if(es.size()>0){
            earnings=es.get(0);
        }
        earnings.seteWhether(1);//变回无异议状态
        earnings.seteCause("已处理:驳回");
        earningsService.updateEarnings(earnings);//修改信息存入数据库
        return "redirect:dispose";
    }
}
