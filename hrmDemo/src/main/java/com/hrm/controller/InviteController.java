package com.hrm.controller;

import com.hrm.model.Invited;
import com.hrm.model.InvitedVo;
import com.hrm.service.DepartmentService;
import com.hrm.service.InvitedVoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class InviteController {
    @Resource
    private InvitedVoService invitedVoService;

    @RequestMapping("/inter")
    public String inter(Invited invited,HttpSession session, Model model) throws Exception{
        List<InvitedVo> invitedVos = invitedVoService.getInvitedVos(invited);
        invited.setrId(null);
        List<InvitedVo> AllinvitedVo = invitedVoService.getInvitedVos(invited);
        session.setAttribute("invitedVosByRId",invitedVos);
        session.setAttribute("invitedVos",AllinvitedVo);
        return "admin/interview";
    }
}
