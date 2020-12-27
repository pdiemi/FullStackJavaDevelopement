<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome</h1>
	<%
		out.println("Welcome " + session.getAttribute("sessionname"));
	%>

	<br />
	<br />
	<a href="Index.jsp">Back to Menu</a>
	<br />
	<br />
	<a href="Logout.jsp">Logout</a>
</body>
</html>