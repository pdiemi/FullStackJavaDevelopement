<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<%@page import="com.dao.UserDao,com.user.User"%>

<%
User u = UserDao.getUserById(Integer.valueOf(request.getParameter("id")));
%>

<h1>Edit Form</h1>
<form action="EditUser.jsp" method="post">
<input type="hidden" name="userId" value="<%=u.getUserId() %>"/>
<table>
<tr><td>First Name:</td><td><input type="text" name="userFirstName" value="<%= u.getUserFirstName()%>"/></td></tr>
<tr><td>Last Name:</td><td><input type="text" name="userLastName" value="<%= u.getUserLastName()%>"/></td></tr>
<tr><td>Email:</td><td><input type="email" name="userEmail" value="<%= u.getUserEmail()%>"/></td></tr>
<tr><td>City:</td><td><input type="text" name="userCity" value="<%= u.getUserCity()%>"/></td></tr>
<tr><td colspan="2"><input type="submit" value="Save"/></td></tr>
</table>
</form>

<form action="Index.jsp" method="post">
<input type="submit" value="Cancel"/>
</form>

</body>
</html>