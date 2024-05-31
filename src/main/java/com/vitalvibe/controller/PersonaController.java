package com.vitalvibe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vitalvibe.dto.PersonaDTO;
import com.vitalvibe.mappers.PersonaMapper;
import com.vitalvibe.mappers.PersonaResumenMapper;
import com.vitalvibe.models.Persona;
import com.vitalvibe.services.PersonaService;

@CrossOrigin

@RequestMapping("/api")
@RestController
public class PersonaController {

	@Autowired
	PersonaService personaService;
	@Autowired
	PersonaMapper personaMapper;
	@Autowired
	PersonaResumenMapper personaResumenMapper;

	@PostMapping("register")
	public ResponseEntity<?> registrarPersona(@RequestBody PersonaDTO p) {
		System.out.println(p);
		Persona persona = personaMapper.map(p);
		if (personaService.add(persona) != null) {
			return ResponseEntity.ok(personaMapper.map(p));
		}
		return new ResponseEntity<>("Error de registro", HttpStatus.NOT_FOUND);
	}

	@PostMapping("login")
	public ResponseEntity<?> login(@RequestParam String email, @RequestParam String password) {
		Persona p = personaService.isLogged(email, password);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email o contraseña incorrectos");
	}
}
