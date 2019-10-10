package com.zensar.spring.performers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class InstruMentalist implements Performer {
	private Map<Instrument, String> instrumentSongMap;

	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}

	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing songs");
		for (Map.Entry<Instrument, String> m : instrumentSongMap.entrySet()) {
			m.getKey().play();
			System.out.println("Instrumentalist is playing  song = " + m.getValue());

		}
	}

}
