package com.vitalvibe.services;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitalvibe.models.TablaEjercicios;
import com.vitalvibe.repositories.EjercicioRepositorio;
import com.vitalvibe.repositories.TablaEjercicioRepositorio;

@Service
public class EjercicioService {

	@Autowired
	EjercicioRepositorio ejercicioRepositorio;
	@Autowired
	TablaEjercicioRepositorio tablaEjercicioRepo;

	public List<TablaEjercicios> getRndEjercicio(Long tipoEjercicio) {

		List<TablaEjercicios> tabla = tablaEjercicioRepo.findAll().stream().filter(ejercicio -> {
			return ejercicio.getEjercicio_tipo().getId() == tipoEjercicio;
		}).collect(Collectors.toList());
		// mezclamos las tablas
		Collections.shuffle(tabla);
		// devolvemos las 5 primeras tras el shuffle
		return tabla.stream().limit(5).collect(Collectors.toList());
	}

}
