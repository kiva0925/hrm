package com.hrm.controller;

import com.hrm.model.Bio;
import com.hrm.model.User;
import com.hrm.service.BioService;
import com.hrm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class CalculationController {
    @Resource
    private UserService userService;
    @Resource
    private BioService bioService;

    @RequestMapping("/getCalculation")
    public String getCalculation(HttpSession session){
        return "admin/calculation";
    }
}
