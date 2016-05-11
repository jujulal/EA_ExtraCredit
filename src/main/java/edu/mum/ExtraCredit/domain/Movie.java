package edu.mum.ExtraCredit.domain;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



public class Movie{
	
	@Id
	@GeneratedValue
	private int movieId;
	private String name;

	@Enumerated(EnumType.STRING)
	private Genre genre;
	private int rating; 
	private int year; 
	
	@ManyToMany
//	@JoinTable(name="Movie_Actor", 
//		joinColumns = @JoinColumn(name="actorId"), 
//		inverseColumns= @JoinColumn(name="movieId")
//			)
	private List<Person> actorsList = new ArrayList<Person>();



	
}
