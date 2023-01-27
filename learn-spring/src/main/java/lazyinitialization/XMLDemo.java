package lazyinitialization;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("contextConfiguration.xml");
//Arrays.stream(context.getBeanDefinitionNames()).forEach(element-> System.out.println(element));
	System.out.println(context.getBean("name"));
	System.out.println(context.getBean("age"));

	}

}
