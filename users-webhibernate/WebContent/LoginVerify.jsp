<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.dao.UserDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Verify</title>
</head>
<body>
<%
	com.user.Login login = new com.user.Login(request.getParameter("username"), request.getParameter("password"));

	boolean loginVerified = UserDao.login(login);
	if (loginVerified) {
		// response.getWriter().println(login.getUsername() + " logged in");
		// add cookie
		Cookie cookie = new Cookie("user", login.getUsername());
		response.addCookie(cookie);
		// get session
		session.setAttribute("sessionname", login.getUsername());
		response.sendRedirect("LoginSuccess.jsp");
	} else {
		response.sendRedirect("LoginFailed.jsp");
	}
	%>
</body>
</html>