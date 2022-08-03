package com.codingdojo.BookClub.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.BookClub.models.User;
import com.codingdojo.BookClub.models.book;
import com.codingdojo.BookClub.service.UserService;
import com.codingdojo.BookClub.service.bookservice;

@Controller
public class bookConroller {
@Autowired
private bookservice service;
private UserService userServ;

public bookConroller(bookservice service, UserService userServ) {
	this.service = service;
	this.userServ = userServ;
}
@RequestMapping("/books")
public String books(HttpSession session,Model model) {
	User user= userServ.findById((Long)session.getAttribute("user_id"));
	model.addAttribute("s",user);
	model.addAttribute("book",service.allBooks()) ;
	return"home.jsp";
}
@RequestMapping("/add")
public String addBook(@ModelAttribute("book")book book) {
	return "book.jsp";
}
@RequestMapping(value = "/add",method = RequestMethod.POST)
public String add(@Valid@ModelAttribute("book") book book,BindingResult result,HttpSession session) {
	if(result.hasErrors()){
		return"book.jsp";
	}else {
		
		book.setUser(userServ.findById((Long)session.getAttribute("user_id")));
		service.addBook(book);
		return "redirect:/books";
	}
}
@RequestMapping("/books/{id}")
public String showBook(@PathVariable("id")Long id , Model model) {
	model.addAttribute("book",service.findById(id));
	return "show.jsp";
}
}
