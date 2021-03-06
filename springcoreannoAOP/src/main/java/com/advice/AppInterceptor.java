package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppInterceptor implements Ordered{

	@Before("execution(* com.model.WelcomeDAO.*(..))")
	public void calledBefore() {
		System.out.println("called before 1");
	}
	
	@After("execution(* com.model.WelcomeDAO.*(..))")
	public void calledAfter() {
		System.out.println("called after");
	}
	
	@Around("execution(* com.model.WelcomeDAO.sayAround(..))")
	public void calledAround(ProceedingJoinPoint pj) {
		System.out.println("called around");
		try {
			pj.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}
