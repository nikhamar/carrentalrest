<%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 8/29/2018
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Doctors</title>
</head>
<body>
<div class="w3-center"><br>
    <span onclick="document.getElementById('doctors').style.display='none'" class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
    <img src="hos.jpg" alt="Avatar" style="width:30%" class="w3-circle w3-margin-top">


<sql:setDataSource var="database"
                   driver = "org.postgresql.Driver"
                   url="jdbc:postgresql://localhost:5432/postgres"
                   user="postgres" password="41437"/>

<sql:query var="doctorlist" dataSource="${database}">
    SELECT * FROM doctorsdata;
</sql:query>


<div align="center">
<table class="table">
<thead class="thead-dark">
<tr>
    <th scope="col">Doctor Name</th>
    <th scope="col">Specialization</th>
    <th scope="col">Available Day</th>
    <th scope="col">Available Time</th>
</tr>
</thead>
<tbody>
<c:forEach var="user" items="${doctorlist.rows}">
    <form class="form-horizontal" action="/bookappointment" method="post">

    <tr>
        <td><input type="hidden" value="${user.docName}" name="docName">${user.docName}</td>
        <td><input type="hidden" value="${user.specialization}" name="specialization">${user.specialization}</td>
        <td><input type="hidden" value="${user.day}" name="day">${user.day}</td>
        <td><input type="hidden" value="${user.time}" name="time">${user.time}</td>


        <td><button type="submit" class="btn btn-default">Book Appointment</button></td>
    </tr>
    </form>

</c:forEach>
</tbody>
</table>

</div>
</body>
</html>
