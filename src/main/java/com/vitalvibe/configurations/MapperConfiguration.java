package com.vitalvibe.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vitalvibe.dto.EjercicioRutinaDTO;
import com.vitalvibe.mappers.EjercicioRutinaMapper;
import com.vitalvibe.mappers.PersonaMapper;
import com.vitalvibe.mappers.PersonaResumenMapper;

@Configuration
public class MapperConfiguration {

	@Bean
	public PersonaMapper getDTOtoPersonaMapper() {
		return new PersonaMapper();
	}

	@Bean
	public PersonaResumenMapper getDTOtoPersonaResumenMapper() {
		return new PersonaResumenMapper();
	}
	@Bean
	public EjercicioRutinaMapper getTablatoDTOmapper() {
		return new EjercicioRutinaMapper();
	}
}
