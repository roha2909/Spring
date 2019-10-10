package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zensar.spring.config.PerformerConfig;
import com.zensar.spring.performers.Performer;

public class ZensarIdolmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PerformerConfig.class);
		Performer p1 = ctx.getBean("pyarre mohan", Performer.class);
		p1.perform();
	}

}
