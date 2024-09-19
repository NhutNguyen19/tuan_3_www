<%--
  Created by IntelliJ IDEA.
  User: tannh
  Date: 9/19/2024
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<form action="../controller" method="get">
    <input type="hidden" name="action" value="add">
    Name: <input type="text" name="name"><br>
    Email: <input type="email" name="gmail"><br>
    <input type="submit" value="Insert">
    <input type="reset" value="Clear">
</form>
<a href="../index.jsp">Back</a>
</body>
</html>
