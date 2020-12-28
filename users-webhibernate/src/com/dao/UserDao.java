package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.user.Login;
import com.user.User;
import com.utility.HibernateUtility;

public class UserDao {

	private static Session session = HibernateUtility.getSession();

	public static int addUser(User user) {
		/*
		 * This method tries to add a user to the database. 
		 * Return 1 if success. 
		 * Return 2 if failed because user already exists. 
		 * Return 3 if failed due to empty email or password
		 * Return 0 if failed due to other exceptions.
		 */
		int status = 0;
		/*
		 * Check if user's email of password is null.
		 * If so, return 3.
		 * */
		if (user.getUserEmail() == null || user.getUserPassword() == null)
			return 3;
		else {

			try {
				/*
				 * Check if the user.userEmail already exists. If exists, set status to 2
				 */
				List<User> userExists = session.createQuery("from User where userEmail = '" + user.getUserEmail() + "'")
						.list();
				if (userExists.size() > 0) {
					status = 2;
				} else {
					Transaction tx = session.beginTransaction();
					User userToAdd = new User(user.getUserFirstName(), user.getUserLastName(), user.getUserEmail(),
							user.getUserCity(), user.getUserPassword());
					session.save(userToAdd);
					tx.commit();
					status = 1;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
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
			userToUpdate.setUserPassword(user.getUserPassword());
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
			String userEmail = userFirstName.concat(".").concat(userLastName).concat(email).replaceAll("\\s+", "");
			String userPassword = userEmail;
			User user = new User(userFirstName, userLastName, userEmail, userCity, userPassword);
			addUser(user);
		}
	}

	public static boolean login(Login login) {
		boolean loginVerified = false;
		try {
			List<User> matchedUser = session.createQuery("from User where userEmail = '" + login.getUsername() + "'")
					.list();
			for (User user : matchedUser) {
				if (login.getPassword().equals(user.getUserPassword())) {
					loginVerified = true;
					return loginVerified;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loginVerified;
	}
}
