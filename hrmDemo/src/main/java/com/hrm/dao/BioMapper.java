package com.hrm.dao;

import com.hrm.model.Bio;
import com.hrm.model.BioExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BioMapper {
    int countByExample(BioExample example);

    int deleteByExample(BioExample example);

    int deleteByPrimaryKey(Integer bId);

    int insert(Bio record);

    int insertSelective(Bio record);

    List<Bio> selectByExample(BioExample example);

    Bio selectByPrimaryKey(Integer bId);

    int updateByExampleSelective(@Param("record") Bio record, @Param("example") BioExample example);

    int updateByExample(@Param("record") Bio record, @Param("example") BioExample example);

    int updateByPrimaryKeySelective(Bio record);

    int updateByPrimaryKey(Bio record);
}