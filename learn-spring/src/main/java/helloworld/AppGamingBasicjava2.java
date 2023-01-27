package helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yaml.snakeyaml.events.Event.ID;

public class AppGamingBasicjava2 {

	public static void main(String[] args) {

@SuppressWarnings("resource")
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//configure the things that we want the spring to manage-@Configuration
	System.out.println("Name: "+context.getBean("name"));
	System.out.println("Id: "+context.getBean("id"));
	System.out.println("Age: "+context.getBean("age2"));
	System.out.println("address: "+context.getBean("address"));
	System.out.println("Person: "+context.getBean("person"));
Arrays.stream(context.getBeanDefinitionNames()).forEach(element-> System.out.println(element));
	}

}
