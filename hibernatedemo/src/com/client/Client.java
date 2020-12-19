package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.utility.HibernateUtility;

public class Client {

	public static void main(String args[]) {
		
		Session session = HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee(101, "admin", "austin");
		session.save(emp);
		
		tx.commit();
		System.out.println("user added");
	}
}
