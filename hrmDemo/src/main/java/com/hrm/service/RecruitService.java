package com.hrm.service;

import com.github.pagehelper.PageInfo;
import com.hrm.model.Recruit;

import java.util.List;

public interface RecruitService {
    int addRecruit(Recruit recruit);
    int updateRecruit(Recruit recruit);
    Recruit getRecruit(Recruit recruit);
    List<Recruit> recruits();
    List<Recruit> getList(int pageNum, int pageSize);
}
