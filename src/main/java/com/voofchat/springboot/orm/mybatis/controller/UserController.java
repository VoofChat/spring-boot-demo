package com.voofchat.springboot.orm.mybatis.controller;

import com.voofchat.springboot.orm.mybatis.po.User;
import com.voofchat.springboot.orm.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 12:13 AM
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") Integer id) {
        System.out.println("id=" + id);
        return userService.getUserById(id);
    }
}
