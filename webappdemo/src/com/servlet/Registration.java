package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.UserService;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserService userService = new UserService();

		com.model.Registration reg = new com.model.Registration(request.getParameter("uname"), 
				request.getParameter("uemail"), request.getParameter("ucity"));
		
		boolean isRegisterd = userService.registration(reg);
		if (isRegisterd) {
			response.getWriter().println(reg.getName() + " is succesfully registered");
		}
		else {
			response.getWriter().println("registration failed");
		}
	}

}
