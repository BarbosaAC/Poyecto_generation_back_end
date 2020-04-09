package com.generation20.proyectofinal.service;

import java.util.Date;
import java.util.List;

import com.generation20.proyectofinal.molde.Event;

public interface EventService {

	Event save(Event event);
	Event update(Integer id, Event event);
	List<Event> getAll();
	Event getById(Integer id);
	List<Event> getAllByIdUser(Integer idUser);
	List<Event> getAllByIdSport(Integer idSport);
	List<Event> getAllByEventDate(Date eventDate);
	List<Event> getAllByEventDateBetween(Date firstDate, Date endDate);
}