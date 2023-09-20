package com.backend.app.termo.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public String deleteById(@PathVariable Long id) {
		service.deleteById(id);
		return "Deleted termo with id: " + id;
	}
	
	@PutMapping("/termo")
	public String putTermo(@RequestBody Termo termo) {
		service.putTermo(termo.getId(), termo.getName(), termo.getMarca());
		return "Modified termo with id: " + termo.getId();
	}
	
	@PostMapping("/termo")
	public String postTermo(@RequestBody Termo termo) {
		service.postTermo(termo.getName(), termo.getMarca());
		return "Posted termo with name: " + termo.getName() + " and brand: " + termo.getMarca();
	}
}
