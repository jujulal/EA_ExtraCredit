package edu.mum.ExtraCredit.domain;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.mum.ExtraCredit.domain.*;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Entity;
import javax.persistence.ManyToMany;


@Entity
public class Person {
	@Id @GeneratedValue
	private int actorId;
	private String name; 
	@Column(name="nameOfCharacter")
	private String character;
	private Date dateOfBirth;
	private String placeOfBirth;
	private String biography;
	

	public Person(){}
	
	
	
}
