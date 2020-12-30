package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.service.CalculatorService;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CalculatorService cs = (CalculatorService)context.getBean("service");
		System.out.println(cs.service(2345));		
		//((ClassPathXmlApplicationContext) context).close();
		context.close();
	}

}
