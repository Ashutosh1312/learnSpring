package helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
@Bean
	public String name() {
		return "ashutosh";
	}
@Bean
public int id() {
	return 1;
}
@Bean(name="age2")
public int age() {
	return 25;
}
@Bean
public Address address() {
	return new Address("line1","mumbai");
	
}
@Bean
public Person person() {
	return new Person(name(),age());
}
}
