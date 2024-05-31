package com.vitalvibe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitalvibe.models.Pagos;
import com.vitalvibe.models.Persona;
import com.vitalvibe.repositories.PagoRepositorio;
import com.vitalvibe.repositories.PersonaRepositorio;

@Service
public class PagoService {

	@Autowired
	PagoRepositorio pagoRepositorio;
	@Autowired
	PersonaRepositorio personaRepositorio;
	
	public List<Pagos> getAllPayments() {
        return pagoRepositorio.findAll();
    }
	
	public List<Pagos> getPaymentsByPersona(Persona p){
		return pagoRepositorio.findByPersonaIdPersona(personaRepositorio.findByEmail(p.getEmail()).getIdPersona());
	}
}
