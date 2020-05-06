package com.ynyyaya.test;

import com.ynyyaya.mapper.UserMapper;
import com.ynyyaya.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author:yhb
 * @Date:2020/4/30
 * @Description:com.ynyyaya.test
 * @version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void insertUser(){
        User user = new User();
        user.setUserId(2);
        user.setUserName("yhb");
        userMapper.insertUser(user);
    }
    @Test
    public void getUsers(){
        List<User> users = userMapper.selectUsers();
        for(User user:users){
            System.out.println(user.getUserId()+"  "+user.getUserName());
        }
    }
}
