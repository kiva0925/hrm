package com.hrm.service.Impl;

import com.hrm.dao.InvitedMapper;
import com.hrm.model.Invited;
import com.hrm.model.InvitedExample;
import com.hrm.service.InvitedService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InvitedServiceImpl implements InvitedService {
    @Resource
    private InvitedMapper invitedMapper;
    @Override
    public int addInvited(Invited invited) {
        InvitedExample invitedExample = new InvitedExample();
        InvitedExample.Criteria criterion = invitedExample.createCriteria();
        criterion.andUIdEqualTo(invited.getuId());
        criterion.andBIdEqualTo(invited.getbId());
        criterion.andRIdEqualTo(invited.getrId());
        List<Invited> inviteds = invitedMapper.selectByExample(invitedExample);
        if(inviteds.size()>0){
            return -1;//该用户的这份简历已经投递过这个职位了
        }
        return invitedMapper.insertSelective(invited);
    }

    @Override
    public int updateInvited(Invited invited) {
        return invitedMapper.updateByPrimaryKeySelective(invited);
    }
}
