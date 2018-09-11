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
    <title>view appointment</title>
</head>
<body>

<div class="w3-center"><br>
    <span onclick="document.getElementById('view appointments').style.display='none'" class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
    <img src="hos.jpg" alt="Avatar" style="width:30%" class="w3-circle w3-margin-top">
<form class="form-horizontal" action="/viewAppointments" method="post">

    <div class="form-group">
        <label class="control-label col-sm-2" for="userName">Enter your Username:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="userName" name="userName" placeholder="Enter Username">
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Search Appointments</button>
        </div>
    </div>

</form>

</body>
</html>
