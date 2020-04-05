package com.generation20.proyectofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation20.proyectofinal.dao.PublicationRepository;
import com.generation20.proyectofinal.molde.Publication;

@Service
public class PublicationServiceImpl implements PublicationService{

	@Autowired
	private PublicationRepository publicationRepository;
	
	@Override
	public List<Publication> getAll() {
		return publicationRepository.findAll();
	}
	@Override
	public List<Publication> getAllPublicationsByIdSport(Integer idSport) {
		return publicationRepository.findAllByIdSport(idSport);
	}
	@Override
	public List<Publication> getAllPublicationsByIdUser(Integer idUser) {
		return publicationRepository.findAllByIdUser(idUser);
	}
	@Override
	public List<Publication> getAllPublicationsByIdUserAndIdSport(Integer idUser, Integer idSport) {
		return publicationRepository.findAllByIdUserAndIdSport(idUser, idSport);
	}
	@Override
	public Publication save(Publication publication) {
		return publicationRepository.save(publication);
	}
	@Override
	public List<Publication> update(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Publication getById(Integer id) {
		return publicationRepository.findById(id).get();
	}
}
