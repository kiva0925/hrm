package com.hrm.dao;

import com.hrm.model.Groom;
import com.hrm.model.GroomExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GroomMapper {
    int countByExample(GroomExample example);

    int deleteByExample(GroomExample example);

    int deleteByPrimaryKey(Integer gId);

    int insert(Groom record);

    int insertSelective(Groom record);

    List<Groom> selectByExample(GroomExample example);

    Groom selectByPrimaryKey(Integer gId);

    int updateByExampleSelective(@Param("record") Groom record, @Param("example") GroomExample example);

    int updateByExample(@Param("record") Groom record, @Param("example") GroomExample example);

    int updateByPrimaryKeySelective(Groom record);

    int updateByPrimaryKey(Groom record);
}