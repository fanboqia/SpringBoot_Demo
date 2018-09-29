<%@ page import="com.fbq.springboot.pojo.User" %>
<%@ page import="java.util.List" %>
<%@page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    List<User> student = (List<User>)request.getAttribute("student");
    for(User student1: student){
        System.out.println(student1);
    }
%>
<html>
<head>
</head>
<body>
    <table align="center" border="1" cellspacing="0">
        <c:forEach items="${student}" var="s" varStatus="st">
            <tr>
                <td>${s.email}</td>
                <td>${s.passWord}</td>
                <td>${s.regTime}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>