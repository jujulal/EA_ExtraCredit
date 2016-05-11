package edu.mum.ExtraCredit.domain;

import java.util.List;
import javax.persistence.Entity;

@Entity
public class Artist extends Person {
	private String biography;
	private String role; 
	private List<Movie> workedMovieList; 
}
