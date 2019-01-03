package com.hrm.controller;

import com.hrm.model.*;
import com.hrm.service.DepartmentVoService;
import com.hrm.service.InvitedService;
import com.hrm.service.RecruitService;
import com.hrm.service.RecruitVoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RecruitController {
    @Resource
    private RecruitService recruitService;
    @Resource
    private RecruitVoService recruitVoService;
    @Resource
    private DepartmentVoService departmentVoService;
    @Resource
    private InvitedService invitedService;

    @RequestMapping("/getRecruit")
    public String getRecruit(HttpSession session, HttpServletResponse response) throws Exception{
        List<DepartmentVo> departmentVos = departmentVoService.getDepartmentVos();
        List<RecruitVo> recruitVos = recruitVoService.getRecruitVos();
        for (RecruitVo recruitVo : recruitVos) {
            System.out.println(recruitVo.getrTheme());
            System.out.println(recruitVo.getTitleVo().gettName());
            System.out.println(recruitVo.getrCount());
            System.out.println(recruitVo.getrTime());
            System.out.println(recruitVo.getrId());
        }
        String sign_r = (String) session.getAttribute("sign_r");
        if(sign_r != null){
            response.getWriter().print("<script>alert(\""+sign_r+"\");</script>");
        }
        session.removeAttribute("sign_r");
        session.setAttribute("departmentVos",departmentVos);
        session.setAttribute("recruitVos",recruitVos);
        return "admin/recruit";
    }

    @RequestMapping("/selectRecruit")
    @ResponseBody
    public List<Title> selectRecruit(Integer did, HttpSession session) throws Exception{
        List<DepartmentVo> departmentVos = (List<DepartmentVo>) session.getAttribute("departmentVos");
        for (DepartmentVo dv : departmentVos) {
            if(did.equals(dv.getdId())){
                return dv.getTitles();
            }
        }
        return null;
    }

    @RequestMapping("/addRecruit")
    public String addRecruit(Recruit recruit, HttpSession session) throws Exception{
        System.out.println(recruit);
        String sign_r = null;
        int yn = recruitService.addRecruit(recruit);
        if(yn>0){
            sign_r = "发布成功";
        }else if(yn<0){
            sign_r = "该职位已有招聘信息";
        }else {
            sign_r = "发布失败";
        }
        session.setAttribute("sign_r",sign_r);
        return "redirect:getRecruit";
    }

    @RequestMapping("/audition")
    public void audition(Invited invited, HttpSession session, HttpServletResponse response) throws Exception{
        if(invitedService.updateInvited(invited) > 0){
            response.getWriter().print("成功");
        }else {
            response.getWriter().print("失败");
        }
    }
}
