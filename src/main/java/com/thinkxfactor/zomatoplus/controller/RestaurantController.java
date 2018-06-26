package com.thinkxfactor.zomatoplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repo.ItemRepository;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;


@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
		@Autowired
		private RestaurantRepository repo;
		@Autowired
		private ItemRepository irepo;
		
		@PostMapping("/create")
		public Restaurant restaurantCreate(@RequestBody Restaurant restaurant) {
			repo.saveAndFlush(restaurant);
			System.out.println(restaurant.toString());
			return restaurant;

		}
		@GetMapping("/getall")
		public List<Restaurant> restaurantList() {
			return repo.findAll();

		}
		@PostMapping("/addItems")
		public Items AddItem(@RequestBody Items item) {
			irepo.saveAndFlush(item);
			return item;
		}
	

}