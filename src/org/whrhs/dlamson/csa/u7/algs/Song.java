package org.whrhs.dlamson.csa.u7.algs;

public class Song {

	private String title;
	private int seconds;
	
	public Song(String title, int seconds) {
		this.title = title;
		this.seconds = seconds;
	}
	
	public int getSeconds() {
		return seconds;
	}
}
// Song favoriteSong = new Song("Hooked on Feeling", 345);