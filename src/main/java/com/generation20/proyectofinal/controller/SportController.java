package com.generation20.proyectofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation20.proyectofinal.molde.Sport;
import com.generation20.proyectofinal.molde.UserSport;
import com.generation20.proyectofinal.service.SportService;
import com.generation20.proyectofinal.service.UserSportService;

@RestController
@RequestMapping("/v1/sports")
public class SportController {

	@Autowired
	private SportService sportService;
	@Autowired
	private UserSportService userSportService;
	
	@GetMapping
	public List<Sport> getSports(){
		return sportService.getAll();
	}
	@GetMapping("/{id}")
	public Sport getSportById(@PathVariable ("id") Integer id) {
		return sportService.getById(id);
	}
	@PostMapping
	public Sport createSport(@RequestBody Sport sport) {
		return sportService.save(sport);
	}
	@GetMapping("/{id}/users")
	public List<UserSport> getUsersByIdSport(@PathVariable("id") Integer idSport){
		return userSportService.getUsersByIdSport(idSport);
	}
}
