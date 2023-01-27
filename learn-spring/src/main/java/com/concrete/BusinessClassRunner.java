package com.concrete;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import DependencyInject.DependencyLauncher;
@Configuration
@ComponentScan
public class BusinessClassRunner {
	public static void main(String[] args) {
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BusinessClassRunner.class);

Arrays.stream(context.getBeanDefinitionNames()).forEach(element->System.out.println(element));
System.out.println("running business class");
context.getBean(BusinessClass.class).findMax();
	}
	
}
