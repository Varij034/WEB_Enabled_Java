package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EventRegistrationServlet")
public class EventRegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("studentName");
        String roll = request.getParameter("rollNo");
        String dept = request.getParameter("department");
        String email = request.getParameter("studentEmail");

        if (name == null || name.trim().isEmpty() || 
            roll == null || roll.trim().isEmpty() || 
            dept == null || dept.trim().isEmpty() || 
            email == null || email.trim().isEmpty()) {

            out.println("<h3 style='color:red;'>Validation Error: All fields are required!</h3>");
            
            RequestDispatcher rd = request.getRequestDispatcher("event_register.html");
            rd.include(request, response);
            return;
        }

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Registration Confirmation</title></head>");
        out.println("<body>");
        out.println("<h2 style='color:green;'>Registration Successful!</h2>");
        out.println("<p>Thank you for registering for the Technical Workshop.</p>");
        out.println("<hr>");
        out.println("<h3>Registration Details:</h3>");
        out.println("<p><strong>Student Name:</strong> " + name + "</p>");
        out.println("<p><strong>Roll Number:</strong> " + roll + "</p>");
        out.println("<p><strong>Department:</strong> " + dept + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<br><a href='event_register.html'>Register Another Student</a>");
        out.println("</body>");
        out.println("</html>");
    }
}