package com.java.psl.training.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<Movie>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of movies");
		int n = Integer.parseInt(scan.nextLine());
		Movie movie;
		for(int i=0;i<n;i++) {
			movie = new Movie();
			
			System.out.println("Enter movie name");
			movie.setName(scan.nextLine());
			System.out.println("Enter movie language");
			movie.setLanguage(scan.nextLine());
			System.out.println("Enter movie director");
			movie.setDirector(scan.nextLine());
			try {
				System.out.println("Enter release date (dd-mm-yyyy)");
				movie.setReleaseDate(new SimpleDateFormat("dd-mm-yyyy").parse(scan.nextLine()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			System.out.println("Enter duration");
			movie.setDuration(Integer.parseInt(scan.nextLine()));
			movieList.add(movie);
		}
		scan.close();
		for (Movie movi : movieList) {
			System.out.println(movi.getLanguage());
		}
		System.out.println("Movies Sorted by Language");
		Collections.sort(movieList);
		for (Movie movi : movieList) {
			System.out.println(movi.getLanguage());
		}
		Comparator<Movie> compByDuration = new Comparator<Movie>() {

			@Override
			public int compare(Movie movie0, Movie movie1) {
				if(movie0.getDuration()<movie1.getDuration())
					return -1;
				else if(movie0.getDuration()>movie1.getDuration())
					return  1;
				return 0;
			}
			
		};
		Collections.sort(movieList,compByDuration);
		System.out.println("Movies Sorted by Duration");
		for (Movie movi : movieList) {
			System.out.println(movi.getDuration());
		}
		
		Comparator<Movie> compByDirector = new Comparator<Movie>() {

			@Override
			public int compare(Movie movie0, Movie movie1) {
				if(movie0.getDirector().compareTo(movie1.getDirector())<0)
					return -1;
				else if(movie0.getDirector().compareTo(movie1.getDirector())>0)
					return 1;
				return 0;
			}
			
		};
		System.out.println("Movies sorted by Director");
		Collections.sort(movieList,compByDirector);
		for (Movie movi : movieList) {
			System.out.println(movi.getDuration());
		}
		
		Comparator<Movie> compByReleaseDate = new Comparator<Movie>() {

			@Override
			public int compare(Movie movie0, Movie movie1) {
				if(movie0.getReleaseDate().compareTo(movie1.getReleaseDate())<0)
					return -1;
				if(movie0.getReleaseDate().compareTo(movie1.getReleaseDate())>0)
					return 1;
				return 0;
			}
		};
		System.out.println("Movies Sorted  by Release Date");
		Collections.sort(movieList,compByReleaseDate);
		for (Movie movi : movieList) {
			System.out.println(movi.getDuration());
		}
	}

}
