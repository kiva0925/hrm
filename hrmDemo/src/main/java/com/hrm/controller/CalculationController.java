package com.hrm.controller;

import com.hrm.model.Bio;
import com.hrm.model.Earnings;
import com.hrm.model.EarningsVo;
import com.hrm.model.User;
import com.hrm.service.BioService;
import com.hrm.service.EarningsService;
import com.hrm.service.EarningsVoService;
import com.hrm.service.UserService;
import com.hrm.util.MyUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class CalculationController {
    @Resource
    private UserService userService;
    @Resource
    private BioService bioService;
    @Resource
    private EarningsService earningsService;
    @Resource
    private EarningsVoService earningsVoService;

    @RequestMapping("/getCalculation")
    public String getCalculation(HttpSession session,HttpServletResponse response)throws Exception{
        Earnings earnings = new Earnings();
        earnings.seteTime(MyUtil.getLastMonth());
        List<EarningsVo> earningsVo = earningsVoService.getEarningsVo(earnings);
        if(earningsVo.size()>0){
            session.setAttribute("earningsVo",earningsVo);
        }else {
            if(earningsService.addEarnings()>0){
                session.setAttribute("earningsVo",earningsVoService.getEarningsVo(earnings));
            }
        }
        String sign_c = (String) session.getAttribute("sign_c");
        if(sign_c != null){
            response.getWriter().print("<script>alert(\""+sign_c+"\");</script>");
            session.removeAttribute("sign_t");
        }
        return "admin/calculation";
    }

    @RequestMapping("/present")
    public String present(HttpSession session)throws Exception{
        String sign_c = null;
        List<EarningsVo> earningsVo = (List<EarningsVo>) session.getAttribute("earningsVo");
        if(earningsService.updateAllEarnings(earningsVo)>0){
            sign_c = "发布成功";
        }else {
            sign_c = "发布失败";
        }
        session.setAttribute("sign_c",sign_c);
        return "redirect:getCalculation";
    }
}
