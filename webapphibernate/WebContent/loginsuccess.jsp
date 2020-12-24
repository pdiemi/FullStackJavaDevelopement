<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%
		out.println("Welcome " + session.getAttribute("sessionname"));
	%>

	<br />
	<a href="LogoutServlet">logout</a>
</body>
</html>