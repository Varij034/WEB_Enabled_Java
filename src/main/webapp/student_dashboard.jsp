<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // Check if the user has an active session
    String studentName = (String) session.getAttribute("studentName");
    String studentId = (String) session.getAttribute("studentId");

    if (studentName == null) {
        response.sendRedirect("student_login.html");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Dashboard</title>
</head>
<body>

    <h2>Welcome, <%= studentName %>!</h2>
    <p><strong>Student ID:</strong> <%= studentId %></p>
    <p><strong>Session ID:</strong> <%= session.getId() %></p>
    <hr>

    <h3>Portal Navigation</h3>
    <ul>
        <li><a href="student_profile.jsp">View Academic Profile (Test Session Persistence)</a></li>
        <li><a href="logout.jsp">Logout Securely</a></li>
    </ul>

</body>
</html>