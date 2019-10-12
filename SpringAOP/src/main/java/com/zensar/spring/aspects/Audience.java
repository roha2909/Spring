package com.zensar.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	@Pointcut("execution(* *.perform(..))") // *perform method belong to any object
//	@Pointcut("execution(void *.perform(..))") //returns only void
//	@Pointcut("execution(void  com.zensar.spring.performers.juggler.perform(..))") //belongs to class
//	@Pointcut("execution(public void  com.zensar.spring.performers.juggler.perform(..))") //only for public
	public void performancePointCut() {

	}

	@Before("performancePointCut()")
	public void takeSeats() {
		System.out.println("audience taking their seats!!!!!!!!!");
	}

	@Before("execution(* *.perform(..))")//another way to write pointcut
	public void switchOffCellPhones() {
		System.out.println("audience Switching off their cell phones!!!!!!");
	}

	@Before("performancePointCut()")
	public void applaued() {
		System.out.println("Clap clap clap clap!!!!!!!!!!!");
	}

	@AfterReturning("performancePointCut()")
	public void demandRefund() {
		System.out.println("give me my money back!!!!!!!!!!");
	}
}
