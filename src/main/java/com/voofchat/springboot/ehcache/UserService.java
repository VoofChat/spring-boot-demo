package com.voofchat.springboot.ehcache;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 11:39 AM
 * Description:
 */
public interface UserService {

    User getUserInfo(Integer id);

    void saveUser(User user);
}
