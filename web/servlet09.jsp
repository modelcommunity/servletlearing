<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 刘俊杰
  Date: 2022-01-16
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<h2>转发页面</h2>
<%
    String uname = (String) request.getAttribute("uname");
    System.out.println("uname: " + uname);
    int age= (int) request.getAttribute("age");
    System.out.println("age:"+age);
    List<String> list = (List<String>) request.getAttribute("list");
    System.out.println(list.get(0));
%>
</body>
</html>
