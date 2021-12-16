<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="navbar.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
	<fieldset>
		<legend>Update Here</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td>Employee Id:</td>
					<td><input type="text" name="eid" /></td>
				<tr>
				<tr>
					<td>Employee Name:</td>
					<td><input type="text" name="ename" /></td>
				<tr>
				<tr>
					<td>Employee Position:</td>
					<td><input type="text" name="position" /></td>
				<tr>
				<tr>
					<td>Employee Password:</td>
					<td><input type="password" name="password" /></td>
				<tr>
			</table>
			<input type="submit" value="Update" />
		</form>
	</fieldset>
	<%
	if (msg != null) {
	%>
	<h3><%=msg%></h3>
	<%
	}
	%>
</body>
</html>