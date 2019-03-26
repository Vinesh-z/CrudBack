package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.User;
import com.mindtree.serviceImplementation.UserServiceImplementation;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserServiceImplementation userService;

	@PostMapping(value = "/addNewUser")
	public String addUser(@RequestBody User user) {

		System.out.println("user = " + user);
		String msg = userService.addUser(user);
		return msg;

	}

	@DeleteMapping(value = "/deleteUser/{userId}")
	public int displaySow(@PathVariable int userId) {
		System.out.println(userId);
		userService.deleteUser(userId);
		return 1;
		
		
	}

	@GetMapping(value = "/getUsers")
	public List<User> displayUsers() {
		return userService.getUsers();
	}
	
	@PutMapping(value = "/updateUser")
	public String updateUser(@RequestBody User user) {

		System.out.println("user = " + user);
		return userService.updateUser(user);

	}
	
	@GetMapping(value = "/getUser/{mail}")
	public User getUser(@PathVariable String mail) {
		System.out.println(mail);
		return userService.getUser(mail);
	}
}
