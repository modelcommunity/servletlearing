package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * request 域对象
 */
@WebServlet("/ser10")
public class Serlvet10 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = (String) req.getAttribute("uname");
        System.out.println("uname: " + uname);
        int age= (int) req.getAttribute("age");
        System.out.println("age:"+age);
        List<String> list = (List<String>) req.getAttribute("list");
        System.out.println(list.get(0));
    }
}
