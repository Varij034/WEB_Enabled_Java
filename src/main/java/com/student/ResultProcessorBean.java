package com.student;

public class ResultProcessorBean {

    public String processStudentResult(String studentName, String rollNo, double sub1, double sub2, double sub3) {
        double total = sub1 + sub2 + sub3;
        double percentage = (total / 300.0) * 100.0;
        String grade = calculateGrade(percentage);

        return String.format(
            "Student Name: %s | Roll No: %s | Total: %.2f / 300 | Percentage: %.2f%% | Grade: %s",
            studentName, rollNo, total, percentage, grade
        );
    }

    private String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "O (Outstanding)";
        } else if (percentage >= 80) {
            return "E (Excellent)";
        } else if (percentage >= 70) {
            return "A (Very Good)";
        } else if (percentage >= 60) {
            return "B (Good)";
        } else if (percentage >= 50) {
            return "C (Pass)";
        } else {
            return "F (Fail)";
        }
    }
}