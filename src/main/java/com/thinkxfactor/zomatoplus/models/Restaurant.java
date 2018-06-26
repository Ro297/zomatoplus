package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;

public class Restaurant implements Serializable{
	
	private String name;
	private String address;
	private int rating;
	private String contact;
	
	public Restaurant() {
		
	}
	
	public Restaurant(String name, String address, int rating, String contact) {
		this.name = name;
		this.address = address;
		this.rating = rating;
		this.contact = contact;
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	


}
