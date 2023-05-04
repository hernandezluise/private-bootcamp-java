package com.luishernandez.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.luishernandez.dojosandninjas.models.Dojos;

public interface DojoRepository extends CrudRepository<Dojos, Long> {
	
	List<Dojos> findAll();
}
