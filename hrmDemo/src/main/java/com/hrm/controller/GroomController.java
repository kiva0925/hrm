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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class GroomController {
    @Resource
    private StaffVoService staffVoService;
    @Resource
    private StaffService staffService;
    @Resource
    private GroomService groomService;
    @Resource
    private ClockVoService clockVoService;
    @Resource
    private ClockService clockService;
    @Resource
    private ManageVoService manageVoService;
    @Resource
    private ManageService manageService;

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

    @RequestMapping("/employees")
    public String employees(HttpSession session, Model model, HttpServletResponse response) throws Exception{
        User user = (User) session.getAttribute("user");
        StaffVo staffVo = new StaffVo();
        staffVo.setsId(Integer.parseInt(user.getuName()));
        List<StaffVo> staffVos = staffVoService.getStaffVos(staffVo);
        ManageVo manageVo = new ManageVo();
        if(staffVos.size()>0){
            session.setAttribute("staffVo",staffVos.get(0));
            manageVo.setsId(staffVos.get(0).getsId());
        }
        List<ManageVo> manageVos = manageVoService.getManageVo(manageVo);
        if(manageVos.size()>0){
            session.setAttribute("manageVos",manageVos);
        }
        return "employee/homepage";
    }

    @RequestMapping("/clock_in")
    public String clock_in(HttpSession session, Model model, HttpServletResponse response) throws Exception{
        Clock clock = new Clock();
        ClockVo clockVo = new ClockVo();
        StaffVo staffVo = (StaffVo) session.getAttribute("staffVo");
        clock.setsId(staffVo.getsId());
        List<ClockVo> clockVos = clockVoService.getClockVos(clock);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-");
        String dateNowStr = sdf.format(date);
        List<String> lDate = new ArrayList<>();
        if(clockVos.size()>0){
            for (int i = clockVos.size()-1; i >= 0; i--) {
                if(!dateNowStr.equals(clockVos.get(i).getcData().substring(0,8))){
                    clockVos.remove(i);
                }
            }
            for (int i = 0; i < clockVos.size(); i++) {
                SimpleDateFormat newSdf = new SimpleDateFormat("yyyy-MM-dd");
                Date parse = newSdf.parse(clockVos.get(i).getcData());
                String today = newSdf.format(date);
                if(today.equals(clockVos.get(i).getcData())){
                    clockVo=clockVos.get(i);
                }
                lDate.add(parse.getTime()/1000+"");
            }
        }
        session.setAttribute("clockVo",clockVo);
        session.setAttribute("lDate",lDate);
        return "employee/punch";
    }

    @ResponseBody
    @RequestMapping("/onPunch")
    public void onPunch(Clock clock,String punch,HttpSession session) throws Exception{
        StaffVo staffVo = (StaffVo) session.getAttribute("staffVo");
        clockService.addClock(clock,punch,staffVo);
    }

    @ResponseBody
    @RequestMapping("/offPunch")
    public void offPunch(HttpSession session,Clock clock,String punch) throws Exception{
        ClockVo clockVo = (ClockVo) session.getAttribute("clockVo");
        clock.setaId(clockVo.getAttendance().getaId());
        System.out.println(clock);
        clockService.updateClock(clock,punch,clockVo.getStaffVo());
    }
}
