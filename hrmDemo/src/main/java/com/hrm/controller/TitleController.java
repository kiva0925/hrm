package com.hrm.controller;

import com.hrm.model.Department;
import com.hrm.model.DepartmentVo;
import com.hrm.model.Title;
import com.hrm.service.DepartmentService;
import com.hrm.service.DepartmentVoService;
import com.hrm.service.TitleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TitleController {
    @Resource
    private TitleService titleService;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private DepartmentVoService departmentVoService;
    private String sign_t = null;

    @RequestMapping("/getTitle")
    public String getTitle(HttpSession session, HttpServletResponse response) throws Exception{
        List<Department> departments = departmentService.getDepartments();
        List<DepartmentVo> departmentVos = departmentVoService.getDepartmentVos();
        String sign_t = (String) session.getAttribute("sign_t");
        if(sign_t != null){
            response.getWriter().print("<script>alert(\""+sign_t+"\");</script>");
        }
        session.removeAttribute("sign_t");
        List<Title> titles = titleService.getTitles();
        session.setAttribute("departments",departments);
        session.setAttribute("departmentVos",departmentVos);
        session.setAttribute("titles",titles);
        return "admin/title";
    }

    @RequestMapping("/addTitle")
    public String addTitle(Title title, HttpServletResponse response,HttpSession session) throws Exception{
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());
        title.settCreation(date);
        String sign_t = null;
        int yn = titleService.addTitle(title);
        if(yn>0){
            sign_t = "创建成功";
        }else if(yn<0){
            sign_t = "该部门已有此职位";
        }else {
            sign_t = "创建失败";
        }
        session.setAttribute("sign_t",sign_t);
        return "redirect:getTitle";
    }

    @RequestMapping("/selectTitle")
    @ResponseBody
    public List<Title> selectTitle(Integer did,HttpSession session) throws Exception{
        List<DepartmentVo> departmentVos = (List<DepartmentVo>) session.getAttribute("departmentVos");
        for (DepartmentVo dv : departmentVos) {
            if(did.equals(dv.getdId())){
                return dv.getTitles();
            }
        }
        return null;
    }


    @RequestMapping("/delTitle")
    @ResponseBody
    public void delTitle(Integer tId,HttpSession session) throws Exception{
        Title title = new Title();
        title.settId(tId);
        if(titleService.delTitle(title)>0){
            sign_t = "删除成功";
        }else {
            sign_t = "删除失败";
        }
        session.setAttribute("sign_t",sign_t);
        //return "redirect:getTitle";
    }
}
