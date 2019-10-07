package com.zensar.spring.performers;

public class Juggler implements Performer {

	private int beanBags;
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No agrs constructor of juggler");
	}
	
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("parametrised constructor of juggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
System.out.println("juggler juggling beanBags" +beanBags);
	}

}
