package com.generation20.proyectofinal.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.generation20.proyectofinal.dao.EventRepository;
import com.generation20.proyectofinal.dao.SportRepository;
import com.generation20.proyectofinal.dao.UserRepository;
import com.generation20.proyectofinal.molde.Event;
import com.generation20.proyectofinal.molde.Sport;
import com.generation20.proyectofinal.molde.User;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventRepository eventRepository;
	@Autowired 
	private UserRepository userRepository;
	@Autowired
	private SportRepository sportRepository;
	@Autowired
	private StorageService storageService;
	
	@Override
	public List<Event> getAll() {
		return eventRepository.findAll();
	}
	@Override
	public List<Event> getAllByEventDate(Date eventDate) {
		return eventRepository.findByEventDate(eventDate);
	}
	@Override
	public List<Event> getAllByIdSport(Integer idSport) {
		return eventRepository.findByIdSport(idSport);
	}
	@Override
	public List<Event> getAllByIdUser(Integer idUser) {
		return eventRepository.findByIdUser(idUser);
	}
	@Override
	public Event save(Event event, MultipartFile file) {
		User user = userRepository.findById(event.getIdUser()).get();
		Sport sport = sportRepository.findById(event.getIdSport()).get();
		event.setPhoto(storageService.uploadFile(file));
		event.setCreatedAt(new Date());
		event.setNameAuthor(user.getUserName());
		event.setNameSport(sport.getName());
		return eventRepository.save(event);
	}
	@Override
	public Event getById(Integer id) {
		return eventRepository.findById(id).get();
	}
	@Override
	public Event update(Integer id, Event event) {
		Event eventDB = getById(id);
		eventDB.setDescription(event.getDescription());
		eventDB.setEventDate(event.getEventDate());
		eventDB.setEventTime(event.getEventTime());
		eventDB.setLink(event.getLink());
		eventDB.setPhoto(event.getPhoto());
		eventDB.setUbication(event.getUbication());
		return eventRepository.save(eventDB);
	}
	@Override
	public List<Event> getAllByEventDateBetween(Date firstDate, Date endDate) {
		return eventRepository.findByEventDateBetween(firstDate, endDate);
	}
}
