package com.voofchat.springboot.Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 2:43 PM
 * Description:
 */
@Component
public class ScheduledDemo {

    /**
     * cron 表达式 分为6个或7个域 从左往右 秒 分 时 天 月 星期中的日期 年份
     */
    @Scheduled(cron = "*/1 * * * * *")
    public void scheduledTest() {
        System.out.println("定时执行" + new Date().toLocaleString());
    }
}
