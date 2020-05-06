package com.ynyyaya.mapper;

import com.ynyyaya.pojo.User;

import java.util.List;

/**
 * @Author:yhb
 * @Date:2020/4/30
 * @Description:com.ynyyaya.mapper
 * @version:1.0
 */
public interface UserMapper {
    void insertUser(User user);
    List<User> selectUsers();
}
