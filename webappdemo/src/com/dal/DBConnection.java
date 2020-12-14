package com.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection connection;

	public DBConnection() {
		
		try {
			// load the driver
			Class.forName("org.h2.Driver");
			// establish the connection
			// username: sas, password: <none>
			connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Connection getConnection() {
		return connection;
	}

}
