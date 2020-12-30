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
		context.close();
	}

}
