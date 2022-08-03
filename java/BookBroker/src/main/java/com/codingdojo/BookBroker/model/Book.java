package com.codingdojo.BookBroker.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "book")
public class Book {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 @NotEmpty(message="there is no book without a title!")
	 private String title;
	 public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getThoughts() {
		return thoughts;
	}
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}
	public Long getId() {
		return id;
	}
	@NotEmpty(message="Author Name is required!")
	 private String author;
	@NotEmpty(message="please share your thoughts!")
	 private String thoughts;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="User_id")
	private  User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="Buerb_id")
	private  User bUser;
	
	public Book() {
		
	}
	public User getbUser() {
		return bUser;
	}
	public void setbUser(User bUser) {
		this.bUser = bUser;
	}
	public Book(@NotNull String title, @NotNull String author, @NotNull String thoughts) {
		
		this.title = title;
		this.author = author;
		this.thoughts = thoughts;
		
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	 //boolean if true its borrowed 
}
