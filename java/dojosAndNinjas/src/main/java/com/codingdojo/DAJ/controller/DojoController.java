package com.codingdojo.DAJ.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.DAJ.models.Dojos;
import com.codingdojo.DAJ.repo.DojoRepo;
import com.codingdojo.DAJ.service.DojosService;

@Controller
public class DojoController {
@Autowired
DojosService serv;
@RequestMapping("/")
	public String createdojo(@ModelAttribute("dojo") Dojos dojo) {
		return "Dojo.jsp";
	}
@RequestMapping("/create")
public String create(@Valid @ModelAttribute("dojo") Dojos dojo,BindingResult result,Model model) {
	if(result.hasErrors()){
		return "Dojo.jsp";
	}
	serv.creatDojo(dojo);
	return "redirect:/";
}
}
