<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot</title>
    <script type="text/javascript" src="/resources/js/jquery.min.js"></script>
</head>
<body>
  <h1>Spring Boot - web application </h1>
  <hr>

  <h2 id="customername"></h2>
  <script>

          $.ajax({

              url: 'http://localhost:9000/rest/customer/${name}',
              type: 'GET',
              crossDomain: true,
              dataType: 'json',
              success: function(data) {
                  $('#customername').html("welcome: " +data.customerName);

              },
              error: function() { alert('Failed!'); }
          });
  </script>

</body>
</html>