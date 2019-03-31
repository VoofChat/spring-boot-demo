package com.voofchat.springboot.orm.mybatis.po;

import lombok.Data;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 12:02 AM
 * Description:
 */
@Data
public class User {

    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;
    
    /**
     * idNo
     */
    private Integer idNo;
    
    /**
     * 年龄
     */
    private Integer age;
}
