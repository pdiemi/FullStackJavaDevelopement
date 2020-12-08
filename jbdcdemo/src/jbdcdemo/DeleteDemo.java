package jbdcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {

	public static void main(String[] args) {
		String sql = "delete from employee where empName=?";
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
			pst.setString(1, "diemi");
			
			// execute the statement
			pst.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("user is deleted");

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
