package com.hrm.controller;

import com.hrm.model.*;
import com.hrm.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class GroomController {
    @Resource
    private StaffVoService staffVoService;
    @Resource
    private GroomService groomService;
    @Resource
    private ManageService manageService;
    @Resource
    private DepartmentVoService departmentVoService;

    @RequestMapping("/getGroom")
    public String getGroom(HttpSession session,HttpServletResponse response) throws Exception{
        List<Groom> grooms = groomService.getGrooms();
        session.setAttribute("grooms",grooms);
        String sign_g = (String) session.getAttribute("sign_g");
        if(sign_g != null){
            response.getWriter().print("<script>alert(\""+sign_g+"\");</script>");
        }
        session.removeAttribute("sign_t");
        return "admin/train";
    }

    @RequestMapping("/saveGroom")
    public String saveGroom(Groom groom,HttpSession session) throws Exception{
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
    public String delGroom(Integer gId,HttpSession session) throws Exception{
        String sign_g = null;
        if(groomService.deleteGroom(gId)>0){
            sign_g = "删除成功";
        }else {
            sign_g = "删除失败";
        }
        session.setAttribute("sign_g",sign_g);
        return "redirect:getGroom";
    }

    @RequestMapping("/checkGroom")
    public String checkGroom(Integer gId,HttpSession session) throws Exception{
        List<Groom> grooms = (List<Groom>) session.getAttribute("grooms");
        for (Groom groom : grooms) {
            if(gId == groom.getgId()){
                session.setAttribute("groom",groom);
            }
        }
        StaffVo staffVo = new StaffVo();
        List<StaffVo> staffVos = staffVoService.getStaffVos(staffVo);
        session.setAttribute("staffVos",staffVos);

        List<DepartmentVo> departmentVos = departmentVoService.getDepartmentVos();
        Integer sign = 0;
        for (int i = 0; i < departmentVos.size(); i++) {
            sign = 0;
            for (int j = 0; j < staffVos.size(); j++) {
                if(departmentVos.get(i).getdId()==staffVos.get(j).getTitleVo().getDepartment().getdId()){
                    sign = 1;
                }
            }
            if(sign==0){
                departmentVos.remove(i);
                i--;
            }
        }
        session.setAttribute("departmentVos",departmentVos);
        return "admin/groom";
    }

    @RequestMapping("/addManage")
    public String addManage(Groom groom, HttpSession session, HttpServletRequest request) throws Exception{
        String[] staffs = request.getParameterValues("staffs");
        String sign_g = null;
        Manage manage = new Manage();
        manage.setgId(groom.getgId());
        if(groomService.updateGroom(groom)>0){
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

    @RequestMapping("/addManage2")
    public String addManage2(Groom groom, HttpSession session, HttpServletRequest request) throws Exception{
        String[] departs = request.getParameterValues("departs");
        List<StaffVo> staffVos = (List<StaffVo>) session.getAttribute("staffVos");
        Set<String> num = new HashSet<>();
        for (int i = 0; i < staffVos.size(); i++) {
            for (int j = 0; j < departs.length; j++) {
                if(Integer.parseInt(departs[j])==staffVos.get(i).getTitleVo().getDepartment().getdId()){
                    System.out.println(staffVos.get(i).getsId());
                    num.add(staffVos.get(i).getsId()+"");
                }
            }
        }
        String[] array = num.toArray(new String[0]);
        String sign_g = null;
        Manage manage = new Manage();
        manage.setgId(groom.getgId());
        if(groomService.updateGroom(groom)>0){
            if(manageService.addManage(manage,array)>0){
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
