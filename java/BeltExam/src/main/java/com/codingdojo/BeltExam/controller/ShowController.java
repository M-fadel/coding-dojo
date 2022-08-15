package com.codingdojo.BeltExam.controller;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.BeltExam.model.Show;
import com.codingdojo.BeltExam.model.User;
import com.codingdojo.BeltExam.service.ShowService;
import com.codingdojo.BeltExam.service.UserService;
import com.codingdojo.BeltExam.model.Ratings;
import com.codingdojo.BeltExam.service.RatingsService;

@Controller
public class ShowController {
	@Autowired
	ShowService sService;
	@Autowired
	UserService uService;
	@Autowired 
	RatingsService rService;
	@RequestMapping("/Shows/new")
	public String add(@ModelAttribute("Show") Show show) {
		
		return "show.jsp";
	}
	@PostMapping("/create")
	public String create(@Valid@ModelAttribute("Show") Show show,BindingResult result,HttpSession session) {
		User u = uService.findById((Long)session.getAttribute("user_id")); 
		show.setUser(u);
		sService.create(show ,result);
		if(result.hasErrors()) {
			return"show.jsp";
		}
		return"redirect:/shows";
	}
	@GetMapping("/shows/{id}")
	public String details(@PathVariable("id") Long id,HttpSession session , Model model ,@ModelAttribute("Ratings") Ratings rate ) {
	Show s =sService.findShow(id);	
	model.addAttribute("r", rService.findallrates());
	model.addAttribute("s", s);
	return "showInfo.jsp";
	}
	@GetMapping("/edit/{id}")
	public String edit(@ModelAttribute("Show") Show show,Model model,@PathVariable("id") Long id) {
		Show s = sService.findShow(id);
		model.addAttribute("Show",s);
		return "edit.jsp";
	}
	@PostMapping	("/shows/{id}/edit")
	public String update(@Valid@ModelAttribute("Show") Show show,BindingResult result,@PathVariable("id")Long id) {
		sService.update(show, id,result);
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		return"redirect:/shows";
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id")Long id) {
		sService.delete(id);
		return "redirect:/shows";
	}
	@RequestMapping("rate/{id}")
	public String rate( @ModelAttribute("Ratings") Ratings rate,BindingResult result,Model model,@PathVariable Long id,HttpSession session) {
		if (result.hasErrors()) {
			
			return "showInfo.jsp";
		}
		Show s =sService.findShow(id);
		User u =uService.findById((Long)session.getAttribute("user_id"));
		model.addAttribute("s", s);
		model.addAttribute("rate",rService.findallrates());
		rate.setShow(s);
		rService.create(rate,u);
		
		
//		System.out.println((Long)session.getAttribute("user_id"));
		
		return"redirect:/shows";
	}
}
