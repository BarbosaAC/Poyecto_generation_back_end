package com.generation20.proyectofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation20.proyectofinal.dao.SportRepository;
import com.generation20.proyectofinal.molde.Sport;

@Service
public class SportServiceImpl implements SportService{

	@Autowired
	private SportRepository sportRepository;
	
	@Override
	public List<Sport> getAll() {
		return sportRepository.findAll();
	}
	@Override
	public Sport getById(Integer id) {
		return sportRepository.findById(id).get();
	}
	@Override
	public Sport remove(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Sport save(Sport sport) {
		return sportRepository.save(sport);
	}
	@Override
	public Sport update(Integer id, Sport sport) {
		// TODO Auto-generated method stub
		return null;
	}
}
