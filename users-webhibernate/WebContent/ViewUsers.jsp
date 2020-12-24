<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Users</title>
</head>
<body>

	<%@page import="com.dao.UserDao,com.user.*,java.util.*"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<h1>Users List</h1>

	<%
		List<User> userList = UserDao.getAllUsers();
	request.setAttribute("list", userList);
	%>
	
	<table border="1" width="90%">
		<tr>
			<th>User ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>City</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getUserId()}</td>
				<td>${u.getUserFirstName()}</td>
				<td>${u.getUserLastName()}</td>
				<td>${u.getUserEmail()}</td>
				<td>${u.getUserCity()}</td>
				<td><a href="editform.jsp?id=${u.getUserId()}">Edit</a></td>
				<td><a href="deleteuser.jsp?id=${u.getUserId()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="adduserform.jsp">Add New User</a>
	<br/>
	<a href="Index.jsp">Back to Menu</a>

</body>
</html>