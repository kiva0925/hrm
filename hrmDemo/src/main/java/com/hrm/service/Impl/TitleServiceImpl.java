package com.hrm.service.Impl;

import com.hrm.dao.StaffVoMapper;
import com.hrm.dao.TitleMapper;
import com.hrm.model.StaffVo;
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
    @Resource
    private StaffVoMapper staffVoMapper;
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
        StaffVo staffVo = new StaffVo();
        staffVo.settId(title.gettId());
        List<StaffVo> staffVos = staffVoMapper.getStaffVos(staffVo);
        if(staffVos.size()>0){//判断是否有这个员工
            return 0;//有员工不能删除
        }
        return titleMapper.deleteByPrimaryKey(title.gettId());
    }

    @Override
    public List<Title> getTitles() {
        TitleExample titleExample = new TitleExample();
        return titleMapper.selectByExample(titleExample);
    }
}
