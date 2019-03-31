package com.voofchat.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2019/3/30
 * @time: 10:55 PM
 * Description:
 */
@WebServlet(name = "FirstServlet", urlPatterns = "/indexServlet")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.append("<h1>Hello , SecondServlet!</h1>");
        pw.close();
        System.out.println("indexServlet");
    }
}
