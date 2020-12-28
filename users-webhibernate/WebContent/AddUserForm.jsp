<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New User</title>
</head>
<body>

<h1>Add New User/Register</h1>
<p style="color:red";>Notes: Fields marked with * is required.</p>
<form action="AddUser.jsp" method="post">
<table>
<tr><td>First Name:</td><td><input type="text" name="userFirstName"/></td></tr>
<tr><td>Last Name:</td><td><input type="text" name="userLastName"/></td></tr>
<tr><td>Email*:</td><td><input type="email" name="userEmail"/></td></tr>
<tr><td>City:</td><td><input type="text" name="userCity"/></td></tr>
<tr><td>Password*:</td><td><input type="password" name="userPassword"/></td></tr>
<tr><td colspan="2"><input type="submit" value="Add/Register"/></td></tr>
</table>
</form>

<form action="Index.jsp" method="post">
<input type="submit" value="Cancel"/>
</form>

</body>
</html>