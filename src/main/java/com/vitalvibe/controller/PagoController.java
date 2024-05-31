package com.vitalvibe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitalvibe.dto.PersonaDTO;
import com.vitalvibe.mappers.PersonaMapper;
import com.vitalvibe.models.Pagos;
import com.vitalvibe.services.PagoService;
@CrossOrigin
@RestController
@RequestMapping("/payments")
public class PagoController {

	@Autowired
    private PagoService pagoService;
	@Autowired
	private PersonaMapper personaMapper;
	
	@PostMapping
    public List<Pagos> getAllPayments(@RequestBody PersonaDTO p) {
        return pagoService.getPaymentsByPersona(personaMapper.map(p));
    }
}
