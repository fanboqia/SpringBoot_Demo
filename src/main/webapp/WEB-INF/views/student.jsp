<%@ page import="com.fbq.springboot.pojo.Student" %>
<%@ page import="java.util.List" %>
<%@page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    List<Student> student = (List<Student>)request.getAttribute("student");
    for(Student student1: student){
        System.out.println(student1);
    }
%>
<html>
<head>
</head>
<body>
    <table align="center" border="1" cellspacing="0">
        <tr><td>id</td><td>name</td></tr>
        <c:forEach items="${student}" var="s" varStatus="st">
            <tr>
                <td>${s.studentNo}</td>
                <td>${s.studentName}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>