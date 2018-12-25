package com.hrm.service.Impl;

import com.hrm.dao.DepartmentVoMapper;
import com.hrm.model.DepartmentVo;
import com.hrm.service.DepartmentVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentVoServiceImpl implements DepartmentVoService {
    @Resource
    private DepartmentVoMapper departmentVoMapper;
    @Override
    public List<DepartmentVo> getDepartmentVos() {
        return departmentVoMapper.getDandT();
    }
}
