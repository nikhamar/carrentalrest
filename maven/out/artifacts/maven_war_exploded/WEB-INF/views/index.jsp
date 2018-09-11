<%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 8/22/2018
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <h1> Hello Maven </h1>

  <c:forEach items="${list}" var="employee">
    <p>  Id: ${employee.id} </p>
   <p> name: ${employee.name} </p>
  </c:forEach>

  </body>
</html>
