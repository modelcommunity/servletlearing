package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 相应数据
 *
 */
@WebServlet("/ser13")
public class Servlet13 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("UTF-8");
        PrintWriter writer =response.getWriter();
        writer.write("<h1>你好</h1>");
        //http://localhost:8080/s01/ser11

     }
}
