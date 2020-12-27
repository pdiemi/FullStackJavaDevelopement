<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Failed</title>
</head>
<body>
	<h1>Login Failed</h1>
	<p style="color: red;">Username or password is incorrect. Please
		try again.</p>
	<br />
	<p style="color: red;">Notes: username is your first name (case
		insensitive) and password is your email.</p>
	<form method="post" action="LoginVerify.jsp">
		Username:<input type="text" name="username"> <br /> 
		Password:<input	type="password" name="password"><br>

		<button type="submit">Login</button>
	</form>
	<br/>
	<br/>
	<a href="Index.jsp">Back to Menu</a>
</body>
</html>