package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.WelcomeDAO;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		WelcomeDAO wd = (WelcomeDAO) context.getBean("welcomeImpl");
		
		System.out.println(wd.sayWelcom("Diemi"));
		/*
		System.out.println();
		wd.sayHi("Diemi", "diemi@mail.com");
		wd.sayAround();
		*/
		context.close();
	}

}
