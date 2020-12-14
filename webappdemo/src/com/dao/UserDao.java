package com.dao;

import com.model.Login;
import com.model.Registration;

public interface UserDao {

	public boolean registration(Registration reg);
	public boolean login(Login login);
}
