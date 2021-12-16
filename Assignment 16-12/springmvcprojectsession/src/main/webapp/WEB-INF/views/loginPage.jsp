<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String name = (String) request.getAttribute("errMsg");
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
body {
	margin: 0;
	padding: 0;
	background: aqua;
	background-image : url(../images.jpg);
	background-repeat: no-repeat;
	background-size: cover;
	font-family: 'Times New Roman';
}

b {
	font-size: 40px;
	color: red;
}

i {
	font-size: 20px;
	color: red;
}

.row {
	padding: 5px;
}

.loginbox {
	width: 400px;
	height: 500px;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	padding: 60px 30px;
	font-size: 16px;
	color: #000;
	box-sizing: border-box;
	box-shadow: 8px 8px 50px #000;
}

input[type="text"], input[type="password"] {
	width: 100%;
	border: none;
	margin-bottom: 10px;
	height: 40px;
	background: transparent;
	border-bottom: 2px solid #008CBA;
	font-size: 16px;
}

input[type="submit"] {
	transition-duration: 0.4s;
	color: black;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
}

input[type="submit"]:hover {
	background-color: #f44336;
	color: aqua;
}
</style>

</head>
<body>
	<%
	if (name != null && !name.isEmpty()) {
	%>
	<h3 style="color: red"><%=name%></h3>
	<%
	}
	%>
	<%
	if (msg != null && !msg.isEmpty()) {
	%>
	<h3><%=msg%></h3>
	<%
	}
	%>
	<div class="loginbox">
		<center>
			<b>Login Here</b>
		</center>
		<br /> <br /> <br /> <br />
		<form action="./login" method="post">
			<i>User ID:</i><br /> <input type="text" name="eid" /> <br />
			<i>Password:</i><br /> <input type="password" name="password" /> <br /> <br />
			<br />
			<center>
				<input type="submit" value="Log In">
			</center>
		</form>
	</div>
</body>
</html>