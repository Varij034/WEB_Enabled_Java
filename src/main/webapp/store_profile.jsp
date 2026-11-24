<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Profile Saved</title>
</head>
<body>

    <!-- Instantiate or retrieve StudentBean in session scope -->
    <jsp:useBean id="student" class="com.student.StudentBean" scope="session" />
    
    <!-- Automatically map all matching form parameters to bean setters -->
    <jsp:setProperty name="student" property="*" />

    <h2 style="color:green;">Student Profile Stored Successfully!</h2>
    <hr>

    <p><strong>Student ID:</strong> <jsp:getProperty name="student" property="studentId" /></p>
    <p><strong>Name:</strong> <jsp:getProperty name="student" property="name" /></p>
    <p><strong>Department:</strong> <jsp:getProperty name="student" property="department" /></p>
    <p><strong>Semester:</strong> <jsp:getProperty name="student" property="semester" /></p>

    <br>
    <a href="view_profile.jsp">View Same Bean on Another JSP Page</a> | 
    <a href="digital_profile.html">Update Profile</a>

</body>
</html>