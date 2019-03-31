package com.voofchat.springboot.orm.mybatis.service.impl;

import com.voofchat.springboot.orm.mybatis.mapper.UserMapper;
import com.voofchat.springboot.orm.mybatis.po.User;
import com.voofchat.springboot.orm.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 12:11 AM
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
//        return new User();
        return userMapper.selectByPrimaryKey(id);
    }
}
