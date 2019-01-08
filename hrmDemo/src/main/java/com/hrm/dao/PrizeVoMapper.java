package com.hrm.dao;

import com.hrm.model.ClockVo;
import com.hrm.model.Prize;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PrizeVoMapper {
    List<Prize> getPrizes(Prize prize);
}