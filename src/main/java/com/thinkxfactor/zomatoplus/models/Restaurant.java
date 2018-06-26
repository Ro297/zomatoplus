package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Restaurant")
public class Restaurant implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="restaurant_id")
	private Long id;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "rating")
	private String rating;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "likeCount")
	private String likeCount;
	
	
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(Long id, String city, String name, String address, String rating, String contact,
			String description, String website, String likeCount) {
		super();
		this.id = id;
		this.city = city;
		this.name = name;
		this.address = address;
		this.rating = rating;
		this.contact = contact;
		this.description = description;
		this.website = website;
		this.likeCount = likeCount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(String likeCount) {
		this.likeCount = likeCount;
	}
	
	
}