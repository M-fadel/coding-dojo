package com.codingdojo.DAJ.models;

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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name ="ninjas")
public class Ninjas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	@NotNull
	@Size(min = 3, max = 20)
	private String fName;
	@NotNull
	@Size(min = 3, max = 20)
	private String lName;
	@NotNull
	@Min(value = 18)
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	public Ninjas(@NotNull @Size(min = 3, max = 20) String fName, @NotNull @Size(min = 3, max = 20) String lName,
			Date createdAt, Date updatedAt, Dojos dojo ,int age) {
		
		this.fName = fName;
		this.lName = lName;
		this.age=age;	
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.dojo = dojo;
	}
	public Ninjas() {
		
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Dojos getDojo() {
		return dojo;
	}
	public void setDojo(Dojos dojo) {
		this.dojo = dojo;
	}
	public Long getId() {
		return id;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="dojo_id")
	private Dojos dojo;
	
}
