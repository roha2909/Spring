package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
public class AnniversaryGreeting implements Greeting {

	
public AnniversaryGreeting() {
	// TODO Auto-generated constructor stub
	System.out.println("anniversay greeting is created!!!!!!!!!!!!");
}

@Override
public String greet() {
	// TODO Auto-generated method stub
	return "happy anniversary papa and mumaa";
}
}
