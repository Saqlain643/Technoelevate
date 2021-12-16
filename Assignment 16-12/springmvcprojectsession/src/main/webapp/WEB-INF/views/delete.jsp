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
<title>Delete Page</title>
</head>
<body>
	<fieldset>
		<legend>Delete Here</legend>
		<form action="./delete" method="post">
			<table>
				<tr>
					<td>Employee Id:</td>
					<td><input type="text" name="eid" /></td>
				</tr>
			</table>
			<input type="submit" value="Delete" />
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