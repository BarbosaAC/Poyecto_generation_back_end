package com.generation20.proyectofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation20.proyectofinal.molde.UserSport;
import com.generation20.proyectofinal.service.UserSportService;

@RestController
@RequestMapping("/v1/userSport")
public class UserSportController {

	@Autowired
	private UserSportService userSportService;
	
	@GetMapping
	public List<UserSport> getAllUserSport(){
		return userSportService.getAll();
	}
	@GetMapping("/{id}")
	public UserSport getUserSportById(@PathVariable("id") Integer id) {
		return userSportService.getById(id);
	}
}
