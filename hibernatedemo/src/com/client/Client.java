package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Address;
import com.entity.Employees;
import com.utility.HibernateUtility;

public class Client {

	public static void main(String args[]) {

		Session session = HibernateUtility.getSession();

		// clear table EMPLOYEES
		//deleteAll(session);
		// insert new Employees to the DB
		String name = "name";
		for (Integer i = 1001; i <= 1005; i++) {
			String newName = name.concat(i.toString());
			Address address = new Address (i+1000, "austin", "usa");
			insert(session, i, newName, "austin", address);
		}
		selectAll(session);
		System.out.println("");
		// search employee given empId
		searchById(session, 1001);
		System.out.println("");
		// delete an employee given empId
		delete(session, 1001);
		selectAll(session);
		System.out.println("");
		//update an employee given empId
		updateEmpCity(session, 1002, "San Antonio");
		selectAll(session);
	}

	public static void selectAll(Session session) {
		/*
		 * Show all Employees in the DB. 
		 * Equivalent to SELECT * FROM EMPLOYEES
		 */
		List<Employees> data = session.createQuery("from Employees").list();
		System.out.println("User list:");
		for (Employees e : data)
			System.out.println(e);
	}

	public static void insert(Session session, int empId, String empName, String empCity, Address empAddress) {
		/*
		 * Insert a new Employees into DB. 
		 * Equivalent to INSERT INTO EMPLOYEES
		 */
		Transaction tx = session.beginTransaction();
		Employees emp = new Employees(empAddress, empId, empName, empCity);
		//session.save(empAddress);  // by using cascade, this line is done automatically
		session.save(emp);
		tx.commit();
		System.out.println("user added");
	}

	public static void searchById(Session session, int empId) {
		/*
		 * Search an Employees in DB by primary key empId. 
		 * Equivalent to SELECT * FROM
		 * EMPLOYEES WHERE EMPID = empId
		 */
		System.out.println("Search for user with empID = " + empId);
		Employees emp = (Employees) session.get(Employees.class, empId);
		System.out.println(emp);
	}

	public static void delete(Session session, int empId) {
		/*
		 * Delete an Employees with empId from DB. 
		 * Equivalent to DELETE FROM EMPLOYEES
		 * WHERE EMPID = empId
		 */
		System.out.println("Delete user with empID = " + empId);
		Transaction tx = session.beginTransaction();
		Employees emp = (Employees) session.get(Employees.class, empId);
		session.delete(emp);
		tx.commit();
		System.out.println("user deleted");
	}
	
	public static void deleteAll(Session session) {
		/*
		 * Delete all data of EMPLOYEES table. 
		 * Equivalent to DELETE FROM EMPLOYEES
		 */
		int clearTable = session.createQuery("delete from Employees").executeUpdate();
		if (clearTable > 0)
			System.out.println("EMPLOYEES table is cleared.");
		else
			System.out.println("Failed to clear table EMPLOYEES.");
	}

	public static void updateEmpCity(Session session, int empId, String empCity) {
		/*
		 * Update city of an Employees. 
		 * Equivalent to UPDATE EMPLOYEES SET EMPCITY =
		 * empCity where EMPID = empId
		 */
		System.out.println("Update city of user with empID = " + empId);
		Transaction tx = session.beginTransaction();
		Employees emp = (Employees) session.get(Employees.class, empId);
		emp.setEmpCity(empCity);
		session.update(emp);
		tx.commit();
		System.out.println("user updated");
	}
}
