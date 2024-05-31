package com.vitalvibe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class EjercicioRutinaDTO {

	private String nombre_ejercicio;
	private String descripcion;
	private String url_imagen;
	private int series;
	private int repeticiones;
	private int descanso;
}
