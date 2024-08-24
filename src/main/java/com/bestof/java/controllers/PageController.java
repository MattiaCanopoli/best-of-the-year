package com.bestof.java.controllers;

import java.util.ArrayList;
import java.util.List;

import org.bestof.java.models.Movie;
import org.bestof.java.models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PageController {

	@GetMapping("/")
	public String home(@RequestParam(name = "name") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("title", "HomePage");
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
			bestSongs += song.getSongTitle() + ", ";
		}

		model.addAttribute("title", "songs");
		model.addAttribute("list", bestSongs);
		return "songs";
	}

	@GetMapping("/movies")
	public String movies(Model model) {
		String bestMovies = "";
		for (Movie movie : getBestMovies()) {
			bestMovies += movie.getMovieTitle() + ", ";
		}

		model.addAttribute("list", bestMovies);
		model.addAttribute("title", "movies");
		return "movies";
	}

}
