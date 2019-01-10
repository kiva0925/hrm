package com.hrm.service.Impl;

import com.hrm.dao.DepartmentMapper;
import com.hrm.dao.StaffVoMapper;
import com.hrm.dao.TitleMapper;
import com.hrm.model.Department;
import com.hrm.model.DepartmentExample;
import com.hrm.model.StaffVo;
import com.hrm.model.TitleExample;
import com.hrm.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private TitleMapper titleMapper;
    @Resource
    private StaffVoMapper staffVoMapper;

    @Override
    public int adddepartment(Department department) {
        return departmentMapper.insertSelective(department);
    }

    @Override
    public int deldepartment(Department department) {
        StaffVo staffVo = new StaffVo();
        List<StaffVo> staffVos = staffVoMapper.getStaffVos(staffVo);
        for (int i = 0; i < staffVos.size(); i++) {
            if(staffVos.get(i).getTitleVo().getDepartment().getdId()!=department.getdId()){
                staffVos.remove(i);
                i--;
            }
        }
        if(staffVos.size()>0){//判断是否有这个员工
            return 0;//有员工不能删除
        }
        TitleExample titleExample = new TitleExample();
        TitleExample.Criteria criterion = titleExample.createCriteria();
        criterion.andDIdEqualTo(department.getdId());
        titleMapper.deleteByExample(titleExample);
        return departmentMapper.deleteByPrimaryKey(department.getdId());
    }

    @Override
    public List<Department> getDepartments() {
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criterion = departmentExample.createCriteria();
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        return departments;
    }
}
