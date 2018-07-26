<%--
  Created by IntelliJ IDEA.
  User: sheik
  Date: 7/25/2018
  Time: 7:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admission Form</title>
</head>

<body>
    <h1>Student Admission Form</h1>

    <form action="/springmvc/submitAdmissionForm.html" method="post">
        <p>
            Student Name : <input type="text" name="studentName"/>
        </p>
        <p>
            Student Hobby : <input type="text" name="studentHobby"/>
        </p>
        <input type="submit" value="Submit Form" />

    </form>

</body>
</html>
