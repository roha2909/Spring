package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformanceExceptions;

@Component("Rushikesh")
public class Juggler implements Performer {
	@Value("2")
	private int beanBags;

	@Override
	public void perform() throws PerformanceExceptions {
		// TODO Auto-generated method stub
		if (beanBags < 3)
			throw new PerformanceExceptions("sorry!!!!no of bean Bags are not sufficicent");
		else {
			System.out.println("juggler juggling bean bags");
		}
	}

}
