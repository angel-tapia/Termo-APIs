package com.backend.app.termo.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.app.termo.models.service.TermoService;
import com.backend.app.termo.models.entity.Termo;

@RestController
public class TermoController {

	@Autowired
	private TermoService service;
	
	@GetMapping("/list")
	public List<Termo> list(){
		return service.findAll();
	};
	
	@GetMapping("/termo/{id}")
	public Termo detail(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@DeleteMapping("/termo/{id}")
	public Termo detailD(@PathVariable Long id) {
		return service.findById(id);
	}
}
