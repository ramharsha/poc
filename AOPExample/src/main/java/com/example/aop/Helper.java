package com.example.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect
public class Helper {
	
	@Before("execution(public void show())")
	public void log()
	{
		System.out.println("before show called");
	}
	
	@After("execution(public void show())")
	public void log1()
	{
		System.out.println("After show() method called");
	}
}
