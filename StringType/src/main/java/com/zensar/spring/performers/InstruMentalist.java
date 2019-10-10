package com.zensar.spring.performers;

import java.util.Enumeration;
import java.util.Properties;

public class InstruMentalist implements Performer {
	private	Properties instrumentSongProps ;//non genric class

	public Properties getInstrumentSongProps() {
		return instrumentSongProps;
	}

	public void setInstrumentSongProps(Properties instrumentSongProps) {
		this.instrumentSongProps = instrumentSongProps;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("instrumentalist is playing song");
	Enumeration instruments = instrumentSongProps.keys();
	while (instruments.hasMoreElements()) {
		String instrumentName = (String) instruments.nextElement();
		
	
	String song = instrumentSongProps.getProperty(instrumentName);
	System.out.println(song+"says by" +instrumentName);
	}
	}

}
