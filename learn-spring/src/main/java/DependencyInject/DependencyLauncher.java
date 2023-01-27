package DependencyInject;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyLauncher {

	public static void main(String[] args) {
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DependencyLauncher.class);
	Arrays.stream(context.getBeanDefinitionNames()).forEach(element->System.out.println(element));
	}

}
