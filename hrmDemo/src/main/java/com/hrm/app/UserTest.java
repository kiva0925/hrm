package com.hrm.app;

import com.hrm.dao.UserMapper;
import com.hrm.model.User;
import com.hrm.model.UserExample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class UserTest {
    private SqlSessionFactory sqlSessionFactory;
    @Test
    public void getUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserExample userExample = new UserExample();
        UserExample.Criteria criterion = userExample.createCriteria();
        criterion.andUNameEqualTo("admin");
        criterion.andUPassEqualTo("admin");
        List<User> users = userMapper.selectByExample(userExample);
        System.out.println(users);
    }
}
