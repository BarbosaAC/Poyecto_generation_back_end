package com.generation20.proyectofinal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation20.proyectofinal.molde.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
