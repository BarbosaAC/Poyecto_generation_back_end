package com.generation20.proyectofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation20.proyectofinal.molde.User;
import com.generation20.proyectofinal.service.UserService;

@RestController
@RequestMapping("/v1/users")
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@GetMapping
	public List<User> getUsers(){
		return userService.getAll();
	}
	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") Integer id) {
		return userService.getById(id);
	}
	@PostMapping
	public User creatUser(@RequestBody User user) {
		return userService.save(user);
	}
	@PostMapping("/{id}")
	public User updateUser(@PathVariable Integer id, @RequestBody User user) {
		return userService.update(id, user);
	}
}
