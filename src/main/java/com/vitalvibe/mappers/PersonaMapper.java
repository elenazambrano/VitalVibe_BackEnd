package com.vitalvibe.mappers;

import com.vitalvibe.dto.PersonaDTO;
import com.vitalvibe.models.Persona;

public class PersonaMapper implements Mapper<Persona, PersonaDTO> {

	@Override
	public Persona map(PersonaDTO persona) {
		return new Persona(persona.getNombre(), persona.getApellidos(), persona.getEmail(), persona.getPassword());
	}

	
}
