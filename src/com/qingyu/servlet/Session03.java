package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 默认时间30分钟
 * <p>
 * <session-config>
 * <session-timeout>30</session-timeout>
 * </session-config>
 */
@WebServlet("/sess03")
public class Session03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //设置域对象
        session.setAttribute("uname", "admin");
        System.out.println("session 最大不活动时间" + session.getMaxInactiveInterval());
        //session.setMaxInactiveInterval(15);//15秒失效
        //session.invalidate();//让session立即失效
        //session依赖cookies,session依赖cookies默认在浏览器内存，关闭浏览器失效
    }
}
