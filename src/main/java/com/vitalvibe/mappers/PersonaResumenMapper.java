package com.vitalvibe.mappers;

import com.vitalvibe.dto.PersonaDTOResumen;
import com.vitalvibe.models.Persona;

public class PersonaResumenMapper implements Mapper<PersonaDTOResumen, Persona> {

	@Override
	public PersonaDTOResumen map(Persona p) {
		return new PersonaDTOResumen(p.getNombre(), p.getApellido(), p.getEmail());
	}

}
