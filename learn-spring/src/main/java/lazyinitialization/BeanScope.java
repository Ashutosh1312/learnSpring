package lazyinitialization;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import DependencyInject.DependencyLauncher;
@Component
class normalClass{
	
}
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class prototypeClass{
	
}
@Configuration
@ComponentScan
public class BeanScope {
	public static void main(String[] args) {
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanScope.class);

//Arrays.stream(context.getBeanDefinitionNames()).forEach(element->System.out.println(element));
//System.out.println("running business class");
System.out.println(context.getBean(normalClass.class));
System.out.println(context.getBean(normalClass.class));



System.out.println(context.getBean(prototypeClass.class));
System.out.println(context.getBean(prototypeClass.class));
System.out.println(context.getBean(prototypeClass.class));

	}
	
}
