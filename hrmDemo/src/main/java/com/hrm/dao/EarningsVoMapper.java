package com.hrm.dao;

import com.hrm.model.Earnings;
import com.hrm.model.EarningsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EarningsVoMapper {
    List<EarningsVo> getEarningsVo(Earnings earnings);
}