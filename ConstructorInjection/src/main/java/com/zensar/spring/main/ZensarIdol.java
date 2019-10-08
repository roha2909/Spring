package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;


public class ZensarIdol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
Performer p = ctx.getBean("Pyarre Mohan",Performer.class );
p.perform();
Performer p1 = ctx.getBean("jenelia", Performer.class);
p1.perform();
	}

}
