package com.hrm.controller;

import com.hrm.model.Department;
import com.hrm.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;

    @RequestMapping("/adddepartment")
    public String depart(Department department,HttpSession session) throws Exception{
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(new Date());
        department.setdCreation(date);
        System.out.println(department);
        String sign = null;
        if(departmentService.adddepartment(department)>0){
            sign = "创建成功";
        }else {
            sign = "创建失败";
        }
        return "admin/depart";
    }
}
