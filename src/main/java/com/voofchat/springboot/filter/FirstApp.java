package com.voofchat.springboot.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/30
 * @time: 10:50 PM
 * Description:
 */
@SpringBootApplication
@ServletComponentScan
public class FirstApp {

    public static void main(String[] args) {
        SpringApplication.run(FirstApp.class, args);
    }
}
