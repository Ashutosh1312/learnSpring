 package com.concrete;

import java.util.Arrays;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;


@Named
class yourBusiness{
	private DataService dataService;
	public DataService getDataService() {
		System.out.println("setter injection");
		return dataService;
	}
 @Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
@Component
	class DataService{
		
	}
}
@Configuration
@Component
public class cdiContext {
	public static void main(String[] args) {
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(cdiContext.class);

Arrays.stream(context.getBeanDefinitionNames()).forEach(element->System.out.println(element));
System.out.println(context.getBean(yourBusiness.class).getDataService());
	}
}
