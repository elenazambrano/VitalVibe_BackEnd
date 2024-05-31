package com.vitalvibe.mappers;

import com.vitalvibe.dto.EjercicioRutinaDTO;
import com.vitalvibe.models.Ejercicio;
import com.vitalvibe.models.TablaEjercicios;

public class EjercicioRutinaMapper implements Mapper<EjercicioRutinaDTO,TablaEjercicios>{

	@Override
	public EjercicioRutinaDTO map(TablaEjercicios s) {
		Ejercicio e = s.getEjercicio();
		return EjercicioRutinaDTO.builder()
				.nombre_ejercicio(e.getNombre_ejercicio())
				.descripcion(e.getDescripcion())
				.url_imagen(e.getUrl_imagen())
				.series(s.getSeries())
				.repeticiones(s.getRepeticiones())
				.descanso(s.getDescanso())
				.build();
	}

}
