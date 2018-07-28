<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <h1>${headerMessage}</h1>
    <h2>Student Admission Form</h2>
    <form:errors path="student.*" />
    <form action="/springmvc/submitAdmissionForm.html" method="post">
        <table>
            <tr>
                <td> Student Name : </td> <td> <input type="text" name="name"/> </td>
            </tr>
            <tr>
                <td> Student Hobby : </td> <td> <input type="text" name="hobby"/> </td>
            </tr>
            <tr>
                <td> Student Mobile : </td> <td> <input type="text" name="mobile"/> </td>
            </tr>
            <tr>
                <td> Student DOB : </td> <td> <input type="text" name="dob"/> </td>
            </tr>
            <tr>
                <td> Student Name : </td> <td> <select name="skills" multiple>
                                                <option value="JAVA Core">JAVA Core</option>
                                                <option value="Spring Core">Spring Core</option>
                                                <option value="Spring MVC">Spring MVC</option>
                                                <option value="Spring Boot">Spring Boot</option>
                                                </select>
                                          </td>
            </tr>
        </table>

        <table>
            <tr>
                <td>Student's Address</td>
            </tr>
            <tr>
                <td>Country : <input type="text" name="address.country" /> </td>
                <td>City : <input type="text" name="address.city" /> </td>
                <td>Street : <input type="text" name="address.street" /> </td>
                <td>Pincode : <input type="text" name="address.pinCode" /> </td>
            </tr>

            <tr>
                <td><input type="submit" value="Submit Form" /></td>
            </tr>
        </table>

    </form>

</body>
</html>
