package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.Greeting;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of spring IOc Container
		
		ApplicationContext cts = new ClassPathXmlApplicationContext("greetings.xml");
		Greeting g = cts.getBean("anniversaryGreeting", Greeting.class);
		//System.out.println(g.greet());
		Greeting g1 =cts.getBean("festival", Greeting.class);
		//System.out.println(g1.greet());

	}

}
