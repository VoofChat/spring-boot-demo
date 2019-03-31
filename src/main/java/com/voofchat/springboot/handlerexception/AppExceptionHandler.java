package com.voofchat.springboot.handlerexception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/31
 * @time: 11:26 AM
 * Description:
 */
@Configuration
public class AppExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//        System.out.println("捕获异常");

        System.out.println(e);
        //设置状态码
        httpServletResponse.setStatus(HttpStatus.OK.value());
        //设置ContentType
        httpServletResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
        //避免乱码
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setHeader("Cache-Control", "no-cache, must-revalidate");
        try {
            httpServletResponse.getWriter().write("{\"success\":false,\"msg\":\"" + e.getMessage() + "\"}");
        } catch (IOException ex) {
//            log.error("与客户端通讯异常:"+ e.getMessage(), e);
        }

        return new ModelAndView();
    }

}
