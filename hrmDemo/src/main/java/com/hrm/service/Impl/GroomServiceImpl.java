package com.hrm.service.Impl;

import com.hrm.dao.GroomMapper;
import com.hrm.model.Groom;
import com.hrm.model.GroomExample;
import com.hrm.model.UserExample;
import com.hrm.service.GroomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GroomServiceImpl implements GroomService {
    @Resource
    private GroomMapper groomMapper;

    @Override
    public int addGroom(Groom groom) {
        groom.setgType("未发布");
        return groomMapper.insertSelective(groom);
    }

    @Override
    public int deleteGroom(Integer gId) {
        return groomMapper.deleteByPrimaryKey(gId);
    }

    @Override
    public int updateGroom(Groom groom) {
        return groomMapper.updateByPrimaryKeySelective(groom);
    }

    @Override
    public List<Groom> getGrooms() {
        GroomExample groomExample = new GroomExample();
        return groomMapper.selectByExample(groomExample);
    }
}
