<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Valid</title>
</head>
<body>

	<%
	com.service.UserService userService = new com.service.UserService();

	com.model.Login login = new com.model.Login(request.getParameter("uname"), request.getParameter("upass"));

	boolean loginVerified = userService.login(login);
	if (loginVerified) {
		response.getWriter().println(login.getUsername() + " logged in");
		// add cookie
		Cookie cookie = new Cookie("user", login.getUsername());
		response.addCookie(cookie);
		// get session
		session.setAttribute("sessionname", login.getUsername());
		response.sendRedirect("loginsuccess.jsp");
	} else {
		response.getWriter().println("log in failed");
	}
	%>

</body>
</html>