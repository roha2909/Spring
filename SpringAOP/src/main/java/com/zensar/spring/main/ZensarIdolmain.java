package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.config.PerformerConfig;
import com.zensar.spring.exceptions.PerformanceExceptions;
import com.zensar.spring.performers.Performer;
public class ZensarIdolmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PerformerConfig.class);
		Performer p = ctx.getBean("Rushikesh",Performer.class);
		try {
			p.perform();
		} catch (PerformanceExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
