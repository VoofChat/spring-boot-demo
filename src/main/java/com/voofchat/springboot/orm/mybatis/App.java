package com.voofchat.springboot.orm.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/30
 * @time: 11:53 PM
 * Description:
 */
@SpringBootApplication
@MapperScan("com.voofchat.springboot.orm.mybatis.mapper") // 用于扫描mybaits mapper文件
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
