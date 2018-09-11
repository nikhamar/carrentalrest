<%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 8/29/2018
  Time: 12:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delete appointment</title>
</head>
<body>
<div class="w3-center"><br>
    <span onclick="document.getElementById('cancel appointments').style.display='none'" class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
    <img src="hos.jpg" alt="Avatar" style="width:30%" class="w3-circle w3-margin-top">

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
        <%--<c:forEach var="doctor" items="${doctors}">--%>
        <form class="form-horizontal" action="/deleteAppointment">

            <tr>
                <%--<td><c:out value="${user.docName}" /></td>--%>
                <%--<td><c:out value="${user.specialization}" /></td>--%>
                <%--<td><c:out value="${user.day}" /></td>--%>

                <td><input type="hidden" value="${doctors.docName}" name="docName">${doctors.docName}</td>
                <td><input type="hidden" value="${doctors.specialization}" name="specialization">${doctors.specialization}</td>
                <td><input type="hidden" value="${doctors.day}" name="day">${doctors.day}</td>
                <td><input type="hidden" value="${doctors.time}" name="time">${doctors.time}</td>


                <td><button type="submit" class="btn btn-default">Delete Appointment</button></td>
            </tr>
        </form>

        <%--</c:forEach>--%>
        </tbody>
    </table>
</div>

</body>
</html>
