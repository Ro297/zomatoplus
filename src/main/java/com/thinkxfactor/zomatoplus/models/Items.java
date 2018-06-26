package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

public class Items implements Serializable  {
	private String dish;
	private int price;
	
	public Items() {
		
	}	
	
	public Items(String dish, int price) {
		this.dish = dish;
		this.price = price;
		}
	

	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}