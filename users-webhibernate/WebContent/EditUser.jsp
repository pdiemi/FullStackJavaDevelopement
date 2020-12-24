<%@page import="com.dao.UserDao"%>
<%@page import="com.user.User"%>
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
	UserDao.updateUser(u);
response.sendRedirect("ViewUsers.jsp");
%>