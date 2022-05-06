package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.publisher.UserEventPublisher;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserEventPublisher userPublisher;
	@GetMapping("/{name}/{type}")
	public User userPublisher(@PathVariable("name") String name, @PathVariable("type") boolean type ) {
		User user = new User();
		user.setName(name);
		user.setAdmin(type);
		user.setStatus("Active");
		userPublisher.userPublisher(user);
		return user;
	}
}
