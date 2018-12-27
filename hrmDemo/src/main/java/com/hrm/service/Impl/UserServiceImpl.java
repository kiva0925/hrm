package com.hrm.service.Impl;

import com.hrm.dao.UserMapper;
import com.hrm.model.User;
import com.hrm.model.UserExample;
import com.hrm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public int register(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criterion = userExample.createCriteria();
        criterion.andUNameEqualTo(user.getuName());
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size()>0){
            return 0;//已存在
        }
        return userMapper.insertSelective(user);
    }

    @Override
    public User login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criterion = userExample.createCriteria();
        criterion.andUNameEqualTo(user.getuName());
        criterion.andUPassEqualTo(user.getuPass());
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size()>0){
            return users.get(0);
        }
        return null;
    }
}
