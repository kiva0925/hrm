package com.hrm.service;

import com.hrm.model.Invited;
import com.hrm.model.InvitedVo;

import java.util.List;

public interface InvitedVoService {
    List<InvitedVo> getInvitedVos(Invited invited);
}
