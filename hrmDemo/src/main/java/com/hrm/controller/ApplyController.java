package com.hrm.controller;

import com.hrm.model.*;
import com.hrm.service.BioService;
import com.hrm.service.EarningsService;
import com.hrm.service.QuitService;
import com.hrm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ApplyController {
    @Resource
    private QuitService quitService;
    @Resource
    private EarningsService earningsService;

    @RequestMapping("/getApply")
    public String getApply()throws Exception{
        return "employee/apply";
    }

    @RequestMapping("/addApply")
    public String addApply(Integer apply, String desc, HttpSession session, HttpServletResponse response)throws Exception{
        StaffVo staffVo = (StaffVo) session.getAttribute("staffVo");
        String sign_a = null;
        if(apply==0){//请假申请
            sign_a="暂不批准";
        }else if(apply==1){//工资异议
            Earnings earnings = new Earnings();
            earnings.setsId(staffVo.getsId());
            List<Earnings> earnings1 = earningsService.getEarnings(earnings);
            if(earnings1 != null){
                earnings = earnings1.get(0);
                if(earnings1.size()>1){
                    for (int i = 1; i < earnings1.size(); i++) {
                        if(earnings1.get(i).geteId()>earnings1.get(i-1).geteId()){
                            earnings = earnings1.get(i);
                        }
                    }
                }
                earnings.seteCause(desc);
                earnings.seteWhether(1);//提出异议
                if(earningsService.updateEarnings(earnings)>0){
                    sign_a="申请成功";
                }else {
                    sign_a="申请失败";
                }
            }else {
                sign_a="申请失败";
            }
        }else if(apply==2){//辞职申请
            Quit quit = new Quit();
            quit.setqCause(desc);
            quit.setsId(staffVo.getsId());
            if(quitService.addQuit(quit)>0){
                sign_a="申请成功";
            }else {
                sign_a="申请失败";
            }
        }else {
            sign_a="暂不批准";
        }
        response.getWriter().print("<script>alert(\""+sign_a+"\");</script>");
        return "employee/apply";
    }
}
