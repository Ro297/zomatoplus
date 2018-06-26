package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Items implements Serializable  {
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private Long id;
	
	@Column(name = "restaurant_id")
	private String restaurantId;
	
	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private String price;

	@Column(name = "description")
	private String description;
	
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(Long id, String restaurantId, String name, String price, String description) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}