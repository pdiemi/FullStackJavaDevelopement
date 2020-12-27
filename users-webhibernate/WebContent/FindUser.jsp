<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.dao.UserDao,com.user.*,java.util.*"%>
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
User foundUser = UserDao.getUserById(u.getUserId());
if(foundUser==null){
	response.sendRedirect("UserNotFound.jsp");
} else {
	request.setAttribute("foundUser", foundUser);
}
%>
<h1>Find User</h1>
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
		
			<tr>
				<td>${foundUser.getUserId()}</td>
				<td>${foundUser.getUserFirstName()}</td>
				<td>${foundUser.getUserLastName()}</td>
				<td>${foundUser.getUserEmail()}</td>
				<td>${foundUser.getUserCity()}</td>
				<td><a href="EditUserForm.jsp?id=${u.getUserId()}">Edit</a></td>
				<td><a href="DeleteUser.jsp?id=${u.getUserId()}">Delete</a></td>
			</tr>
	</table>
	<br/>
	<br/>
	<a href="FindUserForm.jsp">Find User</a>
	<br />
	<a href="Index.jsp">Back to Menu</a>

</body>
</html>