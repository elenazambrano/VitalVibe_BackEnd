package com.vitalvibe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonaDTO {

	private String nombre;
	private String apellidos;
	private String email;
	private String password;

}
