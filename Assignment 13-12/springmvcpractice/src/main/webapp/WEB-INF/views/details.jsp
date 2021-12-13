<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String fname = (String)request.getAttribute("fname");
    String lname = (String)request.getAttribute("lname");
    String age = (String)request.getAttribute("age");
    String email = (String)request.getAttribute("email");
    String number =(String)request.getAttribute("number");
    String gender = (String)request.getAttribute("gender");
    String address = (String)request.getAttribute("address");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<h1>Details</h1>
<h4>First Name: <%=fname%></h4>
<h4>Last Name: <%=lname%></h4>
<h4>Age: <%=age%></h4>
<h4>Email: <%=email%></h4>
<h4>Number: <%=number%></h4>
<h4>Address: <%=address%></h4>
<h4>Gender: <%=gender%></h4>

</body>
</html>