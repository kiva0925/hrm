package com.hrm.controller;

import com.hrm.model.Title;
import com.hrm.service.DepartmentService;
import com.hrm.service.TitleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TitleController {
    @Resource
    private DepartmentService departmentService;
    @Resource
    private TitleService titleService;

    @RequestMapping("/addTitle")
    public String addTitle(Title title, Model model) throws Exception{
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());
        title.settCreation(date);
        String sign = null;
        if(title != null){
            if(titleService.addTitle(title)>0){
                sign = "创建成功";
            }else {
                sign = "创建失败";
            }
            model.addAttribute("sign",sign);
            return "admin/depart";
        }else {
            sign = "空";
            model.addAttribute("sign",sign);
            return "admin/depart";
        }
    }
}
