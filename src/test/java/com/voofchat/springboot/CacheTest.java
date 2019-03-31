package com.voofchat.springboot;

import com.voofchat.springboot.ehcache.User;
import com.voofchat.springboot.ehcache.UserService;
import com.voofchat.springboot.ehcache.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 1:56 PM
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})
public class CacheTest {

    @Autowired
    private UserService userService;

    @Test
    public void testQueryCache() {
        User user = userService.getUserInfo(1);
        System.out.println(user);

        user = new User();
        user.setPassword("qwer");
        user.setName("zhengzhixiong");
        userService.saveUser(user);

        user = userService.getUserInfo(1);
        System.out.println(user);
    }

}
