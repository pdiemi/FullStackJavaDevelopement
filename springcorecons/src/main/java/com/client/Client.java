package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CalculatorService;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		CalculatorService cs = (CalculatorService)context.getBean("service");
		System.out.println(cs.service(2345));		
		//((ClassPathXmlApplicationContext) context).close();
		context.close();
	}

}
