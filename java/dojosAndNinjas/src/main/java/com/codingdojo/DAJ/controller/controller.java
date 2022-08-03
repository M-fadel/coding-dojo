package com.codingdojo.DAJ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.DAJ.models.Dojos;
import com.codingdojo.DAJ.models.Ninjas;
import com.codingdojo.DAJ.service.DojosService;
import com.codingdojo.DAJ.service.NinjasService;

@Controller
public class controller {
	@Autowired
NinjasService ninjasService;
DojosService dojosService;



	public controller(NinjasService ninjasService, DojosService dojosService) {
	this.ninjasService = ninjasService;
	this.dojosService = dojosService;
}



	@RequestMapping("/dojos/{num}")
	public String display(@PathVariable("num") Long id,Model model) {
		Dojos dojos = dojosService.findById(id);
		List<Ninjas> nin= ninjasService.findByDojo(id);
		model.addAttribute("dojo",dojos);
		model.addAttribute("n",nin);
		return"index.jsp";
	}
}
