package com.voofchat.springboot.orm.mybatis.service;

import com.voofchat.springboot.orm.mybatis.po.User;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 12:11 AM
 * Description:
 */
public interface UserService {

    User getUserById(Integer id);
}
