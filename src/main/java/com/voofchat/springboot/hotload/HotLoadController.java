package com.voofchat.springboot.hotload;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 11:59 AM
 * Description:
 */
@RestController
public class HotLoadController {

    @RequestMapping("/index")
    public Map<String,Object> index() {
        Map<String,Object> map = new HashMap<>();
        map.put("test" ,"ok");
        map.put("msg" ,"aaa");
        return map;
    }
}
