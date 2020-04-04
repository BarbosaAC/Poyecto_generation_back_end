package com.generation20.proyectofinal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation20.proyectofinal.molde.Sport;

@Repository
public interface SportRepository extends JpaRepository<Sport, Integer>{

}
