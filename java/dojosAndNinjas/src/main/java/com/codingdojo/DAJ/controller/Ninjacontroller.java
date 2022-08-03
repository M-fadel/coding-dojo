package com.codingdojo.DAJ.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.DAJ.models.Dojos;
import com.codingdojo.DAJ.models.Ninjas;
import com.codingdojo.DAJ.service.DojosService;
import com.codingdojo.DAJ.service.NinjasService;

@Controller
public class Ninjacontroller {
@Autowired
NinjasService service;
DojosService DService;


public Ninjacontroller(NinjasService service, DojosService dService) {
	this.service = service;
	DService = dService;
}


@GetMapping("/ninja")
public String ninja(@ModelAttribute("ninja") Ninjas ninja , Model model) {
	List<Dojos> dojo =DService.findAlDojosl();
	model.addAttribute("dojo",dojo);
	return "Ninja.jsp";
	
}
@RequestMapping(value="/ninjas/create",method=RequestMethod.POST)
public String create(@Valid@ModelAttribute("ninja") Ninjas ninja,BindingResult result) {
	if(result.hasErrors()) {
		System.out.println("sdas");
		return"Ninja.jsp";
	}else {
		service.creatNinja(ninja);
	return"redirect:/ninja";}
}
}
