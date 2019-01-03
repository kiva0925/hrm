package com.hrm.service.Impl;

import com.hrm.dao.InvitedMapper;
import com.hrm.dao.StaffMapper;
import com.hrm.dao.UserMapper;
import com.hrm.model.*;
import com.hrm.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffMapper staffMapper;
    @Resource
    private InvitedMapper invitedMapper;

    @Override
    public int addStaff(Staff staff) {
        InvitedExample invitedExample = new InvitedExample();
        InvitedExample.Criteria criterion = invitedExample.createCriteria();
        criterion.andBIdEqualTo(staff.getbId());
        invitedMapper.deleteByExample(invitedExample);
        return staffMapper.insertSelective(staff);
    }

    @Override
    public int updateStaff(Staff staff) {
        return staffMapper.updateByPrimaryKeySelective(staff);
    }

    @Override
    public Staff getStaffByBid(Integer bId) {
        StaffExample staffExample = new StaffExample();
        StaffExample.Criteria criterion = staffExample.createCriteria();
        criterion.andBIdEqualTo(bId);
        List<Staff> s = staffMapper.selectByExample(staffExample);
        if(s.size() != 0){
            return s.get(0);
        }
        return null;
    }
}
