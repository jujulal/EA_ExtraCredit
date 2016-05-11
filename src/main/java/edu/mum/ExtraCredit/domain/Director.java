package edu.mum.ExtraCredit.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class Director extends Person {
	
	private String biography;
	//@ElementCollection
	private List<Movie> directedMovies = new ArrayList<Movie>(); 
}
