package com.tut;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String city;
	
	private Certificate carti;
	
	
	
	
	//constructor using fields
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	//default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	
	
	public Certificate getCarti() {
		return carti;
	}

	public void setCarti(Certificate carti) {
		this.carti = carti;
	}

	@Override
	public String toString() {
		return "Student [id=" + this.id + ", name=" + this.name + ", city=" + this.city + "]";
	}
	

}
