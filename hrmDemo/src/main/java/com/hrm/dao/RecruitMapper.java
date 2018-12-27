package com.hrm.dao;

import com.hrm.model.Recruit;
import com.hrm.model.RecruitExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RecruitMapper {
    int countByExample(RecruitExample example);

    int deleteByExample(RecruitExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(Recruit record);

    int insertSelective(Recruit record);

    List<Recruit> selectByExample(RecruitExample example);

    Recruit selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") Recruit record, @Param("example") RecruitExample example);

    int updateByExample(@Param("record") Recruit record, @Param("example") RecruitExample example);

    int updateByPrimaryKeySelective(Recruit record);

    int updateByPrimaryKey(Recruit record);

    List<Recruit> selectByPageAndSelections();
}