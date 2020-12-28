<%@page import="com.dao.UserDao"%>
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
	int status = UserDao.addUser(u);
switch (status) {
case 0:
	response.sendRedirect("AddUserError.jsp");
	break;
case 1:
	String welcomeMessage = "User is added/registered. Welcome ";
	welcomeMessage = welcomeMessage.concat(request.getParameter("userFirstName")).concat(" ")
	.concat(request.getParameter("userLastName"));
	session.setAttribute("welcomeMessage", welcomeMessage);
	response.sendRedirect("AddUserSuccess.jsp");
	break;
case 2:
	response.sendRedirect("UserAlreadyExists.jsp");
	break;
case 3:
	response.sendRedirect("AddUserForm.jsp");
	break;
default:
	response.sendRedirect("AddUserError.jsp");
	break;
}
%>