package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  1:创建普通java类
 *  2:实现servlet规范，继承HttpServlet类
 *  3:重写service方法，用来处理请求
 *  4:设置注解，指定访问路径
 */
@WebServlet("/ser01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello servlet");
        resp.getWriter().write("hello servlet");
    }
}
