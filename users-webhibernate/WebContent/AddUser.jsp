<%@page import="com.dao.UserDao"%>
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
	boolean status = UserDao.addUser(u);
if (status) {
	String welcomeMessage = "Welcome ";
	welcomeMessage = welcomeMessage.concat(request.getParameter("userFirstName")).concat(" ").concat(request.getParameter("userLastName"));
	session.setAttribute("welcomeMessage", welcomeMessage);
	response.sendRedirect("AddUserSuccess.jsp");
} else {
	response.sendRedirect("AddUserError.jsp");
}
%>