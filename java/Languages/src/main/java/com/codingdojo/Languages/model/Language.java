package com.codingdojo.Languages.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "lang")
public class Language {
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	@Size(min = 3,max = 20)
	private String name;
	@NotNull
	@Size(min= 3,max = 30)
	private String creator;
	@NotNull
	@Min(value = 1)
	private double ver;
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public double getVer() {
		return ver;
	}
	public void setVer(double ver) {
		this.ver = ver;
	}
	public Language(Long id,String name,String creator, double ver) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.ver = ver;
	}
	public Language() {
	}
	
	
}
