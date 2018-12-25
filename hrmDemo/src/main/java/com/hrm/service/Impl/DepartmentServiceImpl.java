package com.hrm.service.Impl;

import com.hrm.dao.DepartmentMapper;
import com.hrm.model.Department;
import com.hrm.model.DepartmentExample;
import com.hrm.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public int adddepartment(Department department) {
        return departmentMapper.insertSelective(department);
    }

    @Override
    public List<Department> getDepartments() {
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criterion = departmentExample.createCriteria();
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        return departments;
    }
}
