package com.voofchat.springboot.orm.mybatis.mapper;

import com.voofchat.springboot.orm.mybatis.po.User;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 12:06 AM
 * Description:
 */
public interface UserMapper {

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

}
