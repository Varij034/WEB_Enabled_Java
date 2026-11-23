<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // Destroy the current user session
    session.invalidate();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Logged Out</title>
</head>
<body>

    <h3 style="color:green;">You have been securely logged out.</h3>
    <a href="student_login.html">Return to Login Page</a>

</body>
</html>