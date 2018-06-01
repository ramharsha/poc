package com.example.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAop {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext Context = new AnnotationConfigApplicationContext(AppConfig.class);
		A a = Context.getBean(A.class);
		a.show();
	}

}
