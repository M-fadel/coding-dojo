package com.codingdojo.javaexam.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "notes")
public class Note {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 @NotEmpty(message ="note is empty")
	 private String note;
	 
	  @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="house_id")
	    private house house;
	    
	    public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public house getHouse() {
		return house;
	}

	public void setHouse(house house) {
		this.house = house;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

		@ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="user_id")
	    private User user;

		public Note() {
			super();
		}
}
