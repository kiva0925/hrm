package com.hrm.controller;

import com.hrm.model.*;
import com.hrm.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @Resource
    private DepartmentService departmentService;

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

    @RequestMapping("/personnel")
    public String personnel(Integer sId,HttpSession session)throws Exception{
        List<StaffVo> staffVos = (List<StaffVo>) session.getAttribute("staffVos");
        for (StaffVo staffVo : staffVos) {
            if(sId.equals(staffVo.getsId())){
                session.setAttribute("staffVo",staffVo);
                System.out.println(staffVo.getTitleVo());
            }
        }
        return "admin/personnel";
    }

    @RequestMapping("/updateStaff")
    public String updateStaff(Staff staff,HttpSession session)throws Exception{
        System.out.println(staff);
        String sign_s = null;
        if(staffService.updateStaff(staff)>0){
            sign_s = "修改成功";
        }else {
            sign_s = "修改失败";
        }
        session.setAttribute("sign_s",sign_s);
        return "redirect:getStaff";
    }

    @RequestMapping("/relieve_guard")
    public String relieve_guard(Integer sId,HttpSession session)throws Exception{
        List<Department> departments = departmentService.getDepartments();
        session.setAttribute("departments",departments);
        List<StaffVo> staffVos = (List<StaffVo>) session.getAttribute("staffVos");
        for (StaffVo staffVo : staffVos) {
            if(sId.equals(staffVo.getsId())){
                session.setAttribute("staffVo",staffVo);
                System.out.println(staffVo.getTitleVo());
            }
        }
        return "admin/guard";
    }

    @ResponseBody
    @RequestMapping("/updateGuard")
    public void updateGuard(Staff staff,HttpSession session)throws Exception{
        String sign_s = null;
        if(staffService.updateStaff(staff)>0){
            sign_s = "调岗成功";
        }else {
            sign_s = "调岗失败";
        }
        session.setAttribute("sign_s",sign_s);
    }
}
