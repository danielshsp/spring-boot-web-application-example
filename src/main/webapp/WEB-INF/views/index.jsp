<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>
<body>
  <h1>Spring Boot - MVC web application example</h1>
  <hr>

  <div class="form">
    <form:form  modelAttribute="Customer" action="hello" method="post" onsubmit="return validate()" >
      <table>
        <tr>
          <td>Enter Your name</td>
          <td><form:input path="customerId" /></td>
          <td><input type="submit" value="Submit"></td>
        </tr>
      </table>
    </form:form>
  </div>

</body>
</html>