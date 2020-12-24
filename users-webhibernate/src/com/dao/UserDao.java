package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.user.User;
import com.utility.HibernateUtility;

public class UserDao {

	private static Session session = HibernateUtility.getSession();

	public static boolean addUser(User user) {
		boolean status = false;
		try {
			Transaction tx = session.beginTransaction();
			User userToAdd = new User(user.getUserFirstName(), user.getUserLastName(), user.getUserEmail(),
					user.getUserCity());
			session.save(userToAdd);
			tx.commit();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static boolean updateUser(User user) {
		boolean status = false;
		try {
			Transaction tx = session.beginTransaction();
			User userToUpdate = (User) session.get(User.class, user.getUserId());
			userToUpdate.setUserId(user.getUserId());
			userToUpdate.setUserFirstName(user.getUserFirstName());
			userToUpdate.setUserLastName(user.getUserLastName());
			userToUpdate.setUserEmail(user.getUserEmail());
			userToUpdate.setUserCity(user.getUserCity());
			session.update(userToUpdate);
			tx.commit();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static boolean deleteUser(User user) {
		boolean status = false;
		try {
			System.out.println(user);
			Transaction tx = session.beginTransaction();
			User userToDelete = (User) session.get(User.class, user.getUserId());
			session.delete(userToDelete);
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
			String userEmail = userFirstName.concat(".").concat(userLastName).concat(email).replaceAll("\\s+","");
			User user = new User(userFirstName, userLastName, userEmail, userCity);
			addUser(user);
		}
	}
}
