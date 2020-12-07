package jbdcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) {
		
		String sql = "insert into employee(empName, empEmail, empCity) values (?,?,?)";
		try {
			// load the driver
			Class.forName("org.h2.Driver");
			// establish the connection
			// username: sas, password: <none>
			Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			
			//write the statement
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, "diemi");
			pst.setString(2, "dp@m.com");
			pst.setString(3, "austin");
			//execute the statement
			pst.executeUpdate();
			
			//close the statement
			pst.close();
			//close the onnection
			conn.close();

			System.out.println("user is inserted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("");
		}
		
	}

}
