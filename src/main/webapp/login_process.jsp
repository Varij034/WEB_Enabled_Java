<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String studentName = request.getParameter("studentName");
    String studentId = request.getParameter("studentId");
    String password = request.getParameter("password");

    // Simple credential validation
    if (studentName != null && !studentName.trim().isEmpty() && "student123".equals(password)) {
        // Store attributes in the HTTP session
        session.setAttribute("studentName", studentName);
        session.setAttribute("studentId", studentId);
        
        // Redirect to the personalized dashboard
        response.sendRedirect("student_dashboard.jsp");
    } else {
%>
        <!DOCTYPE html>
        <html>
        <head><title>Login Failed</title></head>
        <body>
            <h3 style="color:red;">Invalid Credentials! Use password: <strong>student123</strong></h3>
            <a href="student_login.html">Try Again</a>
        </body>
        </html>
<%
    }
%>