package com.ynyyaya.service.impl;

import com.ynyyaya.mapper.UserMapper;
import com.ynyyaya.pojo.User;
import com.ynyyaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:yhb
 * @Date:2020/5/1
 * @Description:com.ynyyaya.service.impl
 * @version:1.0
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    public void addUser(User user) {
        userMapper.insertUser(user);
    }
}
