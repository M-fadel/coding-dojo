package com.codingdojo.ProjectManager.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
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


	 
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}



	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    public Project(@NotEmpty(message = "please provide a title") String title,
			@NotNull @Size(min = 3, message = " Description must be more than 3 charecters") String des,
			@NotNull(message = "please provide a date") Date dueDate, Date createdAt) {
		this.title = title;
		this.des = des;
		this.dueDate = dueDate;
	}



	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	  @PrePersist
	    protected void onCreate() {
	        this.createdAt = new Date();
	    }

	    @PreUpdate
	    protected void onUpdate() {
	        this.updatedAt = new Date();
	    }
	    @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	     name = "Project_managers", 
	     joinColumns = @JoinColumn(name = "projects"), 
	     inverseJoinColumns = @JoinColumn(name = "team"))
	     private List<User> team;



		public List<User> getTeam() {
			return team;
		}

		public void setTeam(List<User> team) {
			this.team = team;
		}
}
