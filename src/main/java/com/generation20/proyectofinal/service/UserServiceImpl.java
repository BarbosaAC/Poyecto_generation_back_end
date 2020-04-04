package com.generation20.proyectofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation20.proyectofinal.dao.UserRepository;
import com.generation20.proyectofinal.molde.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}
	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User getById(Integer id) {
		return userRepository.findById(id).get();
	}
	@Override
	public User save(User user) {
		return userRepository.save(user);
	}
	@Override
	public User update(Integer id, User user) {
		User userDB = getById(id);
		userDB.setName(user.getName());
		userDB.setLastName(user.getLastName());
		userDB.setUserName(user.getUserName());
		userDB.setEmail(user.getEmail());
		userDB.setPassword(user.getPassword());
		userDB.setDescription(user.getDescription());
		userDB.setProfilePic(user.getProfilePic());
		return userRepository.save(userDB);
	}
}
