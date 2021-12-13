<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h2>Register Here</h2>
	<form action="./register" method="post">
		<table style="100%">
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="fname" /></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lname" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="mail" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="male" />Mail <input
					type="radio" name="gender" value="female" />Female</td>
			</tr>
			<tr>
				<td>Number:</td>
				<td><input type="number" name="number" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address" /></td>
			</tr>
		</table>
		<input type="submit" name="Register" />
	</form>
</body>
</html>