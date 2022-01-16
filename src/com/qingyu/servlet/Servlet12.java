package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;;

/**
 * 相应数据
 *   2:getOutputStream 字节输出流
 *   2种流不可以同时使用
 */
@WebServlet("/ser12")
public class Servlet12 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletOutputStream out=response.getOutputStream();
        out.write("Hi".getBytes());
        //http://localhost:8080/s01/ser12
     }
}
