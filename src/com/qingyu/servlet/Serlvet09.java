package com.qingyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ser09")
public class Serlvet09 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("uname","admin");
        request.setAttribute("age",17);
        List<String> list =new ArrayList<>();
        list.add("cpu");
        list.add("ram");
        request.setAttribute("list",list);
        //req.getRequestDispatcher("ser10").forward(req,resp);
        request.getRequestDispatcher("servlet09.jsp").forward(request,response);
    }
}
