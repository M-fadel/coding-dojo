package com.codingdojo.PokeBook.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="expense")
public class Expense {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull
	    @Size(min = 5, max = 100 ,message="Expence must be at least 5 characters.")
	    private String EName;
	    @NotNull
	    @Size(min = 5, max = 100 ,message="Vendor must be at least 5 characters.")
	    private String Vendore;
	    @NotNull
	    @Size(min = 3, max = 255,message="Description must be at least 3 characters.")
	    private String Des;
	    @NotNull
	    @Min(value=10,message="price must be at least 10.")
	    private double Amount;
	    // This will not allow the createdAt column to be updated after creation
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Long getId() {
			return id;
		}
	
		public String getEName() {
			return EName;
		}
		public void setEName(String eName) {
			EName = eName;
		}
		public String getVendore() {
			return Vendore;
		}
		public void setVendore(String vendore) {
			Vendore = vendore;
		}
		public String getDes() {
			return Des;
		}
		public void setDes(String des) {
			Des = des;
		}
		public double getAmount() {
			return Amount;
		}
		public void setAmount(double amount) {
			Amount = amount;
		}
		public Expense() {
			
		}
		public Expense( @NotNull @Size(min = 5, max = 100) String eName,
				@NotNull @Size(min = 5, max = 100) String vendore, @NotNull @Size(min = 3, max = 255) String des,
				@NotNull @Min(10) double amount) {
			
			EName = eName;
			Vendore = vendore;
			Des = des;
			Amount = amount;
		}
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	
}
