package com.codingdojo.ProjectManager.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "task")
public class Task {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 @NotEmpty
	 private String task;
//	 
//	 @ManyToOne(fetch = FetchType.LAZY)
//		@JoinColumn(name ="Project_id")
//	 private Project project;
//	 
//	 @OneToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name ="User_id")
//	 private User user;
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public String getTask() {
//		return task;
//	}
//
//	public void setTask(String task) {
//		this.task = task;
//	}
//
//	public Project getProject() {
//		return project;
//	}
//
//	public void setProject(Project project) {
//		this.project = project;
//	}
//
//	public Task(@NotEmpty String task, Project project, User user) {
//		this.task = task;
//		this.project = project;
//		this.user = user;
//	}
//
//	public Long getId() {
//		return id;
//	}
	public Task() {
		super();
	}
}
