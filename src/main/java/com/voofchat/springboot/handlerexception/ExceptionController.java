package com.voofchat.springboot.handlerexception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 11:17 AM
 * Description:
 */
@Controller
public class ExceptionController {

    @RequestMapping("/index")
    public Map<String,Object> index() {
        String str = null;
        str.length();
        return new HashMap<>();
    }
}
