package com.luishernandez.omikujiform.controller;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}

	@GetMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}

	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String result = (String) session.getAttribute("omikujiFilled");
		model.addAttribute("result", result);
		return "omikuji.jsp";
	}

	@PostMapping("/processForm")
	public String process(@RequestParam("number") int number, @RequestParam("cityName") String cityName,
			@RequestParam("personName") String personName, @RequestParam("professionalHobby") String professionalHobby,
			@RequestParam("livingThing") String livingThing, @RequestParam("message") String message,
			HttpSession session) {
		String omikujiFilled = String.format("In %s years, you will live in %s with %s as your roomate, %s for a living. The next time you see a %s, you will have good luck. Also %s", number, cityName, personName, professionalHobby, livingThing, message);
		
		session.setAttribute("omikujiFilled", omikujiFilled);
		
		return "redirect:/omikuji/show";
	}

}
