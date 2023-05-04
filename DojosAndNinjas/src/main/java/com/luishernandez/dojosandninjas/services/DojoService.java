package com.luishernandez.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.luishernandez.dojosandninjas.models.Dojos;
import com.luishernandez.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public List<Dojos> getAll(){
		return dojoRepository.findAll();
	}
	
	public Dojos create(Dojos dojos) {
		return dojoRepository.save(dojos);
		
	}
	
	public Dojos find(Long id) {
		Optional<Dojos> resultOptional = dojoRepository.findById(id);
		if(resultOptional.isPresent()) {
			return resultOptional.get();
			
		} else {
			return null;
		}
	}
}
