package com.hrm.controller;

import com.hrm.model.*;
import com.hrm.service.*;
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
    @Resource
    private InvitedVoService invitedVoService;
    @Resource
    private StaffService staffService;

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
        User user1 = userService.login(user);
        if (user1!=null){
            session.setAttribute("user",user1);
            if(user1.getuType() == 0){//管理员登陆
                return "redirect:depart";
            }else if(user1.getuType() == 2){//员工登陆
                return "redirect:employees";
            }
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
    public String apply(Invited invited,HttpServletResponse response,HttpSession session)throws Exception{
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

        if(staffService.getStaffByBid(bio.getbId()) == null){
            invited.setbId(bio.getbId());
            int yn = invitedService.addInvited(invited);
            if(yn>0){
                sign_u = "申请成功";
            }else if(yn<0){
                sign_u = "该职位已投递";
            }else {
                sign_u = "申请失败";
            }
        }else {
            sign_u = "员工无法申请职位";
        }
        response.getWriter().print("<script>alert(\""+sign_u+"\");</script>");
        return "index";
    }

    @RequestMapping("/giveJob")
    public String giveJob(HttpSession session,HttpServletResponse response)throws Exception{
        User user = (User) session.getAttribute("user");
        String sign_u = null;
        if(user == null){
            sign_u = "请先登录";
            response.getWriter().print("<script>alert(\""+sign_u+"\");</script>");
            return "normal/login";
        }
        Invited invited = new Invited();
        invited.setuId(user.getuId());
        List<InvitedVo> invitedVos = invitedVoService.getInvitedVos(invited);
        session.setAttribute("invitedVos",invitedVos);
        return "normal/audition";
    }

    @RequestMapping("/inform")
    public String inform(Integer iId,HttpSession session)throws Exception{
        List<InvitedVo> invitedVos = (List<InvitedVo>) session.getAttribute("invitedVos");
        for (InvitedVo vo : invitedVos) {
            if(iId.equals(vo.getiId())){
                session.setAttribute("invited",vo);
            }
        }
        return "normal/inform";
    }

    @RequestMapping("/agreeInvited")
    public void agreeInvited(Invited invited,HttpServletResponse response)throws Exception{
        invited.setiType(1);
        if(invitedService.updateInvited(invited) > 0){
            response.getWriter().print("祝您面试成功");
        }else {
            response.getWriter().print("失败");
        }
    }

    @RequestMapping("/waiveInvited")
    public void waiveInvited(Invited invited,HttpServletResponse response)throws Exception{
        if(invitedService.deleteInvited(invited) > 0){
            response.getWriter().print("已放弃，去看看其他岗位吧");
        }else {
            response.getWriter().print("失败");
        }
    }
}
