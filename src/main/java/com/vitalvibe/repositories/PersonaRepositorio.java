package com.vitalvibe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitalvibe.models.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long>{

	Persona findByEmail(String email);
	
}
