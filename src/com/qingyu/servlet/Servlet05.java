package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ser05")
public class Servlet05 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("服务调用了...");
    }

    @Override
    public void destroy() {

        System.out.println("服务销毁了...");
    }

    @Override
    public void init() throws ServletException {

        System.out.println("服务被创建了...");
    }
}
