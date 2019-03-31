package com.voofchat.springboot.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 2:11 PM
 * Description:
 */
@Configuration
public class RedisConfig {

    /**
     * 1、创建JedisPoolConfig 对象
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "custom.spring.redis.pool")
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig config = new JedisPoolConfig();
//        config.setMaxIdle(10);
//        config.setMinIdle(5);
//        config.setMaxTotal(20);
        System.out.println("默认配置" + config.getMaxIdle());
        System.out.println("默认配置" + config.getMinIdle());
        System.out.println("默认配置" + config.getMaxTotal());
        return config;
    }

    /**
     * 2、创建JedisConnectionFactory:配置redis链接信息
     */
    @Bean
    @ConfigurationProperties(prefix = "custom.spring.redis")
    public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig config) {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setPoolConfig(config);
//        factory.setHostName("127.0.0.1");
//        factory.setPort(6379);

        System.out.println("自定义配置" + config.getMaxIdle());
        System.out.println("自定义配置" + config.getMinIdle());
        System.out.println("自定义配置" + config.getMaxTotal());

        return factory;
    }

    /**
     * 3.创建RedisTemplate:用于执行Redis操作方法
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
        redisTemplate.setConnectionFactory(factory);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
