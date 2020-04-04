package com.generation20.proyectofinal.service;

import java.util.List;

import com.generation20.proyectofinal.molde.User;

public interface UserService {

	User save(User user);
	List<User> getAll();
	User getById(Integer id);
	User update(Integer id, User user);
	void remove(Integer id);
}
