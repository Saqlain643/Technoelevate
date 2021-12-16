<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Navbar</title>
</head>
<style>
{
margin
:
 
0
;

 
padding
:
 
0
;

 
box-sizing
:
 
border-box
;


}
.navbar {
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 20px;
	background-color: teal;
	color: #fff;
}

.nav-links a {
	color: #fff;
}

.logo {
	font-size: 32px;
}

.menu {
	display: flex;
	gap: 1em;
	font-size: 18px;
}

.menu li:hover {
	background-color: #4c9e9e;
	border-radius: 5px;
	transition: 0.3s ease;
}

.menu li {
	padding: 5px 14px;
}

body {
	font-family: cursive;
}

a {
	text-decoration: none;
}

li {
	list-style: none;
}
</style>
<body>

	<nav class="navbar">
		<div class="logo">Manage</div>
		<ul class="nav-links">
			<div class="menu">
				<li><a href="./search">Search</a></li>
				<li><a href="./insert">Insert</a></li>
				<li><a href="./update">Update</a></li>

				<li><a href="./delete">Delete</a></li>
				<li><a href="./logout">Log Out</a></li>
			</div>
		</ul>
	</nav>
</body>
</html>