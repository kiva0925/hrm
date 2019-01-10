package com.hrm.controller;

import com.hrm.model.*;
import com.hrm.service.*;
import com.hrm.util.AgeUtils;
import com.hrm.util.MyUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class EmployeeController {
    @Resource
    private EarningsVoService earningsVoService;
    @Resource
    private StaffVoService staffVoService;
    @Resource
    private ClockVoService clockVoService;
    @Resource
    private ClockService clockService;
    @Resource
    private ManageVoService manageVoService;
    @Resource
    private PrizeVoService prizeVoService;

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

    @RequestMapping("/current")
    public String current(HttpSession session, HttpServletResponse response) throws Exception{
        Earnings earnings = new Earnings();
        StaffVo staffVo = (StaffVo) session.getAttribute("staffVo");
        earnings.setsId(staffVo.getsId());
        earnings.seteTime(MyUtil.getLastMonth());
        List<EarningsVo> earningsVo = earningsVoService.getEarningsVo(earnings);
        if(earningsVo.size()>0&&earningsVo.get(0).geteWhether()!=0){//工资信息显示，并且异议操作开启【即eWhether！=0】
            session.setAttribute("earningsVo",earningsVo.get(0));
        }
        return "employee/current";
    }

    @RequestMapping("/events")
    public String events(HttpSession session, HttpServletResponse response) throws Exception{
        Earnings earnings = new Earnings();
        StaffVo staffVo = (StaffVo) session.getAttribute("staffVo");
        earnings.setsId(staffVo.getsId());
        earnings.seteTime(MyUtil.getLastMonth());
        List<EarningsVo> earningsVo = earningsVoService.getEarningsVo(earnings);
        for (int i = 0; i < earningsVo.size(); i++) {
            if(earningsVo.get(i).geteWhether()==0){
                earningsVo.remove(i);
                i--;
            }
        }
        if(earningsVo.size()>0){
            session.setAttribute("earningsVos",earningsVo);
        }
        return "employee/events";
    }

    @RequestMapping("/particulars")
    public String particulars(Integer eId,HttpSession session,Model model) throws Exception{
        EarningsVo earningsVo = new EarningsVo();
        earningsVo = (EarningsVo) session.getAttribute("earningsVo");
        if(earningsVo.geteId()!=eId){//获取该工资条
            List<EarningsVo> earningsVos = (List<EarningsVo>) session.getAttribute("earningsVos");
            for (EarningsVo vo : earningsVos) {
                if(eId == vo.geteId()){
                    earningsVo =vo;
                }
            }
        }
        Prize prize = new Prize();
        prize.setsId(earningsVo.getStaffVo().getsId());
        prize.setpTime(earningsVo.geteTime());
        List<Prize> prizes = prizeVoService.getPrizes(prize);//该工资所在月份的所有奖惩信息
        model.addAttribute("prizes",prizes);
        Clock clock = new Clock();
        clock.setsId(earningsVo.getStaffVo().getsId());
        clock.setcData(earningsVo.geteTime());
        List<ClockVo> clockVos = clockVoService.getClockVos(clock);
        model.addAttribute("clockVos",clockVos);
        return "employee/particulars";
    }

    @RequestMapping("/address")
    public String address(HttpSession session, HttpServletResponse response) throws Exception{
        StaffVo staffVo = new StaffVo();
        List<StaffVo> staffVos = staffVoService.getStaffVos(staffVo);
        for (StaffVo vo : staffVos) {
            vo.getBio().setbBirthday(AgeUtils.getAgeFromBirthTime(vo.getBio().getbBirthday())+"");//生日转年龄
        }
        session.setAttribute("staffVos",staffVos);
        return "employee/address";
    }
}
