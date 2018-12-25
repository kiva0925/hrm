package com.hrm.controller;

import com.hrm.model.User;
import com.hrm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String index() throws Exception{
        return "index";
    }

    @RequestMapping("/login")
    public String login(User user, Model model, HttpServletRequest request)throws Exception{
        System.out.println(user);
        User user1 = userService.login(user);
        System.out.println(user1);
        if (user1!=null){
            model.addAttribute("u",user1);
            return "main";
        }
        return "../../index";
    }
}
