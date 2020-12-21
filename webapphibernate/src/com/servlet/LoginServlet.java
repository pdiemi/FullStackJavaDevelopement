package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService = new UserService();
		
		com.model.Login login = new com.model.Login(request.getParameter("uname"), request.getParameter("upass"));
		
		boolean loginVerified = userService.login(login);
		if (loginVerified) {
			response.getWriter().println(login.getUsername() + " logged in");
			// add cookie
			Cookie cookie = new Cookie("user", login.getUsername());
			response.addCookie(cookie);
			// get session
			HttpSession session = request.getSession();
			session.setAttribute("sessionname", login.getUsername());
			response.sendRedirect("loginsuccess.jsp");
		}
		else {
			response.getWriter().println("log in failed");
		}
			
	}

}
