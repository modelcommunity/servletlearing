package com.qingyu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 获取 ServletContext 的四种方式
 */
@WebServlet("/sc")
public class ServletContext01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过servlet 获取 建议
        ServletContext servletContext1 = request.getServletContext();
        //通过session 对象获取
        ServletContext servletContext2 = request.getSession().getServletContext();
        //通过servletConfig 获取
        ServletContext servletContext3 = getServletConfig().getServletContext();
        //直接获取
        ServletContext servletContext4 = getServletContext();
        //常用方法
        System.out.println("获取服务器的版本信息: " + servletContext1.getServerInfo());
        System.out.println("获取真实路径: " + servletContext1.getRealPath("/"));

        servletContext1.setAttribute("uname", "admin");
        String uname = (String) servletContext1.getAttribute("uname");
        System.out.println(uname);
        servletContext1.removeAttribute("uname");
    }
}
