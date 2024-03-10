package com.tut;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	
	@Column(length = 70, name="STREET")
	private String street;
	
	private String city;
	
	
	private boolean isOpen;
	
	@Transient
	private double notSave;
	
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	@Lob
	private byte[] img;
	
	//default constructor
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int addressId, String street, String city, boolean isOpen, double notSave, Date addDate,
			byte[] img) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.notSave = notSave;
		this.addDate = addDate;
		this.img = img;
	}
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getNotSave() {
		return notSave;
	}
	public void setNotSave(double notSave) {
		this.notSave = notSave;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", notSave=" + notSave + ", addDate=" + addDate + ", img=" + Arrays.toString(img) + "]";
	}
	
	
	
	
	

}
