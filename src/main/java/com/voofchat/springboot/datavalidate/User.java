package com.voofchat.springboot.datavalidate;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 10:37 AM
 * Description:
 */
@Data
public class User {

    /**
     * 用户名
     */
    @NotBlank(message = "name 不能为空")
    private String name;

    /**
     * 密码
     */
    @NotBlank(message = "password 不能为空")
    private String password;



}
