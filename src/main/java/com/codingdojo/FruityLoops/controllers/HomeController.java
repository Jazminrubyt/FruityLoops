package com.codingdojo.FruityLoops.controllers;



import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.FruityLoops.models.Fruits;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String index(Model model) {
		ArrayList<Fruits> FruitsArrayList = new ArrayList<>();	
		FruitsArrayList.add(new Fruits("Mango", 4.5));
		FruitsArrayList.add(new Fruits("Watermelon", 5.0));
		FruitsArrayList.add(new Fruits("Pineapple", 2.5));
		FruitsArrayList.add(new Fruits("Grapes", 3.5));
		
		model.addAttribute("Fruits", FruitsArrayList);
		return "index.jsp";
	}
	
	
	
}
