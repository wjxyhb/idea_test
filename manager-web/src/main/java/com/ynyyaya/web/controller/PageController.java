package com.ynyyaya.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:yhb
 * @Date:2020/5/1
 * @Description:com.ynyyaya.web.controller
 * @version:1.0
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        System.out.println(page);
        return page;
    }
}
