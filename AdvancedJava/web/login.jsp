<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: nikhil--%>
  <%--Date: 8/12/2018--%>
  <%--Time: 4:05 PM--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<form action="/Login" >--%>
    <%--UserName:<input type="text" name="un">--%>
    <%--Password:<input type="password" name="pswd">--%>
    <%--<input type="submit" value="login">--%>

<%--</form>--%>
<%--</body>--%>
<%--</html>--%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Registration Page</title>
</head>
<body>
<div class="p-3 mb-2 bg-light text-info">
    <section class = "container">

        <div class="display-2">Login Page</div>

    </section>
    <section class="box">
        <div class="container">

            <form action="/Login" >
                <div class="form-group">

                    <label for = "UserName">UserName</label>
                    <input type="text" class="form-control" id="username" name="un" placeholder="enter username">
                </div>
                <div class="form-group">

                    <label for = "Password">Password</label>
                    <input type="password" class="form-control" id="password" name="pswd" placeholder="enter password">
                </div>

                <div>
                    <button type="submit" class="btn btn-primary">Login</button>
                </div>

            </form>
        </div>



    </section>




</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>