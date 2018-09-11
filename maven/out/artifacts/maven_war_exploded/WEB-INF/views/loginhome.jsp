<%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 8/29/2018
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<style>
    body,h1,h5 {font-family: "Raleway", sans-serif}
    body, html {height: 100%}
    .bgimg {
        background-image: url('american-3577500_1920.jpg');
        min-height: 100%;
        background-position: center;
        background-size: cover;
    }
</style>
<body>

<div class="bgimg w3-display-container w3-text-black">
    <div class="w3-display-middle w3-jumbo">
        <p>MEDI CARE</p>
    </div>
    <div class="w3-display-topleft w3-container w3-xlarge">
        <p><button href="/doctors" onclick="document.getElementById('doctors').style.display='block'" class="w3-button w3-black">DOCTORS</button></p>
        <p><button onclick="document.getElementById('book appointments').style.display='block'" class="w3-button w3-black">BOOK APPOINTMENTS</button></p>
        <p><button href="/myAppointments" onclick="document.getElementById('view appointments').style.display='block'" class="w3-button w3-black">VIEW APPOINTMENTS</button></p>
        <p><button href="/myAppointments" onclick="document.getElementById('cancel appointments').style.display='block'" class="w3-button w3-black">CANCEL APPOINTMENTS</button></p>

    </div>
    <div class="w3-display-bottomleft w3-container">
        <p class="w3-xlarge">monday - friday 10-23 | saturday 14-02</p>
        <p class="w3-large">42 village St, New York</p>

    </div>
</div>