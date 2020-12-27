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

	<h1>User List</h1>

	<%
		List<User> userList = UserDao.getAllUsers();
	request.setAttribute("list", userList);
	%>
	<br />
	<a href="DeleteAllUsers.jsp">Delete All Users</a>
	<a style="color:red;"> (WARNING: This action will delete all users from the database)</a>
	<br /><br />
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
				<td><a href="EditUserForm.jsp?id=${u.getUserId()}">Edit</a></td>
				<td><a href="DeleteUser.jsp?id=${u.getUserId()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="AddUserForm.jsp">Add New User</a>
	<br />
	<a href="Index.jsp">Back to Menu</a>

</body>
</html>