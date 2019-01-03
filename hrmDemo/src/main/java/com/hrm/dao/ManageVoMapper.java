package com.hrm.dao;

import com.hrm.model.DepartmentVo;
import com.hrm.model.ManageVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManageVoMapper {
    List<ManageVo> getManageVo(ManageVo manageVo);
}
