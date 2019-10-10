package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		Performer p = ctx.getBean("ramlal", Performer.class);
		p.perform();
		ConfigurableApplicationContext cgfCtx = (ConfigurableApplicationContext) ctx;
		cgfCtx.close();//shutting down Spring ioc Container
	}

}
