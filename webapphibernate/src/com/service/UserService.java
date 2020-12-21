package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dal.DBConnection;
import com.dao.UserDao;
import com.model.Login;
import com.model.Registration;
import com.utility.HibernateUtility;

public class UserService implements UserDao {

	@Override
	public boolean registration(Registration reg) {

		boolean isRegistered = false;

		try {
			Session session = HibernateUtility.getSession();
			Transaction tx = session.beginTransaction();
			session.save(reg);
			tx.commit();
			
			isRegistered = true;
			System.out.println("user is inserted");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			System.out.println("user logged in");

			try {
				// close the statement
				pst.close();
				// close the connection
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return loginVerified;

	}

}
