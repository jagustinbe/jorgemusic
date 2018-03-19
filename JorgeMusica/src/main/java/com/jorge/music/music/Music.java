package com.jorge.music.music;

/*****************************************************************
*	Date: 2017
*	@author COR
*  
* Music class
*
CREATE TABLE Music
(
	musicID 			integer	not null PRIMARY KEY AUTOINCREMENT,
	userMusciId			integer not null,
	songName			varchar(255) null,
	artist				varchar(150) null,
	yearPublished		datetime,
	songUrl				varchar(255) null,
	description 		TEXT null,-- description	regarding	the	song
	why 				varchar(255) null,-- why	this	song	is	in	the	list reflecting	back	to	the	theme	of	the	list.	
	parentAnotation		varchar(255) null,
	FOREIGN KEY (userMusciId) REFERENCES UserMusic(userMusciId)	--foreign key from UserMusic table
);
*****************************************************************/

public class Music {
	
	// DATA
	//............................................................
	//declare objects
	
	private int 	musicID;
	private int userMusciId; 
	private String songName;
	private String artist;
	//yearPublished datetime
	private String songUrl;
	private String 	why;
	private String parentAnotation;
	
	// CONSTRUCTORS
	//............................................................
	
	public Music(int 	musicID, int userMusciId,String songName,String artist, String songUrl, String 	why,String parentAnotation) {
		this.musicID = musicID;
		this.userMusciId = userMusciId;
		this.songName = songName;
		this.artist = artist;
		this.songUrl = songUrl;
		this.why = why;
		this.parentAnotation = parentAnotation;
	}

	
	// METHODS 
	//............................................................

	@Override
	public String toString() {
		return String.format(
				"Music [musicID=%s,  userMusciId=%s, songName=%s, artist=%s,  songUrl=%s,  	why=%s, parentAnotation=%s ]",
				 	musicID,  userMusciId, songName, artist,  songUrl,  	why, parentAnotation);
	}
	
	
	
	// METHODS - Gets and Sets
	//............................................................


	public int getMusicID() {
		return musicID;
	}

	public void setMusicID(int musicID) {
		this.musicID = musicID;
	}

	public int getUserMusciId() {
		return userMusciId;
	}

	public void setUserMusciId(int userMusciId) {
		this.userMusciId = userMusciId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongUrl() {
		return songUrl;
	}

	public void setSongUrl(String songUrl) {
		this.songUrl = songUrl;
	}

	public String getWhy() {
		return why;
	}

	public void setWhy(String why) {
		this.why = why;
	}

	public String getParentAnotation() {
		return parentAnotation;
	}

	public void setParentAnotation(String parentAnotation) {
		this.parentAnotation = parentAnotation;
	}

	public void display() {
		System.out.println(this.toString());
	}
	
}//EOC
