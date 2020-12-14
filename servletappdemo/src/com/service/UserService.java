package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.UserDao;
import com.model.Registration;

public class UserService implements UserDao{

	String sql = "insert into employee(empName, empEmail, empCity) values (?,?,?)";
	
	@Override
	public void registration(Registration reg) {
		
		Connection conn = null;
		PreparedStatement pst = null;

		try {
			// load the driver
			Class.forName("org.h2.Driver");
			// establish the connection
			// username: sas, password: <none>
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			// write the statement
			pst = conn.prepareStatement(sql);
			pst.setString(1, reg.getName());
			pst.setString(2, reg.getEmail());
			pst.setString(3, reg.getCity());
			// execute the statement
			int registered = pst.executeUpdate();
			if (registered > 0) {
				System.out.println("added");
				System.out.println(" is registered");
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
		


	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

}
