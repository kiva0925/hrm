package com.hrm.dao;

import com.hrm.model.Invited;
import com.hrm.model.InvitedVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InvitedVoMapper {
    List<InvitedVo> getInvitedVos(Invited invited);
}
