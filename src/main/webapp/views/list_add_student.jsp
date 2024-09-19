<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: tannh
  Date: 9/19/2024
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List All Student</title>
</head>
<body>
<%
    List<Student> students = (List<Student>) session.getAttribute("students");
    for (Student student : students) {
        out.println(student);
    }
%>
<a href="../index.jsp">Back</a>
</body>
</html>
