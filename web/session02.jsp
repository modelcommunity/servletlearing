<%--
  Created by IntelliJ IDEA.
  User: 刘俊杰
  Date: 2022-01-16
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <%
   String uname = (String) request.getSession().getAttribute("uname");
   String upwd = (String) request.getSession().getAttribute("upwd");
   String name = (String) request.getAttribute("name");
   out.print("uname: "+uname);
   out.print("upwd: "+upwd);
   out.print("name: "+name);
 %>
  </body>
</html>
