package com.zensar.spring;
//this is POJO class

public class FestivalGreeting implements Greeting {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Dasara";
	}
public FestivalGreeting() {
	// TODO Auto-generated constructor stub
	System.out.println("Festival Greeting is created.yipee!!!!!!!!!!!!!!");
}
}
