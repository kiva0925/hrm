package com.hrm.dao;

import com.hrm.model.Department;
import com.hrm.model.TitleVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TitleVoMapper {
    List<TitleVo> getTitleVos(Department department);
    TitleVo getTitleVo(TitleVo titleVo);
}