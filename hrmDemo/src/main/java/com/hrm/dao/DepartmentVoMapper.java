package com.hrm.dao;

import com.hrm.model.DepartmentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentVoMapper {
    List<DepartmentVo> getDandT();
}
