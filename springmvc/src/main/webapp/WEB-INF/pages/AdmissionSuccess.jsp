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
    <title>Admission Successful</title>
</head>

<body>
    <h1>${headerMessage}</h1>
    <h2>Congrats!</h2>
    <table>
        <tr>
            <td> Student Name :</td>
            <td> ${student.name} </td>
        </tr>
        <tr>
            <td> Student Hobby :</td>
            <td> ${student.hobby} </td>
        </tr>
        <tr>
            <td> Student Moblie :</td>
            <td> ${student.mobile} </td>
        </tr>
        <tr>
            <td> Student DOB :</td>
            <td> ${student.dob} </td>
        </tr>
        <tr>
            <td> Student Skills :</td>
            <td> ${student.skills} </td>
        </tr>
        <tr>
            <td>Student's Address :</td>
            <td>Country : ${student.address.country}
                City : ${student.address.city}
                Street : ${student.address.street}
                Pincode : ${student.address.pinCode}
            </td>
        </tr>

    </table>
</body>
</html>
