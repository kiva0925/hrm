package com.hrm.service;

import com.hrm.model.Department;

import java.util.List;

public interface DepartmentService {
    int adddepartment(Department department);
    List<Department> getDepartments();
}
