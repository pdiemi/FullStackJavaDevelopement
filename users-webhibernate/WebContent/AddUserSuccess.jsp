<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User Success</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h1>Add New User</h1>

	<%
		out.println(session.getAttribute("welcomeMessage"));
	%>


	<br />
	<br />
	<a href="AddUserForm.jsp">Add Another New User</a>
	<br />
	<a href="Index.jsp">Back to Menu</a>
	<br />
	<br />
	<a href="Logout.jsp">Logout</a>

</body>
</html>