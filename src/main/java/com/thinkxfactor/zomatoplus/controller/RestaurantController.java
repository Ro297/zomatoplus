package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;


@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

		@GetMapping("/getall")
		public List<Restaurant> RestaurantList() {
			List<Restaurant> res = new ArrayList<>();
			Restaurant r1, r2, r3;
			r1= new Restaurant("Subway","5A Merlin Links",5,"999900");
			r2= new Restaurant("McDonalds","AJC Bose Road",4,"555566666");
			res.add(r1);
			res.add(r2);
			return res;
		}
		@PostMapping("/create")
		public Restaurant restaurantCreate(@RequestBody Restaurant restaurant) {
			System.out.println(restaurant.toString());
			return restaurant;
		}
		@PostMapping("/addItems")
		public Items AddItem(@RequestBody Items item) {
			Items item1 = new Items();
			item1.setDish(item.getDish());
			item1.setPrice(item.getPrice());
			return item1;
		}
	

}