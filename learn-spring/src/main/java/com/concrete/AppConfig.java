package com.concrete;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Entitlement entitlement() {
	Entitlement ent=new Entitlement();
	ent.setName("john");
	ent.setTime(12);
	return ent;
		
	}

}
