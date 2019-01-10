package com.hrm.controller;

import com.hrm.model.Department;
import com.hrm.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;
    private String sign = null;

    @RequestMapping("/adddepartment")
    public String adddepartment(Department department, HttpSession session, Model model, HttpServletResponse response) throws Exception{
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(new Date());
        sign = null;
        department.setdCreation(date);
        List<Department> departments = (List<Department>) session.getAttribute("departments");
        for (Department d : departments) {
            if(d.getdName().equals(department.getdName())){
                System.out.println(d.getdName().equals(department.getdName()));
                sign = "已有该部门，无法创建";
            }
        }
        System.out.println(sign);
        if(sign == null){
            if(departmentService.adddepartment(department)>0){
                sign = "创建成功";
                session.setAttribute("sign",sign);
                return "redirect:depart";
            }else {
                sign = "创建失败";
            }
        }
        if(sign != null){
            response.getWriter().print("<script>alert(\""+sign+"\");</script>");
        }
        sign = null;
        return "admin/depart";
    }

    @RequestMapping("/deldepartment")
    public String deldepartment(Department department, HttpSession session, Model model) throws Exception{
        System.out.println(department);
        if(department.getdId()!=0){
            if(departmentService.deldepartment(department)>0){
                sign = "删除成功";
            }else {
                sign = "删除失败";
            }
        }else {
            sign = "删除失败,请选择有效的部门";
        }
        session.setAttribute("sign",sign);
        return "redirect:depart";
    }
}
