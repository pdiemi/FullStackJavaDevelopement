<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete All Users</title>
</head>
<body>

	<%@page import="com.dao.UserDao,com.user.*,java.util.*"%>

	<h1>Delete All Users</h1>
	<br/>
	<%
	int status = UserDao.deleteAllUsers();
	if (status>0) {
		out.println("All users are deleted.");
	} else {
		out.println("Failed to delete all users.");
	}
	%>
	
	<br/>
	<br/>
	<a href="Index.jsp">Back to Menu</a>

</body>
</html>