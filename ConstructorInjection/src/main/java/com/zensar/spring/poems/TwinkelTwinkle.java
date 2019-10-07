package com.zensar.spring.poems;

public class TwinkelTwinkle implements Poem {
private static final String LINES[]= {
		"TWINKLE TWINKLE LITTEL STAR!!!!!",
		"HOW I WONDER WHAT UR!!!",
		"UP ABOVE THE WORLD SO HIGH",
		"LIKE A DIAMOND IN THE SKY!!!!!!!!!!!!!"
		
};
	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for(String i:LINES)
		{
			System.out.println(i);
		}

	}

}
