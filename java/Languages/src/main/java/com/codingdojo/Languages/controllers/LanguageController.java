package com.codingdojo.Languages.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.Languages.model.Language;
import com.codingdojo.Languages.service.LangService;

@Controller
public class LanguageController {
	@Autowired
	LangService serv;

@RequestMapping("/languages")
public String index(@ModelAttribute("L") Language Language,BindingResult result, Model model ) {
	List<Language> lang = serv.allLang();
	model.addAttribute("lang",lang);
	return"index.jsp";
}
@RequestMapping(value ="/languages",method =RequestMethod.POST)
public String create(@Valid @ModelAttribute("L") Language language,BindingResult result) {
	System.out.print("works");
	if (result.hasErrors()) {
        return "index.jsp";
    } else {
        serv.createlang(language);
        return "redirect:/languages";
    }
}
@RequestMapping("/languages/edit/{id}")
public String edit(@PathVariable("id") Long id,Model model) {
	Language lang= serv.findById(id);
	model.addAttribute("lang",lang);
	return"edit.jsp";
}
@RequestMapping(value ="languages/{id}" ,method=RequestMethod.PUT)
public String update(@Valid@ModelAttribute("lang") Language lang,BindingResult result,@PathVariable("id") Long id) {
	if(result.hasErrors()) {
		return "edit.jsp";
	}else {
		serv.update(id, lang);
		return"redirect:/languages";
	}
}
@RequestMapping(value ="languages/{id}" ,method=RequestMethod.DELETE)
public String delete(@PathVariable("id")Long id) {
	serv.Delete(id);
	return "redirect:/languages";
}
@RequestMapping("/languages/{id}")
public String show(@PathVariable("id") Long id,Model model) {
	Language lang =serv.findById(id);
	model.addAttribute("lang", lang);
	return "show.jsp";
}
}
