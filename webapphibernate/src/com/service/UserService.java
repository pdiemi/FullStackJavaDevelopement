package com.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.UserDao;
import com.model.Login;
import com.model.Registration;
import com.utility.HibernateUtility;

public class UserService implements UserDao {

	@Override
	public boolean registration(Registration reg) {

		boolean isRegistered = false;

		try {
			Session session = HibernateUtility.getSession();
			Transaction tx = session.beginTransaction();
			session.save(reg);
			tx.commit();

			isRegistered = true;
			System.out.println("user is inserted");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isRegistered;
	}

	@Override
	public boolean login(Login login) {

		boolean loginVerified = false;

		try {
			Session session = HibernateUtility.getSession();

			List<Registration> matchUser = session
					.createQuery("from Registration where name = '" + login.getUsername() + "'")
					.list();
			for (Registration reg : matchUser) {
				if (login.getPassword().equals(reg.getEmail())) {
					loginVerified = true;
					System.out.println("user logged in");
					return loginVerified;
				} else {

					System.out.println("user failed to log in");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loginVerified;
	}

}
