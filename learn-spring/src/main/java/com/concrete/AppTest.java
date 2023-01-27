package com.concrete;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.register(AppConfig.class);
context.refresh();

Entitlement ent=(Entitlement)context.getBean("entitlement");
System.out.println(ent.getName());
System.out.println(ent.getTime());
	}

}
