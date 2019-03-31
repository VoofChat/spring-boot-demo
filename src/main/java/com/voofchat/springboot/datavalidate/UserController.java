package com.voofchat.springboot.datavalidate;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 10:37 AM
 * Description:
 */
@Controller
public class UserController {

    /**
     * @Valid 开启对user 的数据校验
     * BindingResult 封装了校验的结果
     */
    @RequestMapping("/save")
    public Map<String,Object> saveUser(@Valid User user, BindingResult result) {

        result = null;
        System.out.println(user);

        Map<String,Object> map = new HashMap<>();
        if (result.hasErrors()) {
            StringBuffer sb = new StringBuffer();
            for (ObjectError objectError : result.getAllErrors()) {
                sb.append(objectError.getDefaultMessage()).append("\n");
            }
            map.put("msg",sb.toString());
        }else {
            map.put("msg","ok");
        }
        return map;
    }
}
