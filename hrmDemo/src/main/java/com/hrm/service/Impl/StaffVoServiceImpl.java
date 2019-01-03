package com.hrm.service.Impl;

import com.hrm.dao.StaffMapper;
import com.hrm.dao.StaffVoMapper;
import com.hrm.model.StaffVo;
import com.hrm.service.StaffVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffVoServiceImpl implements StaffVoService {
    @Resource
    private StaffMapper staffMapper;
    @Resource
    private StaffVoMapper staffVoMapper;

    @Override
    public List<StaffVo> getStaffVos(StaffVo staffVo) {
        return staffVoMapper.getStaffVos(staffVo);
    }
}
