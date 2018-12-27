package com.hrm.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hrm.dao.RecruitMapper;
import com.hrm.model.Recruit;
import com.hrm.model.RecruitExample;
import com.hrm.service.RecruitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.print.Doc;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource
    private RecruitMapper recruitMapper;

    @Override
    public int addRecruit(Recruit recruit) {
        RecruitExample recruitExample = new RecruitExample();
        RecruitExample.Criteria criterion = recruitExample.createCriteria();
        criterion.andTIdEqualTo(recruit.gettId());
        List<Recruit> recruits = recruitMapper.selectByExample(recruitExample);
        if(recruits.size()>0){//已有该职位的招聘信息
            return -1;
        }
        return recruitMapper.insertSelective(recruit);
    }

    @Override
    public int updateRecruit(Recruit recruit) {
        return recruitMapper.updateByPrimaryKeySelective(recruit);
    }

    @Override
    public Recruit getRecruit(Recruit recruit) {
        return recruitMapper.selectByPrimaryKey(recruit.getrId());
    }

    @Override
    public List<Recruit> recruits() {
        RecruitExample recruitExample = new RecruitExample();
        return recruitMapper.selectByExample(recruitExample);
    }

    @Override
    public List<Recruit> getList(int pageNum, int pageSize) {
        RecruitExample recruitExample = new RecruitExample();
        PageHelper.startPage(pageNum, pageSize);
        List<Recruit> typeList2 = recruitMapper.selectByExample(recruitExample);
        return typeList2;
    }
}
