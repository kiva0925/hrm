package com.hrm;

import com.hrm.util.AgeUtils;
import com.hrm.util.MyUtil;
import com.hrm.model.*;
import com.hrm.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HrmApplicationTests {
    @Resource
    private RecruitService recruitService;
    @Resource
    private RecruitVoService recruitVoService;
    @Resource
    private InvitedVoService invitedVoService;
    @Resource
    private TitleVoService titleVoService;
    @Resource
    private StaffVoService staffVoService;
    @Resource
    private ManageVoService manageVoService;
    @Resource
    private GroomService groomService;
    @Resource
    private ClockVoService clockVoService;
    @Resource
    private EarningsService earningsService;
    @Resource
    private EarningsVoService earningsVoService;
    @Resource
    private PrizeVoService prizeVoService;

    @Test
    public void addRecruit() {//Recruit添加
        Recruit recruit = new Recruit();
        recruit.setrTheme("招聘人事专员");
        recruit.setrContent("分析事业部人事相关KPI，提出改善建议，确定并统计分析事业部各项人事相关KPI实际状况");
        recruit.setrRequire("    本科及以上学历，管理类专业。\n" +
                "    3-5年以上人力资源工作经历，熟悉人力资源管理工作流程，专业性强。\n" +
                "    亲和力佳，沟通协调能力强，分析和解决问题能力，良好的抗压性，有良好的职业道德。");
        recruit.setrCount(2);
        recruit.setrTime("2019-1-30");
        recruit.settId(2);
        System.out.println(recruitService.addRecruit(recruit));
    }

    @Test
    public void updateRecruit(){//Recruit修改
        Recruit recruit = new Recruit();
        recruit.setrId(1);
        recruit.setrCount(3);
        System.out.println(recruitService.updateRecruit(recruit));
    }

    @Test
    public void getSignRecruit(){//Recruit查找指定rid的对象
        Recruit recruit = new Recruit();
        recruit.setrId(1);
        System.out.println(recruitService.getRecruit(recruit));
    }

    @Test
    public void getPageRecruit(){//Recruit pageHelper分页查找??????????有问题！！！！！！！！！！！！！
        System.out.println(recruitService.getList(0,5));
    }

    @Test
    public void getRecruitVos(){
        List<RecruitVo> recruitVos = recruitVoService.getRecruitVos();
        System.out.println(recruitVos);
    }

    @Test
    public void getInvitedVos(){
        Invited invited = new Invited();
        //invited.setrId(1);
        invited.setuId(3);
        List<InvitedVo> invitedVos = invitedVoService.getInvitedVos(invited);
        System.out.println(invitedVos);
        for (InvitedVo invitedVo : invitedVos) {
            System.out.println(invitedVo.getBio().getbName());
            System.out.println(invitedVo.getRecruitVo().getTitleVo().getDepartment().getdName());
            System.out.println(invitedVo.getRecruitVo().getTitleVo().gettName());
        }
    }

    @Test
    public void getTitleVos(){//【通过did】查询全部带有部门的职务
        Department department = new Department();
        department.setdId(12);
        List<TitleVo> titleVos = titleVoService.getTitleVos(department);
        System.out.println(titleVos);
    }

    @Test
    public void getTitleVo(){//通过tid查询带有部门的职务
        TitleVo title = new TitleVo();//有点问题，传的TitleVo中，tid不能为null
        title.settId(1);
        TitleVo titleVo = titleVoService.getTitleVo(title);
        System.out.println(titleVo);
    }

    @Test
    public void getStaffVos(){//待考察
        StaffVo staffVo = new StaffVo();
        //staffVo.setsId(1);
        staffVo.setsHiredate("2018-2");
        List<StaffVo> staffVos = staffVoService.getStaffVos(staffVo);
        System.out.println(staffVos);
    }

    @Test
    public void getManageVos(){//通过培训管理表，查询出某个培训的员工【或】某个员工的培训
        ManageVo manageVo = new ManageVo();
        //manageVo.setgId(1);
        manageVo.setsId(4);
        List<ManageVo> mVo = manageVoService.getManageVo(manageVo);
        System.out.println(mVo);
    }

    @Test
    public void getGrooms(){
        List<Groom> grooms = groomService.getGrooms();
        System.out.println(grooms);
    }

    @Test
    public void getClockVos() throws ParseException {
        Clock clock = new Clock();
        clock.setsId(4);
        Date date = new Date();
        Date date1 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-");
        String dateNowStr = sdf.format(date);
        List<ClockVo> clockVos = clockVoService.getClockVos(clock);
        List<String> lDate = new ArrayList<>();
        if(clockVos.size()>0){
            for (int i = clockVos.size()-1; i >= 0; i--) {
                System.out.println(dateNowStr.equals(clockVos.get(i).getcData().substring(0,8)));
                if(!dateNowStr.equals(clockVos.get(i).getcData().substring(0,8))){
                    clockVos.remove(i);
                }
            }
            for (int i = 0; i < clockVos.size(); i++) {
                SimpleDateFormat newSdf = new SimpleDateFormat("yyyy-MM-dd");
                Date parse = newSdf.parse(clockVos.get(i).getcData());
                lDate.add(parse.getTime()/1000+"");
            }
        }
    }

    @Test
    public void getEarnings() throws ParseException{
        Earnings earnings = new Earnings();
        earnings.setsId(4);
        List<Earnings> earnings1 = earningsService.getEarnings(earnings);
        System.out.println(earnings1);
    }

    @Test
    public void getEarningsVo() throws ParseException{//通过员工id或者结算年月查找薪资结算
        Earnings earnings = new Earnings();
        //earnings.setsId(1);
        earnings.seteTime("2018-12");
        List<EarningsVo> earningsVo = earningsVoService.getEarningsVo(earnings);
        System.out.println(earningsVo);
    }

    @Test
    public void getLastMonth(){
        System.out.println(MyUtil.getLastMonth());
    }

    @Test
    public void getAgeFromBirthTime(){
        System.out.println(AgeUtils.getAgeFromBirthTime("1995-6"));
    }

    @Test
    public void getPrizeVos() throws ParseException{
        Prize prize = new Prize();
        //prize.setsId(4);
        prize.setpTime(MyUtil.getLastMonth());
        List<Prize> prizes = prizeVoService.getPrizes(prize);
        System.out.println(prizes);
    }

    @Test
    public void getClockVos_2() throws ParseException{
        Clock clock = new Clock();
        //clock.setsId(5);
        clock.setcData("2019-01-01");//与员工id一起使用时只需要年月，单独使用需要年月日
        List<ClockVo> clockVos = clockVoService.getClockVos(clock);
        System.out.println(clockVos);
    }

}

