package com.demoapp.springbootDemo;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private HashMap<String, String> userList = new HashMap<String, String>();

	public boolean loginValid(String username, String password) {
		// if (username.equals("admin") && password.equals("manager")) {
		if (userList.isEmpty()) {
			return false;
		}
		if (userList.get(username).equals(password)) {
			return true;
		}
		return false;
	}

	public boolean registerValid(String username, String password, String password2) {
		if (password2.equals(password)) {
			userList.put(username, password);
			System.out.println(userList);
			return true;
		}
		return false;
	}

	public boolean findUser(String username) {
		String password = userList.get(username);
		if (password != null) {
			System.out.println("User found "+username+"password");
			return true;
		}
		return false;
	}
	
	public boolean updateUser(String username, String password) {
		String oldPassword = userList.get(username);
		
		return userList.replace(username, oldPassword, password);
	}
	
	public boolean deleteUser(String username) {
		return userList.remove(username, userList.get(username));
	}
	
	public UserService() {
		super();
	}

	public HashMap<String, String> getUserList() {
		return userList;
	}

	public void setUserList(HashMap<String, String> userList) {
		this.userList = userList;
	}
}
