<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>School Report Card Generator</title>
</head>
<body>

    <h2>School Report Card Generator</h2>

    <form action="Report_Card.jsp" method="post">
        <label for="studentName">Student Name:</label><br>
        <input type="text" id="studentName" name="studentName" required><br><br>

        <label for="rollNo">Roll Number:</label><br>
        <input type="text" id="rollNo" name="rollNo" required><br><br>

        <label for="sub1">Subject 1 Marks (out of 100):</label><br>
        <input type="number" id="sub1" name="sub1" min="0" max="100" step="any" required><br><br>

        <label for="sub2">Subject 2 Marks (out of 100):</label><br>
        <input type="number" id="sub2" name="sub2" min="0" max="100" step="any" required><br><br>

        <label for="sub3">Subject 3 Marks (out of 100):</label><br>
        <input type="number" id="sub3" name="sub3" min="0" max="100" step="any" required><br><br>

        <input type="submit" value="Generate Report Card">
    </form>

</body>
</html>