package com.codingdojo.ProjectManager.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.ProjectManager.models.Project;
import com.codingdojo.ProjectManager.service.ProjectService;
import com.codingdojo.ProjectManager.service.UserService;

import net.bytebuddy.asm.Advice.Return;

@Controller
public class ProjectController {
@Autowired
ProjectService pService;
@Autowired
UserService uService;

@GetMapping("/new/project")
public String CreateProject(@ModelAttribute("Project")Project project){
	return"createProject.jsp";
}
@PostMapping("/create")
public String creat(@Valid @ModelAttribute("Project")Project project, BindingResult result,HttpSession session) {
	project.setUser(uService.findById((Long)session.getAttribute("user_id")));
	pService.creat(project,result,uService.findById((Long)session.getAttribute("user_id")));
	if(result.hasErrors()) {
		return"createProject.jsp";
	}
	
	return"redirect:/home";
}
@GetMapping("/edit/{id}")
public String edit(@PathVariable("id")Long id ,@ModelAttribute("Project") Project p,Model model) {
	pService.findProject(id);
	model.addAttribute("Project",pService.findProject(id));
	return"updateProject.jsp";
}
@PostMapping("/edit/{id}")
public String update(@Valid@ModelAttribute("Project") Project p,BindingResult result,@PathVariable("id")Long id) {
	pService.update(p, id, result);
	if(result.hasErrors()) {
		return"updateProject.jsp";
	}
	return "redirect:/home";
}
@GetMapping("/Project/{id}")
public String show(Model model,@PathVariable("id")Long id) {
	model.addAttribute("p",pService.findProject(id));
	return"show.jsp";
}
@GetMapping("/join/{id}")
public String join(@PathVariable("id") Long id,HttpSession session){
	
	
	pService.join(pService.findProject(id),uService.findById((Long)session.getAttribute("user_id")));
	
	return "redirect:/home";
}
@GetMapping("/leave/{id}")
public String leave(@PathVariable("id")Long id,HttpSession session) {
	
	pService.leave(uService.findById((Long)session.getAttribute("user_id")), id);
	return "redirect:/home";
}
}
