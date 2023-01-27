package com.concrete;

import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component
public class BusinessClass {

		private DataService dataService;
		
	public	void BisunessClass(DataService dataService) {
			super();
			this.dataService=dataService;
		}
		
public int findMax() {
	return Arrays.stream(dataService.retrieveData()).max().orElse(0);

	}

}
