package com.voofchat.springboot.junittest;

import org.springframework.stereotype.Service;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 11:39 AM
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserInfo(Integer id) {
        return "user info";
    }
}
