package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		}
		else {
			response.getWriter().println("log in failed");
		}
			
	}

}
