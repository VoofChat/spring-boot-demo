package com.voofchat.springboot.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/30
 * @time: 11:08 PM
 * Description:
 *
 */
public class SecondFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化SecondFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入SecondFilter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开SecondFilter");
    }

    @Override
    public void destroy() {
        System.out.println("销毁SecondFilter");
    }
}
