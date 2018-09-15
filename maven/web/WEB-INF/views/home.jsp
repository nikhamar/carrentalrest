<%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 8/29/2018
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib pref
          ix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
    body, h1 {
        font-family: "Raleway", sans-serif
    }

    body, html {
        height: 100%
    }

    .bgimg {
        background-image: url('ceiling-clean-clinic-247786.jpg');
        min-height: 100%;
        background-position: center;
        background-size: cover;
    }
</style>
<body>
<div>
    <li class="active"><a href="/">Home</a></li>
</div>
<div class="bgimg w3-display-container w3-animate-opacity w3-text-black">
    <div class="w3-display-topleft w3-padding-large w3-xlarge">

        <button href="/home" onclick="document.getElementById('id03').style.display='block'"
                class="w3-button w3-green w3-large">Home
        </button>
        <button href="/login" onclick="document.getElementById('id01').style.display='block'"
                class="w3-button w3-green w3-large">Login
        </button>
        <button href="/registartion" onclick="document.getElementById('id02').style.display='block'"
                class="w3-button w3-green w3-large">Register
        </button>
        <div id="id01" class="w3-modal">
            <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:400px">

                <div class="w3-center"><br>
                    <span onclick="document.getElementById('id01').style.display='none'"
                          class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                    <img src="hos.jpg" alt="Avatar" style="width:30%" class="w3-circle w3-margin-top">

                    <form:form class="w3-container" action="/validatelogin" method="post" modelAttribute="login">
                        <div class="w3-section">
                            <label><b>Username</b></label>
                            <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Username"
                                   name="usrname" required>
                            <label><b>Password</b></label>
                            <input class="w3-input w3-border" type="text" placeholder="Enter Password" name="psw"
                                   required>
                            <button class="w3-button w3-block w3-green w3-section w3-padding" type="submit">Login
                            </button>
                            <input class="w3-check w3-margin-top" type="checkbox" checked="checked"> Remember me
                        </div>

                    </form:form>
                    <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
                        <button onclick="document.getElementById('id01').style.display='none'" type="button"
                                class="w3-button w3-red">Cancel
                        </button>
                        <span class="w3-right w3-padding w3-hide-small">Forgot <a href="#">password?</a></span>
                    </div>

                </div>
            </div>
        </div>

        <div id="id02" class="w3-modal">
            <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:500px">
                <div class="w3-center"><br>
                    <span onclick="document.getElementById('id02').style.display='none'"
                          class="w3-button w3-large w3-transparent w3-display-topright" title="Close Modal">×</span>
                    <img src="hos.jpg" alt="Avatar" style="width:30%" class="w3-circle w3-margin-top">
                    <form class="w3-container" action="/registration">
                        <label><b>First Name</b></label>
                        <input class="w2-input w2-border w3-margin" type="text" placeholder="Enter Firstname"
                               name="firstname" required>

                        <label><b>Last Name</b></label>
                        <input class="w2-input w2-border w3-margin" type="text" placeholder="Enter Lastname"
                               name="lastname" required>

                        <fieldset>
                            <label><b>Gender</b></label>
                            <input class="w2-input w2-border " type="radio" value="Male"
                                   name="gender" required>Male
                            <input class="w2-input w2-border w3-margin" type="radio" value="female"
                                   name="gender" required>Female
                        </fieldset>
                        <label><b>Email Address</b></label>
                        <input class="w2-input w2-border w3-margin" type="text" placeholder="Enter your email address"
                               name="email" required>

                        <label><b>Username</b></label>
                        <input class="w2-input w2-border w3-margin" type="text" placeholder="Choose user name"
                               name="usrname" required>
                        <label><b>Password</b></label>
                        <input class="w2-input w2-border" type="text" placeholder="Choose a password" name="psw"
                               required>

                        <div>
                            <button type="submit" class="btn btn-primary">Sign Up</button>
                        </div>

                    </form>
                    <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
                        <button onclick="document.getElementById('id01').style.display='none'" type="button"
                                class="w3-button w3-red">Cancel
                        </button>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
