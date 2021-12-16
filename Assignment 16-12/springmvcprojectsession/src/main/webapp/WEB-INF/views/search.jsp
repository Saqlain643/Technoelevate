<%@page
	import="com.technoelevate.springmvcprojectsession.dto.EmployeeDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="navbar.jsp" %>
<%
EmployeeDto dto = (EmployeeDto) request.getAttribute("empKey");
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
</head>
<body>
	<fieldset>
		<legend>Search Here</legend>
		<form action="./search" method="post">
			<table>
				<tr>
					<td>Employee ID</td>
					<td><input type="text" name="eid" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
	if (dto != null) {
	%>
	<h1>Details</h1>
	<h2>User ID: <%=dto.getEid()%></h2>
	<h2>Name: <%=dto.getEname()%></h2>
	<h2>Password: <%=dto.getPassword()%></h2>
	<h2>Position: <%=dto.getPosition()%></h2>
	<%
	}
	%>
	<%
	if (msg != null) {
	%>
	<h2><%=msg%></h2>
	<%
	}
	%>
</body>
</html>