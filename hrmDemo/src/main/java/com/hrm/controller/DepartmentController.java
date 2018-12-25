package com.hrm.controller;

import com.hrm.model.Department;
import com.hrm.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String depart(Department department, HttpSession session, Model model) throws Exception{
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(new Date());
        department.setdCreation(date);
        String sign = null;
        List<Department> departments = (List<Department>) session.getAttribute("departments");
        for (Department d : departments) {
            if(d.getdName().equals(department.getdName())){
                sign = "已有该部门，无法创建";
            }
        }
        if(sign == null){
            if(departmentService.adddepartment(department)>0){
                sign = "创建成功";
                session.setAttribute("sign",sign);
                System.out.println(sign);
                return "redirect:depart";
            }else {
                sign = "创建失败";
            }
        }
        session.setAttribute("sign",sign);
        System.out.println(sign);
        return "admin/depart";
    }
}
