package com.bestof.java.controllers;

import java.util.ArrayList;
import java.util.List;

import org.bestof.java.models.Movie;
import org.bestof.java.models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "HomePage");
		String userName = "uName";
		model.addAttribute("name", userName);
		return "home";
	}

	private List<Movie> getBestMovies() {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie(0, "movie 0"));
		movies.add(new Movie(1, "movie 1"));
		movies.add(new Movie(2, "movie 2"));
		movies.add(new Movie(3, "movie 3"));
		return movies;

	}

	private List<Song> getBestSongs() {
		List<Song> songs = new ArrayList<Song>();

		songs.add(new Song(0, "song 0"));
		songs.add(new Song(1, "song 1"));
		songs.add(new Song(2, "song 2"));
		songs.add(new Song(3, "song 3"));

		return songs;

	}

	@GetMapping("/songs")
	public String songs(Model model) {
		String bestSongs = "";
		for (Song song : getBestSongs()) {
			bestSongs += song.getTitle() + ", ";
		}

		model.addAttribute("objList", getBestSongs());
		model.addAttribute("title", "songs");
		model.addAttribute("list", bestSongs);
		return "songs";
	}

	@GetMapping("/movies")
	public String movies(Model model) {
		String bestMovies = "";
		for (Movie movie : getBestMovies()) {
			bestMovies += movie.getTitle() + ", ";
		}

		model.addAttribute("objList", getBestMovies());
		model.addAttribute("list", bestMovies);
		model.addAttribute("title", "movies");
		return "movies";
	}

	@GetMapping("/movies/{id}")
	public String movieDetail(Model model, @PathVariable("id") Integer movieId) {

		String movieTitle = "";

		for (Movie movie : getBestMovies()) {
			if (movieId.equals(movie.getId())) {
				movieTitle = movie.getTitle();
				break;
			}
		}

		model.addAttribute("title", movieTitle);
		return "detail";
	}

	@GetMapping("/songs/{id}")
	public String songDetail(Model model, @PathVariable("id") Integer songId) {

		String songTitle = "";

		for (Song song : getBestSongs()) {
			if (songId.equals(song.getId())) {
				songTitle = song.getTitle();
				break;
			}
		}
		model.addAttribute("title", songTitle);
		return "detail";
	}

}
