package com.voofchat.springboot.ehcache;

import org.springframework.stereotype.Repository;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 11:39 AM
 * Description:
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public void save(User user) {
        System.out.println("query save by mysql!");
    }

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setName("zhengzhixiong");
        user.setPassword("123456");

        System.out.println("query user by mysql!");
        return user;
    }
}
