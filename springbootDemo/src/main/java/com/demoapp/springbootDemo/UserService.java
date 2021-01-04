package com.demoapp.springbootDemo;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private HashMap<String, String> userList = new HashMap();

	public boolean loginValid(String username, String password) {
		if (username.equals("admin") && password.equals("manager")) {
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
