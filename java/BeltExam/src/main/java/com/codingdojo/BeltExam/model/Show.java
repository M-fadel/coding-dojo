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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "shows")
public class Show {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 
	 @NotNull(message ="please provide a title")
	 private String title;
	 
	 @NotNull(message ="please provide a Network")
	 @Size(min =2, max = 10,message ="Network must be between 2 and 10" )
	 private String network;
	 
	 @NotNull(message ="please Enter Discription")
	 @Size(min = 3, message = "Discription must be more than 3")
	 private String dis;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name ="user_id")
	 private User user;
	 @OneToMany(mappedBy = "show",fetch = FetchType.LAZY)
	 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getDis() {
		return dis;
	}

	public void setDis(String dis) {
		this.dis = dis;
	}

	public Long getId() {
		return id;
	}

	public Show() {
		
	}

	public Show(@NotNull(message = "please provide a title") String title,
			@NotNull(message = "please provide a Network") @Size(min = 2, max = 10, message = "Network must be between 2 and 10") String network,
			@NotNull(message = "please Enter Discription") @Size(min = 3, message = "Discription must be more than 3") String dis) {
		this.title = title;
		this.network = network;
		this.dis = dis;
	}
	 
}
