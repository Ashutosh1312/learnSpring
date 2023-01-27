package com.concrete;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{


@Override
public int[] retrieveData() {
	return new int[] {54,67,556,8,6,5};
	
}
}
