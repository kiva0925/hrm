package com.hrm.controller;

import com.hrm.model.Groom;
import com.hrm.model.Manage;
import com.hrm.model.ManageVo;
import com.hrm.model.StaffVo;
import com.hrm.service.GroomService;
import com.hrm.service.ManageService;
import com.hrm.service.StaffVoService;
import com.hrm.service.UserService;
import com.sun.deploy.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
public class GroomController {
    @Resource
    private UserService userService;
    @Resource
    private GroomService groomService;
    @Resource
    private StaffVoService staffVoService;
    @Resource
    private ManageService manageService;

    @RequestMapping("/getGroom")
    public String getGroom(HttpSession session, HttpServletResponse response)throws Exception{
        String sign_g = (String) session.getAttribute("sign_g");
        if(sign_g != null){
            response.getWriter().print("<script>alert(\""+sign_g+"\");</script>");
            session.removeAttribute("sign_g");
        }
        List<Groom> grooms = groomService.getGrooms();
        session.setAttribute("grooms",grooms);
        return "admin/train";
    }

    @RequestMapping("/saveGroom")
    public String saveGroom(Groom groom, HttpSession session)throws Exception{
        String sign_g = null;
        if(groomService.addGroom(groom)>0){
            sign_g = "保存成功";
        }else {
            sign_g = "保存失败";
        }
        session.setAttribute("sign_g",sign_g);
        return "redirect:getGroom";
    }

    @RequestMapping("/delGroom")
    public String delGroom(Groom groom, HttpSession session)throws Exception{
        String sign_g = null;
        if(groomService.deleteGroom(groom.getgId())>0){
            sign_g = "删除成功";
        }else {
            sign_g = "删除失败";
        }
        session.setAttribute("sign_g",sign_g);
        return "redirect:getGroom";
    }

    @RequestMapping("/checkGroom")
    public String checkGroom(Groom groom, HttpSession session)throws Exception{
        List<Groom> grooms = (List<Groom>) session.getAttribute("grooms");
        for (Groom g : grooms) {
            if(groom.getgId() == g.getgId()){
                groom = g;
            }
        }
        StaffVo staffVo = new StaffVo();
        List<StaffVo> staffVos = staffVoService.getStaffVos(staffVo);
        session.setAttribute("groom",groom);
        session.setAttribute("staffVos",staffVos);
        return "admin/groom";
    }

    @RequestMapping("/addManage")
    public String addManage(Groom groom, HttpSession session, HttpServletRequest request)throws Exception{
        String sign_g = null;
        Groom groom1 = (Groom) session.getAttribute("groom");
        groom.setgId(groom1.getgId());
        groom.setgType("已发布");
        if(groomService.updateGroom(groom)>0){
            String[] staffs = request.getParameterValues("staffs");
            Manage manage = new Manage();
            manage.setgId(groom.getgId());
            if(manageService.addManage(manage,staffs)>0){
                sign_g = "发布成功";
            }else {
                sign_g = "发布失败";
            }
        }else {
            sign_g = "发布失败";
        }
        session.setAttribute("sign_g",sign_g);
        return "redirect:getGroom";
    }
}
