package com.generation20.proyectofinal.service;

import java.util.List;

import com.generation20.proyectofinal.molde.Publication;

public interface PublicationService {

	Publication save(Publication publication);
	List<Publication> getAll();
	List<Publication> getAllPublicationsByIdUser(Integer idUser);
	List<Publication> getAllPublicationsByIdSport(Integer idSport);
	List<Publication> getAllPublicationsByIdUserAndIdSport(Integer idUser, Integer idSport);
	List<Publication> update(Integer id);
	Publication getById(Integer id);
}
