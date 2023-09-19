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

}
