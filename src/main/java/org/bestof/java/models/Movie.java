package org.bestof.java.models;

public class Movie {

	private Integer id;
	private String title;

	public Movie(Integer id, String movieTitle) {
		this.id = id;
		this.title = movieTitle;

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

	public void setName(String movieTitle) {
		this.title = movieTitle;
	}
}
