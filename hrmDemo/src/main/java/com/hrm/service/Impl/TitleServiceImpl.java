package com.hrm.service.Impl;

import com.hrm.dao.TitleMapper;
import com.hrm.model.Title;
import com.hrm.service.TitleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TitleServiceImpl implements TitleService {
    @Resource
    private TitleMapper titleMapper;
    @Override
    public int addTitle(Title title) {
        return titleMapper.insertSelective(title);
    }
}
