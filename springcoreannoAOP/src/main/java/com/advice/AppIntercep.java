package com.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppIntercep implements Ordered{

	@Before("execution(* com.model.WelcomeDAO.*(..))")
	public void calledBefore() {
		System.out.println("called before 2");
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}
}
