package com.hrm.service.Impl;

import com.hrm.dao.InvitedVoMapper;
import com.hrm.model.Invited;
import com.hrm.model.InvitedVo;
import com.hrm.service.InvitedVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InvitedVoServiceImpl implements InvitedVoService {
    @Resource
    private InvitedVoMapper invitedVoMapper;
    @Override
    public List<InvitedVo> getInvitedVos(Invited invited) {
        return invitedVoMapper.getInvitedVos(invited);
    }
}
