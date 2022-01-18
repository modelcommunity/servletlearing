package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cook01")
public class Cookies01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("uname", "admin");
        Cookie cookie1 = new Cookie("uname1", "zhangsan");
        Cookie cookie2 = new Cookie("uname2", "admin");
        cookie.setMaxAge(-1);
        cookie1.setMaxAge(0);
        cookie2.setMaxAge(30);
        //设置负数的秒值，则浏览器默认将cookie保存在内存里，当浏览器关闭时消失
        //0,这种设置用于删除同名的cookie
        //>0--表示将cookie在硬盘上存放seconds秒
        response.addCookie(cookie);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }
}
