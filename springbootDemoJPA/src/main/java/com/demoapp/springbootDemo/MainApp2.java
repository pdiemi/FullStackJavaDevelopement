package com.demoapp.springbootDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/root")
public class MainApp2 {

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	// @RequestMapping(value = "/login", method = RequestMethod.POST)
	@PostMapping("/login")
	public String loginValid(@RequestParam("username") String username, @RequestParam("password") String password) {
		if (userService.loginValid(username, password)) {

			return "loginSuccess";
		}
		return "loginFail";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	// @RequestMapping(value = "/register", method = RequestMethod.POST)
	@PostMapping("/register")
	@ResponseBody
	public String registerValid(@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("password2") String password2) {
		if (userService.registerValid(username, password, password2)) {
			return "Register successfull. Welcome " + username;
			//return "registerSuccess";
		}
		return "registerFail";
	}

	@GetMapping("/loadusers")
	@ResponseBody
	/*
	 * public HashMap<String, String> loadUsers() { return
	 * userService.getUserList(); }
	 */
	public List<Login> loadUsers() {
		return userService.findAllUsers();
	}

	@GetMapping("/finduser/{username}")
	@ResponseBody
	public String findUser(@PathVariable("username") String username) {
		if (userService.findUser(username)) {
			return "User found "+username;
		}
		return "User not found";
	}
	
	@GetMapping("/updateuser/{username}/{password}")
	@ResponseBody
	public String updateUser(@PathVariable("username") String username, @PathVariable("password") String password) {
		if (userService.updateUser(username, password)) {
			return "User has been updated";
		}
		return "Something went wrong. User could not be updated.";
	}
	
	@GetMapping("/deleteuser/{username}")
	@ResponseBody
	public String deleteUser(@PathVariable("username") String username) {
		if(userService.deleteUser(username)) {
			return "User has been deleted";
		}
		return "Something went wrong. User has not been deleted";
	}
	
}
