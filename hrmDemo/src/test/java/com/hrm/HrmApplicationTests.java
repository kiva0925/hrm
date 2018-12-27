package com.hrm;

import com.hrm.model.Recruit;
import com.hrm.service.RecruitService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HrmApplicationTests {
    @Resource
    private RecruitService recruitService;

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

}

