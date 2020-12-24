package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.user.User;
import com.utility.HibernateUtility;

public class UserDao {

	private static Session session = HibernateUtility.getSession();

	public static boolean addUser(String userFirstName, String userLastName, String userEmail, String userCity) {
		boolean status = false;
		try {
			Transaction tx = session.beginTransaction();
			User user = new User(userFirstName, userLastName, userEmail, userCity);
			session.save(user);
			tx.commit();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static boolean updateUser(int userId, String userFirstName, String userLastName, String userEmail,
			String userCity) {
		boolean status = false;
		try {
			Transaction tx = session.beginTransaction();
			User user = (User) session.get(User.class, userId);
			user.setUserFirstName(userFirstName);
			user.setUserLastName(userLastName);
			user.setUserEmail(userEmail);
			user.setUserCity(userCity);
			session.update(user);
			tx.commit();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static boolean deleteUser(int userId) {
		boolean status = false;
		try {
			Transaction tx = session.beginTransaction();
			User user = (User) session.get(User.class, userId);
			session.delete(user);
			tx.commit();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static int deleteAllUsers() {
		return session.createQuery("delete from User").executeUpdate();
	}

	public static List<User> getAllUsers() {
		List<User> userList = session.createQuery("from User").list();
		return userList;
	}

	public static User getUserById(int userId) {
		User user = (User) session.get(User.class, userId);
		return user;
	}

	public static void generateSampleUsers() {
		String firstname = "Firstname ";
		String lastname = "Lastname ";
		String email = "@mail.com";
		String userCity = "San Antonio";

		for (Integer i = 1; i <= 5; i++) {
			String userFirstName = firstname.concat(i.toString());
			String userLastName = lastname.concat(i.toString());
			String userEmail = userFirstName.concat(userLastName).concat(email);
			addUser(userFirstName, userLastName, userEmail, userCity);
		}
	}
}
