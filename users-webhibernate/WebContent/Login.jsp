<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<p style="color: red;">Notes: username is your email (case
		sensitive)</p>
	<form method="post" action="LoginVerify.jsp">
		Username:<input type="text" name="username"> <br /> 
		Password:<input
			type="password" name="password"><br>

		<button type="submit">Login</button>
	</form>
</body>
</html>