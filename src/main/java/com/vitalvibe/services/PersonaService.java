package com.vitalvibe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitalvibe.models.Persona;
import com.vitalvibe.repositories.PersonaRepositorio;

@Service
public class PersonaService {

	@Autowired
	PersonaRepositorio personaRepositorio;

	public Persona add(Persona p) {
		if (!this.ifExist(p)) {
			return this.personaRepositorio.save(p);

		}
		return null;
	}

	public Persona isLogged(String email, String password) {
		Persona p = personaRepositorio.findByEmail(email);
		if (p != null && p.getPassword().equals(password)) {
			return p;
		}
		return null;
	}

	public boolean ifExist(Persona p) {
		return this.personaRepositorio.findByEmail(p.getEmail()) != null;
	}

}
