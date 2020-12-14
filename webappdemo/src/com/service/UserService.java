package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dal.DBConnection;
import com.dao.UserDao;
import com.model.Login;
import com.model.Registration;

public class UserService implements UserDao {

	@Override
	public boolean registration(Registration reg) {
		String sql = "insert into employee(empName, empEmail, empCity) values (?,?,?)";
		Connection conn = null;
		PreparedStatement pst = null;
		boolean isRegistered = false;

		try {
			DBConnection dbConnection = new DBConnection();
			conn = dbConnection.getConnection();

			// write the statement
			pst = conn.prepareStatement(sql);
			pst.setString(1, reg.getName());
			pst.setString(2, reg.getEmail());
			pst.setString(3, reg.getCity());
			// execute the statement
			int registered = pst.executeUpdate();
			if (registered > 0) {
				isRegistered = true;
			}

		} catch (SQLException e) {
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
		return isRegistered;

	}

	@Override
	public boolean login(Login login) {
		String sql = "select empName, empEmail from employee";
		Connection conn = null;
		PreparedStatement pst = null;
		boolean loginVerified = false;

		try {
			DBConnection dbConnection = new DBConnection();
			conn = dbConnection.getConnection();

			// write the statement
			pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				if (login.getUsername().equals(rs.getString(1)) && login.getPassword().equals(rs.getString(2))) {
					loginVerified = true;
					break;
				}
			}

		} catch (SQLException e) {
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
		return loginVerified;

	}

}
