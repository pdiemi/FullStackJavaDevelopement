package jbdcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) {

		String sql = "insert into employee(empName, empEmail, empCity) values (?,?,?)";
		Connection conn = null;
		PreparedStatement pst = null;

		Scanner scan = new Scanner(System.in);
		String name, email, city;
		
		do {
			System.out.print("Employee name (max 10 characters): ");
			name = scan.next();
		} while (name.length() > 10);
		
		do {
			System.out.print("Employee email (max 10 characters): ");
			email = scan.next();
		} while (email.length() > 10);
		
		do {
			System.out.print("Employee city (max 10 characters): ");
			city = scan.next();
		} while (city.length() > 10);
		
		Employee emp = new Employee(name, email, city);
		

		try {
			// load the driver
			Class.forName("org.h2.Driver");
			// establish the connection
			// username: sas, password: <none>
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			// write the statement
			pst = conn.prepareStatement(sql);
			pst.setString(1, emp.getEmpName());
			pst.setString(2, emp.getEmpEmail());
			pst.setString(3, emp.getEmpCity());
			// execute the statement
			pst.executeUpdate();

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
