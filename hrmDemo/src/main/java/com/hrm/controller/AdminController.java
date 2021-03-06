package com.hrm.controller;

import com.hrm.model.Department;
import com.hrm.model.DepartmentVo;
import com.hrm.service.DepartmentService;
import com.hrm.service.DepartmentVoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
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
    public String depart(HttpSession session, Model model, HttpServletResponse response) throws Exception{
        List<Department> departments = departmentService.getDepartments();
        String sign = (String) session.getAttribute("sign");
        if(sign != null){
            response.getWriter().print("<script>alert(\""+sign+"\");</script>");
        }
        session.removeAttribute("sign");
        session.setAttribute("departments",departments);
        return "admin/depart";
    }
}
