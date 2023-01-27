package DependencyInject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class BusinessClass{
	
Dependency1 dependency1;
Dependency2 dependency2;
@Autowired
public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
	super();
	System.out.println("constructor injection");
	this.dependency1 = dependency1;
	
	this.dependency2 = dependency2;
}
/*
@Autowired
		public void setDependency1(Dependency1 dependency1) {
		System.out.println("using setter d1");
		this.dependency1 = dependency1;
	}
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("using setter d2");
	this.dependency2 = dependency2;
	}*/
public String toString() {
	return "using"+dependency1+"and"+dependency2;
}
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DependenctInjectionExample {

	public static void main(String[] args) {

	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DependencyLauncher.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(element->System.out.println(element));
		System.out.println(context.getBean(BusinessClass.class));
		}

	

}
