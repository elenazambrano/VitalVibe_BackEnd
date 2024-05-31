package com.vitalvibe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitalvibe.models.Pagos;
import com.vitalvibe.models.Persona;


@Repository
public interface PagoRepositorio extends JpaRepository<Pagos, Long>{

	public List<Pagos> findByPersonaIdPersona(Long idPersona);
	
}
