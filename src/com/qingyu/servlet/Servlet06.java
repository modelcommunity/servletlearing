package com.qingyu.servlet;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ser06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求的编码格式，默认为ISO-8859-1 不支持中文
        req.setCharacterEncoding("UTF-8");
        //获取完整路径
        System.out.println(req.getRequestURL().toString());
        System.out.println(req.getRequestURI());
        System.out.println(req.getQueryString());
        System.out.println(req.getMethod());
        System.out.println(req.getProtocol());
        System.out.println(req.getContextPath());

        /**
         * 获取请求的参数
         */
        //获取制定名称的参数值
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");
        System.out.println("uname： " + uname);
        System.out.println("upwd： " + upwd);
        //http://localhost:8080/s01/ser06?uname=admin&upwd=123&hobby=sing&hobby=dance
        //获取制定名称的参数的所有参数值（用于复选框）
        String[] hobbys = req.getParameterValues("hobby");
        if (hobbys != null && hobbys.length > 0) {
            for (String hobby : hobbys) {
                System.out.println("爱好："+hobby);
            }
        }
    }
}
