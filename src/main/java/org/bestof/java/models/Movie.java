package org.bestof.java.models;

public class Movie {

	private Integer id;
	private String movieTitle;

	public Movie(Integer id, String movieTitle) {
		this.id = id;
		this.movieTitle = movieTitle;

	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMovieTitle() {
		return this.movieTitle;
	}

	public void setName(String movieTitle) {
		this.movieTitle = movieTitle;
	}
}
