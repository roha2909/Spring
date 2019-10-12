package com.zensar.performers;

import com.zensar.spring.magicboxes.MagicBox;

public class Magician implements Performer {
	private String MagicWords;
	private MagicBox magicBox;
	
	
	public String getMagicWords() {
		return MagicWords;
	}


	public void setMagicWords(String magicWords) {
		MagicWords = magicWords;
	}


	public MagicBox getMagicBox() {
		return magicBox;
	}


	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}


	@Override
	public void Perform() {
		// TODO Auto-generated method stub
System.out.println("Magicians Says "+MagicWords);
System.out.println(magicBox.getContents());

	}

}
