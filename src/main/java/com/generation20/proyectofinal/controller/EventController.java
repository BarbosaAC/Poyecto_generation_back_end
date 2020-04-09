package com.generation20.proyectofinal.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation20.proyectofinal.molde.Event;
import com.generation20.proyectofinal.service.EventService;

@RestController
@RequestMapping("v1/events")
public class EventController {

	@Autowired
	private EventService eventService;
	
	@PostMapping
	public ResponseEntity<Event> createEvent(@RequestBody Event event){
		return new ResponseEntity<>(eventService.save(event), HttpStatus.CREATED);
	}
	@GetMapping
	public ResponseEntity<List<Event>> getAll(){
		return new ResponseEntity<>(eventService.getAll(), HttpStatus.OK);
	}
	@GetMapping("/user")
	public ResponseEntity<List<Event>> getAllByIdUser(@RequestParam(value = "idUser") Integer idUser){
		return new ResponseEntity<>(eventService.getAllByIdUser(idUser), HttpStatus.OK);
	}
	@GetMapping("/sport")
	public ResponseEntity<List<Event>> getAllByIdSport(@RequestParam(value = "idSport") Integer idSport){
		return new ResponseEntity<>(eventService.getAllByIdSport(idSport), HttpStatus.OK);
	}
	@GetMapping("/")
	public ResponseEntity<List<Event>> getAllByEventDate(
			@RequestParam(value = "date")
			@DateTimeFormat(pattern = "yyyy-MM-dd") Date eventDate){
		return new ResponseEntity<>(eventService.getAllByEventDate(eventDate), HttpStatus.OK);
	}
	@GetMapping("/between/")
	public ResponseEntity<List<Event>> getAllByEventDateBetween(
			@RequestParam(value = "firstDate")
			@DateTimeFormat(pattern = "yyyy-MM-dd") Date firstDate,
			@RequestParam(value = "endDate")
			@DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate){
		return new ResponseEntity<>(eventService.getAllByEventDateBetween(firstDate, endDate), HttpStatus.OK);
	}
	@GetMapping("/by")
	public ResponseEntity<Event> getById(@RequestParam(value = "id") Integer id) {
		return new ResponseEntity<>(eventService.getById(id), HttpStatus.OK);
	}
	@PutMapping
	public ResponseEntity<Event> update(@RequestParam(value = "id") Integer id,
						@RequestBody Event event) {
		return new ResponseEntity<>(eventService.update(id, event), HttpStatus.CREATED);
	}
}