package org.bestof.java.models;

public class Song {

	private Integer id;
	private String songTitle;

	public Song(Integer id, String title) {
		this.id = id;
		this.songTitle = title;

	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSongTitle() {
		return this.songTitle;
	}

	public void setName(String title) {
		this.songTitle = title;
	}

}
