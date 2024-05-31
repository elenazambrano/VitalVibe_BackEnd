package com.vitalvibe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitalvibe.models.Ejercicio;

@Repository
public interface EjercicioRepositorio extends JpaRepository<Ejercicio, Long> {

	
}
