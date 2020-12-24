<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find User</title>
</head>
<body>

<h1>Find User</h1>
<form action="FindUser.jsp" method="post">
<table>
<tr><td>User ID:</td><td><input type="text" name="userId"/></td></tr>
<tr><td colspan="2"><input type="submit" value="Find"/></td></tr>
</table>
</form>

<form action="Index.jsp" method="post">
<input type="submit" value="Cancel"/>
</form>

</body>
</html>