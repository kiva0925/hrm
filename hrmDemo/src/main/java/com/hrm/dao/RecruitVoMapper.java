package com.hrm.dao;

import com.hrm.model.RecruitVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecruitVoMapper {
    List<RecruitVo> getRecruitVos();
}
