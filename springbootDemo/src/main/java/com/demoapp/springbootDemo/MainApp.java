package com.demoapp.springbootDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class MainApp {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	//@ResponseBody
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	@ResponseBody
	public String sayHi() {
		return "Welcome";
	}
}
