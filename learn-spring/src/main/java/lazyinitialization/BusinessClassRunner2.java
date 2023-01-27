package lazyinitialization;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//import DependencyInject.DependencyLauncher;

@Component
class ClassA{
	
}
@Component
@Lazy
class ClassB{
	private ClassA classA;
		public ClassB(ClassA classA) {
			System.out.println("initialization logic");
			this.classA=classA;
		
	}public void doSomething() {
		System.out.println("do something");
	}
	
}
@Configuration
@ComponentScan
public class BusinessClassRunner2 {
	public static void main(String[] args) {
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BusinessClassRunner2.class);

//Arrays.stream(context.getBeanDefinitionNames()).forEach(element->System.out.println(element));
System.out.println("initialization of context is completed");
context.getBean(ClassB.class).doSomething();

	}
	
}
