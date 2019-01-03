package com.hrm.controller;

import com.hrm.model.*;
import com.hrm.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StaffController {
    @Resource
    private InvitedVoService invitedVoService;
    @Resource
    private StaffVoService staffVoService;
    @Resource
    private StaffService staffService;
    @Resource
    private DepartmentVoService departmentVoService;
    @Resource
    private UserService userService;

    @RequestMapping("/getStaff")
    public String getStaff(StaffVo staffVo, HttpServletResponse response, HttpSession session)throws Exception{
        List<StaffVo> staffVos = staffVoService.getStaffVos(staffVo);
        List<DepartmentVo> departmentVos = departmentVoService.getDepartmentVos();
        Invited invited = new Invited();
        invited.setiType(1);
        List<InvitedVo> invitedVos = invitedVoService.getInvitedVos(invited);
        String sign_s = (String) session.getAttribute("sign_s");
        if(sign_s!=null){
            response.getWriter().print("<script>alert(\""+sign_s+"\");</script>");
            session.removeAttribute("sign_s");
        }
        session.setAttribute("staffVos",staffVos);
        session.setAttribute("departmentVos",departmentVos);
        session.setAttribute("invitedVos",invitedVos);
        return "admin/staff";
    }

    @RequestMapping("/newStaff")
    public String newStaff(Integer iId,HttpSession session)throws Exception{
        List<InvitedVo> invitedVos = (List<InvitedVo>) session.getAttribute("invitedVos");
        for (InvitedVo vo : invitedVos) {
            if(iId == vo.getiId()){
                session.setAttribute("invitedVo",vo);
            }
        }
        return "admin/newStaff";
    }

    @RequestMapping("/addStaff")
    public String addStaff(Staff staff,HttpSession session)throws Exception{
        System.out.println(staff);
        String sign_s = null;
        if(staffService.addStaff(staff)>0){
            Staff staffSign = staffService.getStaffByBid(staff.getbId());
            User user = new User();
            user.setuName(staffSign.getsId()+"");
            user.setuPass(staffSign.getsId()+"");
            user.setuType(2);
            userService.register(user);
            sign_s = "入职成功";
        }else {
            sign_s = "入职失败";
        }
        session.setAttribute("sign_s",sign_s);
        return "redirect:getStaff";
    }
}
