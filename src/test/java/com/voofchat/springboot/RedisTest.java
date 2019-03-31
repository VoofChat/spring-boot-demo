package com.voofchat.springboot;

import com.voofchat.springboot.redis.App;
import com.voofchat.springboot.redis.RedisService;
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
public class RedisTest {

    @Autowired
    private RedisService redisService;

    @Test
    public void testSetValue() {
        redisService.setValue("name", "zhengzhixiong");
    }

    @Test
    public void testGetValue() {
        Object name = redisService.getValue("name");
        System.out.println(name);
    }

}
