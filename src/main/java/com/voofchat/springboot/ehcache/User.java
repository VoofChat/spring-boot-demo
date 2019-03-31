package com.voofchat.springboot.ehcache;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 10:37 AM
 * Description:
 */
@Data
public class User implements Serializable {

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;



}
