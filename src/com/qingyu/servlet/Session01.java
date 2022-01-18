package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/sess01")
public class Session01  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session =request.getSession();
        /**
         * 输出ID
         */
        System.out.println(session.getId());
        /**
         * 判断是否是新的
         */
        System.out.println(session.isNew());
        /**
         * 获取创建时间
         */
        System.out.println(session.getCreationTime());
        /**
         * 获取最后一次访问时间
         */
        System.out.println(session.getLastAccessedTime());
    }
}
