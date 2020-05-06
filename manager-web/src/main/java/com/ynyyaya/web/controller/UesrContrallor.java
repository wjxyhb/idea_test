package com.ynyyaya.web.controller;

import com.ynyyaya.pojo.User;
import com.ynyyaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * @Author:yhb
 * @Date:2020/5/1
 * @Description:com.ynyyaya.web.controller
 * @version:1.0
 */
@Controller
@RequestMapping("/user")
public class UesrContrallor {
    @Autowired
    private UserService userService;
    @RequestMapping("/addUser")
    public String addUser(User user){
        user.setUserId(((int) Math.random()*100));
        
        userService.addUser(user);
        return "ok";
    }
}
