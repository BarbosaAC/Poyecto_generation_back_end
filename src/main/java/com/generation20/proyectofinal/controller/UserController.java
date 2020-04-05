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
import com.generation20.proyectofinal.molde.UserSport;
import com.generation20.proyectofinal.service.UserService;
import com.generation20.proyectofinal.service.UserSportService;

@RestController
@RequestMapping("/v1/users")
public class UserController {
	
	@Autowired
	private UserService userService; 
	@Autowired
	private UserSportService userSportService;
	
	@GetMapping("/allUsers")
	public List<User> getUsers(){
		return userService.getAll();
	}
	@GetMapping
	public List<User> getUserVisible(){
		return userService.getVisible();
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
	
	@PostMapping("/userSport")
	public UserSport createRelationUserSport(@RequestBody UserSport userSport) {
		
		if(userSportService.getByIdUserAndIdSport(userSport.getIdUser(), userSport.getIdSport()) == null) {
			return userSportService.save(userSport);
		}else {
			return userSportService.update(userSport);
		}
	}
	@GetMapping("/{id}/sports")
	public List<UserSport> getSportsByIdUser(@PathVariable("id") Integer idUser){
		return userSportService.getSportsByIdUser(idUser);
	}
	@GetMapping("/{id}/allSports")
	public List<UserSport> getAllSportsByIdUser(@PathVariable("id") Integer idUser){
		return userSportService.getAllSportsByIdUser(idUser);
	}
	@PostMapping("/userSport/delete")
	public UserSport deleteUserSport(@RequestBody UserSport userSport) {
		return userSportService.remove(userSport);
	}
	@GetMapping("/{id}/delete")
	public User deleteUser(@PathVariable("id") Integer id) {
		return userService.remove(id);
	}
	
}
