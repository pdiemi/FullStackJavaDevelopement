package jbdcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class ResultSetDemo {

	public static void main(String[] args) {

		String sql = "select * from employee";
		Connection conn = null;
		PreparedStatement pst = null;
		ArrayList<Employee> empList = new ArrayList<>();

		try {
			// load the driver
			Class.forName("org.h2.Driver");
			// establish the connection
			// username: sas, password: <none>
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			// write the statement
			pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			System.out.println("EMPLOYEE:");
			while (rs.next()) {
				String name = rs.getString(1);
				String email = rs.getString(2);
				String city = rs.getString(3);

				empList.add(new Employee(name, email, city));
			}
			
			Collections.sort(empList, new EmployeeNameComparator());
			empList.forEach(System.out::println);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// close the statement
				pst.close();
				// close the onnection
				conn.close();
				if (conn.isClosed())
					System.out.println("connection is closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
