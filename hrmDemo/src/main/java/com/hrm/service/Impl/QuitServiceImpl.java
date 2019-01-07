package com.hrm.service.Impl;

import com.hrm.dao.QuitMapper;
import com.hrm.model.Quit;
import com.hrm.model.QuitExample;
import com.hrm.service.QuitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuitServiceImpl implements QuitService {
    @Resource
    private QuitMapper quitMapper;

    @Override
    public int addQuit(Quit quit) {
        return quitMapper.insertSelective(quit);
    }

    @Override
    public int deleteQuit(Integer qId) {
        return quitMapper.deleteByPrimaryKey(qId);
    }

    @Override
    public int updateQuit(Quit quit) {
        return quitMapper.updateByPrimaryKeySelective(quit);
    }

    @Override
    public List<Quit> getQuit(Quit quit) {
        QuitExample quitExample = new QuitExample();
        QuitExample.Criteria criterion = quitExample.createCriteria();
        if(quit.getsId()!=null){
            criterion.andSIdEqualTo(quit.getsId());
        }
        List<Quit> quits = quitMapper.selectByExample(quitExample);
        if(quits.size()>0){
            return quits;
        }
        return null;
    }
}
