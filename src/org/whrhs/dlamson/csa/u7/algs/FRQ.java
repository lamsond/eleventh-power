package org.whrhs.dlamson.csa.u7.algs;

public class FRQ {
	
	// attributes
	private Song[] songs;
	private String title;
	private String artistName;
	private int numSongs;
	private static int numAlbums;
	public static final int MAX_SONGS = 20;
	
	// constructor(s)
	public FRQ(String artist, String albumName){
		// set the values
		this.title = albumName;
		this.artistName = artist;
		// initialize the array
		songs = new Song[MAX_SONGS];
		// increment
		numAlbums++;
	}
	
	// methods
	public void addSong(Song song){
		if(numSongs < MAX_SONGS) {
			songs[numSongs] = song;
			numSongs++;
		}
		
		
	}
	
	public int getRuntime() {
		int songLength = 0;
		for(int i = 0; i < numSongs; i++) {
			songLength += songs[i].getSeconds();
		}
		return songLength;
	}

}
