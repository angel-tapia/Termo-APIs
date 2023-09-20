package com.backend.app.termo.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.app.termo.models.dao.TermoDao;
import com.backend.app.termo.models.entity.Termo;


@Service
public class TermoServiceImpl implements TermoService {

	@Autowired
	private TermoDao termoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Termo> findAll() {

		return (List<Termo>) termoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Termo findById(Long id) {

		return termoDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = false)
	public void deleteById(Long id) {
		termoDao.deleteById(id);
	}
	
	@Override
	@Transactional(readOnly = false)
	public void putTermo(Long id, String name, String marca) {
		Termo actual = termoDao.findById(id).orElse(null);
		actual.setName(name);
		actual.setMarca(marca);
		termoDao.save(actual);
		return;
	}
	
	@Override
	@Transactional(readOnly = false)
	public void postTermo(String name, String marca) {
		// Create a new Termo object with the given name and marca
	    Termo newTermo = new Termo();
	    newTermo.setName(name);
	    newTermo.setMarca(marca);

	    // Save the new Termo object to the database using the termoDao
	    Termo savedTermo = termoDao.save(newTermo);
	}
	

}
