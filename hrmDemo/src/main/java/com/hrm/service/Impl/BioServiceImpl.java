package com.hrm.service.Impl;

import com.hrm.dao.BioMapper;
import com.hrm.model.Bio;
import com.hrm.model.BioExample;
import com.hrm.model.User;
import com.hrm.service.BioService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BioServiceImpl implements BioService {
    @Resource
    private BioMapper bioMapper;
    @Override
    public int addBio(Bio bio) {
        return bioMapper.insertSelective(bio);
    }

    @Override
    public int updateVio(Bio bio) {
        return bioMapper.updateByPrimaryKeySelective(bio);
    }

    @Override
    public Bio getBio(User user) {
        BioExample bioExample = new BioExample();
        BioExample.Criteria criterion = bioExample.createCriteria();
        criterion.andUIdEqualTo(user.getuId());
        List<Bio> bios = bioMapper.selectByExample(bioExample);
        if(bios.size() != 0){
            return bios.get(0);
        }
        return null;
    }

    @Override
    public Bio getBio(Bio bio) {
        return bioMapper.selectByPrimaryKey(bio.getbId());
    }
}
