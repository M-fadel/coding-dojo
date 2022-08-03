package com.codingdojo.ProjectManager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.ProjectManager.models.Project;
import com.codingdojo.ProjectManager.service.ProjectService;

import net.bytebuddy.asm.Advice.Return;

@Controller
public class ProjectController {
@Autowired
ProjectService pService;

@GetMapping("/new/project")
public String CreateProject(@ModelAttribute("Project")Project project){
	return"createProject.jsp";
}
@PostMapping("/create")
public String creat(@Valid @ModelAttribute("Project")Project project, BindingResult result) {
	if(result.hasErrors()) {
		return"createProject.jsp";
	}
	pService.creat(project);
	return"redirect:/home";
}
}
