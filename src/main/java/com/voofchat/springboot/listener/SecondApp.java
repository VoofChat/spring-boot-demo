package com.voofchat.springboot.listener;

import com.voofchat.springboot.filter.SecondFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/30
 * @time: 10:50 PM
 * Description:
 */
@SpringBootApplication
@ServletComponentScan
public class SecondApp {

    public static void main(String[] args) {
        SpringApplication.run(SecondApp.class, args);
    }

    /**
     * 注册filter
     */
    @Bean
    public ServletListenerRegistrationBean<SecondListener> getServletListenerRegistrationBean() {
        ServletListenerRegistrationBean<SecondListener> bean = new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
        return bean;
    }
}
