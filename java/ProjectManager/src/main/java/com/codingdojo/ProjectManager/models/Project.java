package com.codingdojo.ProjectManager.models;

import java.util.Date;

import javax.persistence.Column;
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
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "project")
public class Project {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 
	 @NotEmpty(message ="please provide a title")
	 private String title;
	 
	 @NotNull
	 @Size(min = 3, message = " Description must be more than 3 charecters")
	 private String des;
	 
	 
	 @NotNull(message ="please provide a date")
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date dueDate;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name ="user_id")
	 private User user;
	 
	 
	 
//	 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Long getId() {
		return id;
	}

	public Project() {
	}

	public Project(@NotEmpty String title, @NotNull @Size(min = 3) String des, @NotEmpty Date dueDate) {
		this.title = title;
		this.des = des;
		this.dueDate = dueDate;
	}
	 
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	 
}
