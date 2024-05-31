package com.vitalvibe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitalvibe.models.TablaEjercicios;

@Repository
public interface TablaEjercicioRepositorio extends JpaRepository<TablaEjercicios, Long>{

	
}
