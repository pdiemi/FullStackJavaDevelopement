<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate Sample Users</title>
</head>
<body>

	<%@page import="com.dao.UserDao,com.user.*,java.util.*"%>
	
	<h1>Generate Sample Users</h1>
	<br/>
	<%
	UserDao.generateSampleUsers();
	out.println("Sample users are generated.");
	%>
	<br/>
	<br/>
	<a href="Index.jsp">Back to Menu</a>

</body>
</html>