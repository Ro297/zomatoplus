package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;


@RestController
@RequestMapping("/user")
public class UserController {

	

	@GetMapping("/login")
	public User userLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}
	@GetMapping("/all")
	public List<User> userList() {
		List<User> users = new ArrayList<>();
		User usr1, usr2, usr3;
		usr1= new User("Rohan","11111");
		usr2= new User("Rachit","22222");
		usr3= new User("Ritu","33333");
		users.add(usr1);
		users.add(usr2);
		users.add(usr3);
		return users;
	}
	@PostMapping("/create")
	public User userCreate(@RequestBody User user) {
		System.out.println(user.toString());
		return user;
	}

}

