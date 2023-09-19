package com.backend.app.termo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.backend.app.termo.models.entity.Termo;

public interface TermoDao extends CrudRepository<Termo, Long>{

}
