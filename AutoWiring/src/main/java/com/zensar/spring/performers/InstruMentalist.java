package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;

@Component("pyarre mohan")
public class InstruMentalist implements Performer {
	@Autowired // injection it is used only for complex type
	@Qualifier("guitar")
	private Instrument instrument;// complex type
	@Value("jane tu ya jane naa!!!!!!!!!!")
	private String song;

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing A SONG" + song);
		instrument.play();
	}

}
