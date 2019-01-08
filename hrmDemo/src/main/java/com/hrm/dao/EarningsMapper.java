package com.hrm.dao;

import com.hrm.model.Earnings;
import com.hrm.model.EarningsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EarningsMapper {
    int countByExample(EarningsExample example);

    int deleteByExample(EarningsExample example);

    int deleteByPrimaryKey(Integer eId);

    int insert(Earnings record);

    int insertSelective(Earnings record);

    List<Earnings> selectByExample(EarningsExample example);

    Earnings selectByPrimaryKey(Integer eId);

    int updateByExampleSelective(@Param("record") Earnings record, @Param("example") EarningsExample example);

    int updateByExample(@Param("record") Earnings record, @Param("example") EarningsExample example);

    int updateByPrimaryKeySelective(Earnings record);

    int updateByPrimaryKey(Earnings record);
}