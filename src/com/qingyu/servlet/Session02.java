package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/sess02")
public class Session02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //设置域对象
        session.setAttribute("uname", "admin");
        session.setAttribute("upwd", "1234");
        //移除域对象
        session.removeAttribute("upwd");
        //获取域对象
        //session.getAttribute("");
        request.setAttribute("name", "zhangsan");
        //转发 一次请求  session  request 域对象均有效
        //request.getRequestDispatcher("session02.jsp").forward(request, response);
        //uname: adminupwd: nullname: zhangsan
        //重定向 两次请求  session 对象均有效  request 域对象均无效
        response.sendRedirect("session02.jsp");
        // uname: adminupwd: nullname: null
    }
}
