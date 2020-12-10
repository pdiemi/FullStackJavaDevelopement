package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String sql = "insert into employee(empName, empEmail, empCity) values (?,?,?)";
		Connection conn = null;
		PreparedStatement pst = null;
		
		String uname = request.getParameter("uname");
		String uemail = request.getParameter("uemail");
		String ucity = request.getParameter("ucity");
		//String upass = request.getParameter("upass");

		try {
			// load the driver
			Class.forName("org.h2.Driver");
			// establish the connection
			// username: sas, password: <none>
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			// write the statement
			pst = conn.prepareStatement(sql);
			pst.setString(1, uname);
			pst.setString(2, uemail);
			pst.setString(3, ucity);
			// execute the statement
			int registered = pst.executeUpdate();
			if (registered > 0) {
				System.out.println("added");
				response.getWriter().println(uname + " is registered");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("user is inserted");

			try {
				// close the statement
				pst.close();
				// close the onnection
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
