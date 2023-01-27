package com.concrete;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class mongoDbDataService implements DataService{

	@Override
	public int[] retrieveData() {

		return new int[] {34,65,34,76,98};
	}

}
