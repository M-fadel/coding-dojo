package com.codingdojo.DAJ.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="dojos")
public class Dojos {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@NotNull
@Size(min = 3, max = 20)
private String name;
@Column(updatable=false)
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date createdAt;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date updatedAt;
@OneToMany(fetch = FetchType.LAZY)
@JoinColumn(name ="ninja_id")
private List <Ninjas> ninja;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public List<Ninjas> getNinja() {
	return ninja;
}
public void setNinja(Ninjas ninja) {
	this.ninja.add(ninja);
}
public Long getId() {
	return id;
}
public Dojos(@NotNull @Size(min = 3, max = 20) String name, Date createdAt, Date updatedAt, Ninjas ninja) {
	this.name = name;
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
}
public Dojos() {
	
}

}
