package com.hrm.service.Impl;

import com.hrm.dao.TitleMapper;
import com.hrm.model.Title;
import com.hrm.model.TitleExample;
import com.hrm.service.TitleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TitleServiceImpl implements TitleService {
    @Resource
    private TitleMapper titleMapper;
    @Override
    public int addTitle(Title title) {
        int sign = 0;
        TitleExample titleExample = new TitleExample();
        for (Title t : titleMapper.selectByExample(titleExample)) {
            if (title.getdId() == t.getdId() && title.gettName().equals(t.gettName())) {
                sign = -1;
            }
        }
        if(sign == 0){
            return titleMapper.insertSelective(title);
        }
        return sign;
    }

    @Override
    public int delTitle(Title title) {
        if(1!=1){//判断是否有这个员工

        }
        return titleMapper.deleteByPrimaryKey(title.gettId());
    }

    @Override
    public List<Title> getTitles() {
        TitleExample titleExample = new TitleExample();
        return titleMapper.selectByExample(titleExample);
    }
}
