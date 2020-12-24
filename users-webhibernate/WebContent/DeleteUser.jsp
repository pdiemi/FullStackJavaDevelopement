<%@page import="com.dao.UserDao"%>
<%@page import="com.user.User"%>
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
User user = UserDao.getUserById(Integer.valueOf(request.getParameter("id")));
UserDao.deleteUser(user);
response.sendRedirect("ViewUsers.jsp");
%>