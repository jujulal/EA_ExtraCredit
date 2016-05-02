package edu.mum.ExtraCredit.domain;



import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Person {
	@Id @GeneratedValue
	private int Id;
	private String name; 

	private Date dateOfBirth;
	private String placeOfBirth;
	private String biography;
	

	public Person(){}
	
	
	
}
