package com.hrm.dao;

import com.hrm.model.Clock;
import com.hrm.model.ClockExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClockMapper {
    int countByExample(ClockExample example);

    int deleteByExample(ClockExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Clock record);

    int insertSelective(Clock record);

    List<Clock> selectByExample(ClockExample example);

    Clock selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Clock record, @Param("example") ClockExample example);

    int updateByExample(@Param("record") Clock record, @Param("example") ClockExample example);

    int updateByPrimaryKeySelective(Clock record);

    int updateByPrimaryKey(Clock record);
}