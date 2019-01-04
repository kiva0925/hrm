package com.hrm.dao;

import com.hrm.model.Clock;
import com.hrm.model.ClockExample;
import com.hrm.model.ClockVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClockVoMapper {
    List<ClockVo> getClockVos(Clock clock);
}