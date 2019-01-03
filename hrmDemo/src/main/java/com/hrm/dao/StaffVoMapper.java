package com.hrm.dao;

import com.hrm.model.Department;
import com.hrm.model.StaffVo;
import com.hrm.model.Title;
import com.hrm.model.TitleVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffVoMapper {
    //List<StaffVo> getStaffVosByDid(Department department);
    //List<StaffVo> getStaffVosByTid(Title title);
    //List<StaffVo> getStaffVosByTid(TitleVo titleVo);
    List<StaffVo> getStaffVos(StaffVo staffVo);
}