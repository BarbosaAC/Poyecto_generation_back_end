package com.generation20.proyectofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation20.proyectofinal.molde.Publication;
import com.generation20.proyectofinal.molde.UserSport;
import com.generation20.proyectofinal.service.PublicationService;

@RestController
@RequestMapping("/v1/publications")
public class PublicationController {

	@Autowired
	private PublicationService publicationService;
	
	@GetMapping
	public List<Publication> getAllPublication(){
		return publicationService.getAll();
	}
	@PostMapping
	public Publication createPublication(@RequestBody Publication publication) {
		return publicationService.save(publication);
	}
	@GetMapping("/sport/{idSport}")
	public List<Publication> getAllPublicationByIdSport(@PathVariable("idSport") Integer idSport){
		return publicationService.getAllPublicationsByIdSport(idSport);
	}
	@GetMapping("/user/{idUser}")
	public List<Publication> getAllPublicationsByIdUser(@PathVariable("idUser") Integer idUser){
		return publicationService.getAllPublicationsByIdUser(idUser);
	}
	@PostMapping("/userAndSport")
	public List<Publication> getAllPublicationsByIdUserAndIdSport(@RequestBody UserSport userSport){
		return publicationService.getAllPublicationsByIdUserAndIdSport(userSport.getIdUser(), userSport.getIdSport());
	}
}
