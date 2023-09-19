package com.backend.app.termo.models.service;

import java.util.List;

import com.backend.app.termo.models.entity.Termo;

public interface TermoService {
	
	/**
	 * This method returns all the list of Termos.
	 * @return
	 */
	public List<Termo> findAll();
	
	/**
	 * This method returns the Termo asociated with an Id
	 * @param id
	 * @return
	 */
	public Termo findById(Long id);
}
