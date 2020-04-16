package com.sihan.study.springjavaconfig;

public class SgtPeppers implements CompactDisc {

	private String title;
	private String artist;

	public SgtPeppers(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	// private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	// private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
