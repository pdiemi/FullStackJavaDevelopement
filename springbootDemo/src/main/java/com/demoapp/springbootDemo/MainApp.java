package com.demoapp.springbootDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class MainApp {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	//@ResponseBody
	public String login() {
		return "login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public String loginValid(@RequestParam("username") String username, @RequestParam("password") String password) {
		if(username.equals("admin") && password.equals("manager")) {
			return "Login successfull";
		}
		return "Login failed";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	//@ResponseBody
	public String register() {
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	@ResponseBody
	public String registerValid(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("password2") String password2) {
		if(password2.equals(password)) {
			return "Register successfull. Welcome "+username;
		}
		return "Register failed. Password did not match.";
	}
	
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	@ResponseBody
	public String sayHi() {
		return "Welcome";
	}
}
