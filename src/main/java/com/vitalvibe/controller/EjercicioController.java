package com.vitalvibe.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vitalvibe.dto.EjercicioRutinaDTO;
import com.vitalvibe.mappers.EjercicioRutinaMapper;
import com.vitalvibe.services.EjercicioService;

@CrossOrigin
@RestController
@RequestMapping("/ejercicios")
public class EjercicioController {

	@Autowired
	EjercicioService ejercicioService;
	@Autowired
	EjercicioRutinaMapper ejercicioRutinaMapper;
	
	@PostMapping
	public List<EjercicioRutinaDTO> getEjercicioRandom(@RequestParam Long tipoEjercicio) {
		return ejercicioService.getRndEjercicio(tipoEjercicio).stream()
				.map(t -> ejercicioRutinaMapper.map(t))
				.collect(Collectors.toList());
		
    } 
}
