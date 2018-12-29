package com.hrm.dao;

import com.hrm.model.Invited;
import com.hrm.model.InvitedExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InvitedMapper {
    int countByExample(InvitedExample example);

    int deleteByExample(InvitedExample example);

    int deleteByPrimaryKey(Integer iId);

    int insert(Invited record);

    int insertSelective(Invited record);

    List<Invited> selectByExample(InvitedExample example);

    Invited selectByPrimaryKey(Integer iId);

    int updateByExampleSelective(@Param("record") Invited record, @Param("example") InvitedExample example);

    int updateByExample(@Param("record") Invited record, @Param("example") InvitedExample example);

    int updateByPrimaryKeySelective(Invited record);

    int updateByPrimaryKey(Invited record);
}