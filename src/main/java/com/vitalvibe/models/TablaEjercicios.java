package com.vitalvibe.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="tablaejercicios")
public class TablaEjercicios {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Long id;
	private int series;
	private int repeticiones;
	private int descanso;

	@ManyToOne
	@JoinColumn(name="ejercicios_tipo_id")
	private Ejercicio_tipo ejercicio_tipo;
	@ManyToOne
	@JoinColumn(name="ejercicio_id")
	private Ejercicio ejercicio;
}
