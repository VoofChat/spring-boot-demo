package com.voofchat.springboot.ehcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 11:39 AM
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Cacheable(cacheNames = "user")
    public User getUserInfo(Integer id) {

        System.out.println("service query !");

        return userDao.getUserById(1);
    }

    @Override
    @CacheEvict(cacheNames = "user", allEntries = true) // 清除缓存
    public void saveUser(User user) {
        System.out.println("service save !");
        userDao.save(user);
    }


}
