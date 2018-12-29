package com.hrm.controller;

import com.hrm.model.*;
import com.hrm.service.BioService;
import com.hrm.service.InvitedService;
import com.hrm.service.RecruitVoService;
import com.hrm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private BioService bioService;
    @Resource
    private RecruitVoService recruitVoService;
    @Resource
    private InvitedService invitedService;

    @RequestMapping("/index")
    public String index(HttpSession session,Model model) throws Exception{
        List<RecruitVo> recruitVos = recruitVoService.getRecruitVos();
        session.setAttribute("recruitVos",recruitVos);
        session.removeAttribute("sign_u");
        return "index";
    }

    @RequestMapping("/get")
    public String get() throws Exception{
        return "normal/login";
    }

    @RequestMapping("/getBio")
    public String getBio(HttpSession session) throws Exception{
        User user = (User) session.getAttribute("user");
        Bio bio = null;
        if(user==null){
            return "normal/login";
        }else {
            bio = bioService.getBio(user);
            session.setAttribute("bio",bio);
        }
        System.out.println(bio);
        if(bio == null){
            return "normal/wBio";
        }
        return "normal/rBio";
    }

    @RequestMapping("/login")
    public String login(User user,HttpSession session)throws Exception{
        System.out.println(user);
        User user1 = userService.login(user);
        System.out.println(user1);
        if (user1!=null){
            session.setAttribute("user",user1);
            return "index";
        }
        return "normal/login";
    }

    @RequestMapping("/register")
    public String register(User user, HttpSession session)throws Exception{
        userService.register(user);
        return "normal/login";
    }

    @RequestMapping("/recruitment")
    public String recruitment(Integer rId, Model model,HttpSession session)throws Exception{
        RecruitVo recruitVo = new RecruitVo();
        List<RecruitVo> recruitVos = (List<RecruitVo>) session.getAttribute("recruitVos");
        for (RecruitVo r : recruitVos) {
            if(rId == r.getrId()){
                recruitVo = r;
            }
        }
        model.addAttribute("recruitVo",recruitVo);
        return "normal/details";
    }

    @RequestMapping("/apply")
    public String apply(Invited invited, HttpServletResponse response, HttpSession session)throws Exception{
        User user = (User) session.getAttribute("user");
        String sign_u = null;
        if(user == null){
            sign_u = "请先登录";
            response.getWriter().print("<script>alert(\""+sign_u+"\");</script>");
            return "normal/login";
        }
        Bio bio = bioService.getBio(user);
        if(bio == null){
            sign_u = "请先填写简历";
            response.getWriter().print("<script>alert(\""+sign_u+"\");</script>");
            return "normal/wBio";
        }
        invited.setuId(user.getuId());
        invited.setbId(bio.getbId());
        int yn = invitedService.addInvited(invited);
        if(yn>0){
            sign_u = "申请成功";
        }else if(yn<0){
            sign_u = "该职位已投递";
        }else {
            sign_u = "申请失败";
        }
        response.getWriter().print("<script>alert(\""+sign_u+"\");</script>");
        return "index";
    }
}
