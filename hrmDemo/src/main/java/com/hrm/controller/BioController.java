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
public class BioController {
    @Resource
    private UserService userService;
    @Resource
    private BioService bioService;

    @RequestMapping("/addBio")
    public String addBio(Bio bio,HttpSession session)throws Exception{
        User user = (User) session.getAttribute("user");
        bio.setuId(user.getuId());
        System.out.println(bio);
        bioService.addBio(bio);
        return "redirect:getBio";
    }

    @RequestMapping("/checkBio")
    public String checkBio(Bio bio,HttpSession session)throws Exception{
        System.out.println(bio);
        Bio bio1 = bioService.getBio(bio);
        session.setAttribute("bio",bio1);
        return "normal/rBio";
    }
}
