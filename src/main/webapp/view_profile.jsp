<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reusable Student Profile View</title>
</head>
<body>

    <!-- Retrieve the existing StudentBean object from session scope -->
    <jsp:useBean id="student" class="com.student.StudentBean" scope="session" />

    <h2>Academic ID Card (Retrieved from JavaBean)</h2>
    <hr>

    <table border="1" cellpadding="8" cellspacing="0">
        <tr>
            <th>Student ID</th>
            <td><jsp:getProperty name="student" property="studentId" /></td>
        </tr>
        <tr>
            <th>Full Name</th>
            <td><jsp:getProperty name="student" property="name" /></td>
        </tr>
        <tr>
            <th>Department</th>
            <td><jsp:getProperty name="student" property="department" /></td>
        </tr>
        <tr>
            <th>Current Semester</th>
            <td><jsp:getProperty name="student" property="semester" /></td>
        </tr>
    </table>

    <br>
    <a href="store_profile.jsp">Back to Summary</a> | 
    <a href="digital_profile.html">Edit Profile</a>

</body>
</html>