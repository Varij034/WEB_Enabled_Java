package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExamResultServlet")
public class ExamResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String rollNo = request.getParameter("rollNo");
        
        try {
            double sub1 = Double.parseDouble(request.getParameter("sub1"));
            double sub2 = Double.parseDouble(request.getParameter("sub2"));
            double sub3 = Double.parseDouble(request.getParameter("sub3"));

            if (sub1 < 0 || sub1 > 100 || sub2 < 0 || sub2 > 100 || sub3 < 0 || sub3 > 100) {
                out.println("<h3 style='color:red;'>Error: Marks must be between 0 and 100.</h3>");
                out.println("<a href='Exam_Result.html'>Go Back</a>");
                return;
            }

            double total = sub1 + sub2 + sub3;
            double percentage = (total / 300.0) * 100.0;

            out.println("<!DOCTYPE html><html><head><title>Exam Result</title></head><body>");
            out.println("<h2>Examination Result</h2>");
            out.println("<hr>");
            out.println("<p><strong>Roll Number:</strong> " + rollNo + "</p>");
            out.println("<p><strong>Subject 1 Marks:</strong> " + sub1 + "</p>");
            out.println("<p><strong>Subject 2 Marks:</strong> " + sub2 + "</p>");
            out.println("<p><strong>Subject 3 Marks:</strong> " + sub3 + "</p>");
            out.println("<p><strong>Total Marks:</strong> " + String.format("%.2f", total) + " / 300</p>");
            out.println("<p><strong>Percentage:</strong> " + String.format("%.2f", percentage) + "%</p>");
            out.println("<br><a href='Exam_Result.html'>Check Another Result</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<h3 style='color:red;'>Error: Invalid marks entered.</h3>");
            out.println("<a href='Exam_Result.html'>Go Back</a>");
        }
    }
}