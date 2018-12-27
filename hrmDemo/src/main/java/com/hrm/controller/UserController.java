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
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private BioService bioService;

    @RequestMapping("/index")
    public String index() throws Exception{
        return "index";
    }

    @RequestMapping("/get")
    public String get() throws Exception{
        return "normal/login";
    }

    @RequestMapping("/getBio")
    public String getBio(HttpSession session) throws Exception{
        User user = (User) session.getAttribute("user");
        Bio bio = null;
        if(user==null){
            return "normal/login";
        }else {
            bio = bioService.getBio(user);
            session.setAttribute("bio",bio);
        }
        System.out.println(bio);
        if(bio == null){
            return "normal/wBio";
        }
        return "normal/rBio";
    }

    @RequestMapping("/login")
    public String login(User user,HttpSession session)throws Exception{
        System.out.println(user);
        User user1 = userService.login(user);
        System.out.println(user1);
        if (user1!=null){
            session.setAttribute("user",user1);
            return "index";
        }
        return "normal/login";
    }

    @RequestMapping("/register")
    public String register(User user, HttpSession session)throws Exception{
        System.out.println(user);
        userService.register(user);
        return "normal/login";
    }
}
