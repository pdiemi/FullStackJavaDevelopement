package com.demoapp.springbootDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	//private HashMap<String, String> userList = new HashMap<String, String>();
	private List<Login> userList = new ArrayList<>();
	@Autowired
	private UserDAO userDao;

	public boolean loginValid(String username, String password) {
		// if (username.equals("admin") && password.equals("manager")) {
		if (userList.isEmpty()) {
			return false;
		}
		/*
		 * if (userList.get(username).equals(password)) { return true; }
		 */
		if (findUserByUsername(username).getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	public boolean registerValid(String username, String password, String password2) {
		if (password2.equals(password)) {
			//userList.put(username, password);
			userDao.save(new Login(username, password));
			return true;
		}
		return false;
	}

	public boolean findUser(String username) {
		//String password = userList.get(username);
		Login login = null;
		for (Login user : userList) {
			if(user.getUsername().equals(username))
				login = user;
		}
		if (login != null) {
			System.out.println("User found "+username+"password");
			return true;
		}
		return false;
	}
	
	public Login findUserByUsername(String username) {
		//String password = userList.get(username);
		Login login = null;
		for (Login user : userList) {
			if(user.getUsername().equals(username))
				login = user;
		}
		return login;
	}
	
	public boolean updateUser(String username, String password) {
		/*
		 * String oldPassword = userList.get(username); return
		 * userList.replace(username, oldPassword, password);
		 */
		Login user = findUserByUsername(username);
		userDao.delete(user);
		userDao.save(user);
		return true;
	}
	
	public boolean deleteUser(String username) {
		//return userList.remove(username, userList.get(username));
		userDao.deleteById(username);
		return true;
	}
	
	public UserService() {
		super();
	}

	public List<Login> getUserList() {
		return userList;
	}

	public void setUserList(List<Login> userList) {
		this.userList = userList;
	}


	/*
	 * public HashMap<String, String> getUserList() { return userList; }
	 * 
	 * public void setUserList(HashMap<String, String> userList) { this.userList =
	 * userList; }
	 */
}
