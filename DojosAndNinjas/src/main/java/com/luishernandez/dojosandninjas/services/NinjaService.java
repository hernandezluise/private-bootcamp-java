package com.luishernandez.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.luishernandez.dojosandninjas.models.Dojos;
import com.luishernandez.dojosandninjas.models.Ninja;
import com.luishernandez.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public List<Ninja> getNinjas(){
		return ninjaRepository.findAll();
	}
	
	public Ninja creatNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	public Ninja findNinja(Long id) {
		Optional<Ninja> resultOptional = ninjaRepository.findById(id);
		if(resultOptional.isPresent()) {
			return resultOptional.get();
		} else {
			return null;
		}
	}
	
	public List<Ninja> perDojo(Dojos dojos){
		return ninjaRepository.findAllByDojos(dojos);
	}
}
