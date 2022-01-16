package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求转发跳转
 * 可以让请求从服务但跳转到客户端
 * 服务端行为
 * 特点：
 *      服务端行为
 *      地址栏地址不变
 *      从始至终只有一个请求
 *      req数据可以共享
 */
@WebServlet("/ser07")
public class Servlet07 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        System.out.println("ser07 uname: " + uname);
        //请求转发跳转到ser8
       // req.getRequestDispatcher("ser08").forward(req,resp);
        //请求转发跳转到jsp
       // req.getRequestDispatcher("login.jsp").forward(req,resp);
        //请求转发跳转到html
        req.getRequestDispatcher("login.html").forward(req,resp);
    }
}
