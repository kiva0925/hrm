package com.hrm.controller;

import com.hrm.model.Clock;
import com.hrm.model.ClockVo;
import com.hrm.model.StaffVo;
import com.hrm.model.User;
import com.hrm.service.ClockVoService;
import com.hrm.service.GroomService;
import com.hrm.service.StaffService;
import com.hrm.service.StaffVoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
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

    @RequestMapping("/employees")
    public String employees(HttpSession session, Model model, HttpServletResponse response) throws Exception{
        User user = (User) session.getAttribute("user");
        StaffVo staffVo = new StaffVo();
        staffVo.setsId(Integer.parseInt(user.getuName()));
        List<StaffVo> staffVos = staffVoService.getStaffVos(staffVo);
        if(staffVos.size()>0){
            session.setAttribute("staffVo",staffVos.get(0));
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

    @RequestMapping("/punch")
    public void punch(String cOnDuty, HttpSession session, HttpServletResponse response) throws Exception{
        System.out.println(cOnDuty);
    }
}
