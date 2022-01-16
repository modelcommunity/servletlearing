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
 *   1:getWriter 字符输出流
 */
@WebServlet("/ser11")
public class   Servlet11 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置服务端的编码
        response.setCharacterEncoding("UTF-8");
        //设置客户端的编码
        response.setHeader("content-type","text/html;charset=UTF-8");
        PrintWriter writer =response.getWriter();
        writer.write("<h1>你好</h1>");
        //http://localhost:8080/s01/ser11

     }
}
