package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.CalculatorDAO;

public class Client {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CalculatorDAO cal = (CalculatorDAO) context.getBean("calculatorDAOImpl");

		cal.add(4, 5);
		cal.sub(4, 5);
		cal.multiply(4, 5);

		context.close();
	}

}
