package com.codingdojo.javaexam.controller;

import java.util.Date;

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

import com.codingdojo.javaexam.model.Note;
import com.codingdojo.javaexam.model.User;
import com.codingdojo.javaexam.model.house;
import com.codingdojo.javaexam.service.HouseService;
import com.codingdojo.javaexam.service.NoteService;
import com.codingdojo.javaexam.service.UserService;

@Controller
public class controller {
@Autowired
HouseService hService;
@Autowired
UserService uService;
@Autowired
NoteService nService;
@GetMapping("/listting/new")
public String addListing(@ModelAttribute("house")house h,HttpSession session) {
	if(session.getAttribute("user_id")!=null) {
		
		return"create.jsp";
	}else {
		return"redirect:/";
	}
}
@PostMapping("/create")
public String create(@Valid@ModelAttribute("house") house h,BindingResult result,HttpSession session) {
	if(result.hasErrors()) {
		return"create.jsp";
	}
	System.out.println("sdsadads");
	hService.create(h, uService.findById((Long)session.getAttribute("user_id")));
	
	return"redirect:/home";
}
@GetMapping("/listings/{id}")
public String view(@PathVariable("id")Long id, Model model,HttpSession session,@ModelAttribute("Note") Note note) {
	if(session.getAttribute("user_id")!=null) {
	house h =hService.findHouse(id);
	model.addAttribute("h",h);
	model.addAttribute("u", session.getAttribute("user_id"));
	model.addAttribute("n",nService.findAllbyhouse(h));
	return"info.jsp";
	}else {
		return"redirect:/";
	}
}
@GetMapping("/listings/{id}/edit") 
public String edit(@ModelAttribute("house") house house,Model model,@PathVariable("id") Long id,HttpSession session) {
if(session.getAttribute("user_id")!=null) {
house h =hService.findHouse(id);
model.addAttribute("house",h);
model.addAttribute("h",h);
return"update.jsp";
}else {
	return"redirect:/";
}
}
@PostMapping("/{id}/edit")
public String update(@Valid @ModelAttribute("house") house house,BindingResult result,Model model,@PathVariable("id")Long id ) {
	house h =hService.findHouse(id);
	model.addAttribute("h",h);
	if(result.hasErrors()) {
		return"update.jsp";
	}
	hService.update(house, id,result);
	return"redirect:/home";

}
@PostMapping("/join/{id}")
public String join(@Valid@ModelAttribute("Note")Note note,BindingResult result
		,@PathVariable("id")Long id,HttpSession session ,Model model) {
	house h =hService.findHouse(id);
	model.addAttribute("h",h);
	if(result.hasErrors()) {
		
		return "info.jsp";
	}else {
		User u =uService.findById((Long)session.getAttribute("user_id"));
		note.setUser(u);
		note.setHouse(h);
		nService.add(note);
		return"redirect:/home";
	}
}
@GetMapping("delete/{id}")
public String delete(@PathVariable("id") Long id) {
	hService.delete(id);
	return"redirect:/home";
}
}
