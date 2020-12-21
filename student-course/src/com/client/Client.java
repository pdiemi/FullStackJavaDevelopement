package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Course;
import com.entity.Student;
import com.utility.HibernateUtility;

public class Client {

	public static void main(String args[]) {

		Session session = HibernateUtility.getSession();

		// clear table Student
		//deleteAll(session);
		// insert new Student to the DB
		String name = "name";
		int duration = 18;
		for (Integer i = 1001; i <= 1005; i++) {
			String newName = name.concat(i.toString());
			String newEmail = name.concat("@m.com");
			Course course = new Course (i+1000, "course".concat(i.toString()), duration);
			insert(session, i, newName, newEmail, course);
		}
		selectAll(session);
		System.out.println("");
		// search student given stuId
		searchById(session, 1001);
		System.out.println("");
		// delete an student given stuId
		delete(session, 1001);
		selectAll(session);
		System.out.println("");
		//update an student given stuId
		updatestuEmail(session, 1002, "San Antonio");
		selectAll(session);
	}

	public static void selectAll(Session session) {
		/*
		 * Show all Student in the DB. 
		 * Equivalent to SELECT * FROM Student
		 */
		List<Student> data = session.createQuery("from Student").list();
		System.out.println("student list:");
		for (Student s : data)
			System.out.println(s);
	}

	public static void insert(Session session, int studId, String stuName, String stuEmail, Course stuCourse) {
		/*
		 * Insert a new Student into DB. 
		 * Equivalent to INSERT INTO Student
		 */
		Transaction tx = session.beginTransaction();
		Student stu = new Student(studId, stuName, stuEmail, stuCourse);
		//session.save(stuAddress);  // by using cascade, this line is done automatically
		session.save(stu);
		tx.commit();
		System.out.println("student added");
	}

	public static void searchById(Session session, int stuId) {
		/*
		 * Search an Student in DB by primary key stuId. 
		 * Equivalent to SELECT * FROM
		 * Student WHERE stuId = stuId
		 */
		System.out.println("Search for student with stuId = " + stuId);
		Student stu = (Student) session.get(Student.class, stuId);
		System.out.println(stu);
	}

	public static void delete(Session session, int stuId) {
		/*
		 * Delete an Student with stuId from DB. 
		 * Equivalent to DELETE FROM Student
		 * WHERE stuId = stuId
		 */
		System.out.println("Delete student with stuId = " + stuId);
		Transaction tx = session.beginTransaction();
		Student stu = (Student) session.get(Student.class, stuId);
		session.delete(stu);
		tx.commit();
		System.out.println("student deleted");
	}
	
	public static void updatestuEmail(Session session, int stuId, String stuEmail) {
		/*
		 * Update city of an Student. 
		 * Equivalent to UPDATE Student SET stuEmail =
		 * stuEmail where stuId = stuId
		 */
		System.out.println("Update city of student with stuId = " + stuId);
		Transaction tx = session.beginTransaction();
		Student stu = (Student) session.get(Student.class, stuId);
		stu.setstuEmail(stuEmail);
		session.update(stu);
		tx.commit();
		System.out.println("student updated");
	}
}
