package com.voofchat.springboot.uploadfile;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/30
 * @time: 11:38 PM
 * Description:
 */
// 表示该类下的方法的返回值都会做json格式化转换
@RestController
public class FileUploadController {

    /**
     * 文件上传
     */
    @RequestMapping("/fileUploadController")
    public Map<String, Object> fileUpload(MultipartFile filename) throws IOException {
        System.out.println(filename.getOriginalFilename());
        filename.transferTo(new File("/Users/bjhl/Desktop/test/" + filename.getOriginalFilename()));
        Map<String, Object> map = new HashMap<>();
        map.put("msg","ok");
        return map;
    }
}
