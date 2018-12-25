package com.hrm.app;

import com.hrm.dao.UserMapper;
import com.hrm.model.User;
import com.hrm.model.UserExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class UserTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws Exception {
        // 创建sqlSessionFactory
        String resource = "SqlMapConfig.xml"; // mybatis配置文件
        // 得到配置文件的流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建会话工厂SqlSessionFactory,要传入mybaits的配置文件的流
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
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
