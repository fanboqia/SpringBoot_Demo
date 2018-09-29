<%@ page import="com.fbq.springboot.pojo.User" %>
<%@ page import="java.util.List" %>
<%@page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    User student = (User) request.getAttribute("student");
    System.out.println(student);

%>
<html>
<head>
</head>
<body>
    <table align="center" border="1" cellspacing="0">
            <tr>
                <td>${student.email}</td>
                <td>${student.passWord}</td>
                <td>${student.regTime}</td>
            </tr>
    </table>
</body>
</html>