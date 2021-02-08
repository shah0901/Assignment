package com.java.psl.training.collection;

import java.util.Date;

public class Movie implements Comparable<Movie>{
	private String name;
	private String language;
	private Date releaseDate;
	private String director;
	private int duration;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public int compareTo(Movie movie) {
		if(this.language.compareTo(movie.language)<0)
			return -1;
		else if(this.language.compareTo(movie.language)>0)
			return 1;
		return 0;
	}
}
