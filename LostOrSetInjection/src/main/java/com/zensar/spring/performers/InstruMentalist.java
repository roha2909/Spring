package com.zensar.spring.performers;

import java.util.List;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class InstruMentalist implements Performer {

	private String song;
	private Set<Instrument> instruments;

	public InstruMentalist() {
		// TODO Auto-generated constructor stub
		System.out.println("Instrumentalist is created!!!!!!!!!!!!!");
	}

	public Set<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
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
		System.out.println("Instrumentalist is playing A SONG" + song);
		for(Instrument i : instruments)
		{
			i.play();
		}

	}

}
