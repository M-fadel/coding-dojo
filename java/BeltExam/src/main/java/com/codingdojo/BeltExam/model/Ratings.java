package com.codingdojo.BeltExam.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



@Entity
@Table(name ="rating")
public class Ratings {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 @NotNull
	 @Min(value = 1, message = "should be mor btween 1 and 5")
//	 @Max(value = 5, message = "should be mor btween 1 and 5")
	 private int rating;
	 
	 public Ratings(
			@NotNull @Min(value = 1, message = "should be mor btween 1 and 5") @Max(value = 5, message = "should be mor btween 1 and 5") int rating) {
		this.rating = rating;
	}

	 
	public Ratings() {
		
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public Long getId() {
		return id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name ="show_id")
	 private Show show;
	 
	 @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	     name = "userRatings", 
	     joinColumns = @JoinColumn(name = "rate"), 
	     inverseJoinColumns = @JoinColumn(name = "raters"))
	     private List<User> raters;

	public List<User> getRaters() {
		return raters;
	}


	public void setRaters(List<User> raters) {
		this.raters = raters;
	}
}
