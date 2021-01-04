package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppInterceptor {

	@Before("execution(* com.model.CalculatorDAO.add(..))")
	public void calledBefore() {
		System.out.println("called before");
	}
	
	@After("execution(* com.model.CalculatorDAO.sub(..))")
	public void calledAfter() {
		System.out.println("called after");
	}
	
	@Around("execution(* com.model.CalculatorDAO.multiply(..))")
	public void calledAround(ProceedingJoinPoint pj) {
		System.out.println("called around");
		try {
			pj.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
