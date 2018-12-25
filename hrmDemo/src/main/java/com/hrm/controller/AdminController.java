package com.hrm.controller;

import com.hrm.model.Department;
import com.hrm.model.DepartmentVo;
import com.hrm.service.DepartmentService;
import com.hrm.service.DepartmentVoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {
    @Resource
    private DepartmentService departmentService;
    @Resource
    private DepartmentVoService departmentVoService;

    @RequestMapping("/menu")
    public String menu() throws Exception{
        return "admin/menu";
    }

    @RequestMapping("/depart")
    public String depart(HttpSession session) throws Exception{
        List<Department> departments = departmentService.getDepartments();
        List<DepartmentVo> departmentVos = departmentVoService.getDepartmentVos();
        System.out.println(departmentVos);
        session.setAttribute("departments",departments);
        return "admin/depart";
    }
}
