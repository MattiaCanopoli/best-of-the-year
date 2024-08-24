package org.bestof.java.models;

public class Song {

	private Integer id;
	private String title;

	public Song(Integer id, String title) {
		this.id = id;
		this.title = title;

	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setName(String title) {
		this.title = title;
	}

}
