package com.zensar.spring.performers;

import org.springframework.beans.factory.BeanNameAware;

import com.zensar.spring.instruments.Instrument;

public class InstruMentalist implements Performer,BeanNameAware {
	private Instrument instrument;//complex type
	private String song;
	private String name;
public InstruMentalist() {
	// TODO Auto-generated constructor stub
	System.out.println("Instrumentalist is created!!!!!!!!!!!!!");
}

	public Instrument getInstrument() {
	return instrument;
}

public void setInstrument(Instrument instrument) {
	this.instrument = instrument;
	System.out.println("Instrument is set");
}

public String getSong() {
	return song;
	
}

public void setSong(String song) {
	this.song = song;
	System.out.println("song is played!!!!");
}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
System.out.println("Instrumentalist"+name+" is playing A SONG" +song);
instrument.play();
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

}
