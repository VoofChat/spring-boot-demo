package com.voofchat.springboot;


import com.voofchat.springboot.junittest.App;
import com.voofchat.springboot.junittest.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 11:42 AM
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUser() {
        String userInfo = userService.getUserInfo(1);
        System.out.println(userInfo);
    }
}
