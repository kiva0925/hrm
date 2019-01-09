package com.hrm.service.Impl;

import com.hrm.dao.QuitMapper;
import com.hrm.dao.StaffMapper;
import com.hrm.dao.UserMapper;
import com.hrm.model.*;
import com.hrm.service.EarningsService;
import com.hrm.service.QuitService;
import com.hrm.util.MyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuitServiceImpl implements QuitService {
    @Resource
    private QuitMapper quitMapper;
    @Resource
    private StaffMapper staffMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private EarningsService earningsService;

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
        if(quit.getsId()!=null){
            Staff staff = new Staff();
            staff.setsId(quit.getsId());
            staff.setStId(2);
            staff.settId(0);
            earningsService.addEarnings(quit.getsId());//离职月工资结算
            staffMapper.updateByPrimaryKeySelective(staff);//修改员工表的状态
            UserExample userExample = new UserExample();
            UserExample.Criteria criterion = userExample.createCriteria();
            criterion.andUNameEqualTo(quit.getsId()+"");
            criterion.andUPassEqualTo(quit.getsId()+"");
            userMapper.deleteByExample(userExample);//删除员工的登陆窗口
        }
        quit.setqTime(MyUtil.getToday());
        return quitMapper.updateByPrimaryKeySelective(quit);//修改离职时间，完成离职操作
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
