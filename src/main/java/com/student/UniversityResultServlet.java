package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UniversityResultServlet")
public class UniversityResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Business logic component separated from web tier
    private final ResultProcessorBean resultService = new ResultProcessorBean();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String studentName = request.getParameter("studentName");
        String rollNo = request.getParameter("rollNo");

        try {
            double sub1 = Double.parseDouble(request.getParameter("sub1"));
            double sub2 = Double.parseDouble(request.getParameter("sub2"));
            double sub3 = Double.parseDouble(request.getParameter("sub3"));

            if (sub1 < 0 || sub1 > 100 || sub2 < 0 || sub2 > 100 || sub3 < 0 || sub3 > 100) {
                out.println("<h3 style='color:red;'>Error: Marks must be between 0 and 100.</h3>");
                out.println("<a href='University_Result.html'>Go Back</a>");
                return;
            }

            // Invoke business logic service
            String resultSummary = resultService.processStudentResult(studentName, rollNo, sub1, sub2, sub3);

            out.println("<!DOCTYPE html><html><head><title>University Result</title></head><body>");
            out.println("<h2>University Result Processing Service</h2>");
            out.println("<hr>");
            out.println("<p><strong>Processed Result:</strong> " + resultSummary + "</p>");
            out.println("<br><a href='University_Result.html'>Process Another Student</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<h3 style='color:red;'>Error: Please enter valid numeric marks.</h3>");
            out.println("<a href='University_Result.html'>Go Back</a>");
        }
    }
}