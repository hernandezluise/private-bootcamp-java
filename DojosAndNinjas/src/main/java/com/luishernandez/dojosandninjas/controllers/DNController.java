package com.luishernandez.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.luishernandez.dojosandninjas.models.Dojos;
import com.luishernandez.dojosandninjas.models.Ninja;

import com.luishernandez.dojosandninjas.services.DojoService;
import com.luishernandez.dojosandninjas.services.NinjaService;

import jakarta.validation.Valid;


@Controller
public class DNController {
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojos dojos) {
		return "newDojo.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("ninja", ninjaService.creatNinja(ninja));
		model.addAttribute("dojos", dojoService.getAll());
		return "newNinja.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String displayDojos(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojos", dojoService.find(id));
		return "displayDojo.jsp";
	}
	
	@PostMapping("/dojos")
	public String newDojoPost(@ModelAttribute("dojo") Dojos dojos) {
		Dojos createDojos = dojoService.create(dojos);
		return "redirect:/dojos/" + createDojos.getId();
	}
	
	@PostMapping("/ninjas")
	public String newNinjaPost(@ModelAttribute("ninja") Ninja ninja) {
		ninja = ninjaService.creatNinja(ninja);
		return "redirect:/dojos/" + ninja.getDojos().getId();
	}
}
