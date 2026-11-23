<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
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
    <title>Student Profile</title>
</head>
<body>

    <h2>Academic Profile</h2>
    <hr>
    <p><strong>Logged-in Student:</strong> <%= studentName %></p>
    <p><strong>Roll / Student ID:</strong> <%= studentId %></p>
    <p><strong>Program:</strong> Master of Computer Applications (MCA)</p>
    <p><strong>Status:</strong> Active Session Verified</p>

    <br>
    <a href="student_dashboard.jsp">Back to Dashboard</a> | 
    <a href="logout.jsp">Logout Securely</a>

</body>
</html>