package com.codingdojo.BookBroker.controller;

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

import com.codingdojo.BookBroker.model.Book;
import com.codingdojo.BookBroker.model.User;
import com.codingdojo.BookBroker.service.UserService;
import com.codingdojo.BookBroker.service.bookservice;


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
public String addBook(@ModelAttribute("book")Book book) {
	return "book.jsp";
}
@RequestMapping(value = "/add",method = RequestMethod.POST)
public String add(@Valid@ModelAttribute("book") Book book,BindingResult result
		,HttpSession session) {
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
@RequestMapping("/edit/{id}")
public String edit(@PathVariable("id")Long id , Model model) {
	model.addAttribute("book",service.findById(id));
	return "edit.jsp";
}
@RequestMapping(value ="/edit/{id}",method = RequestMethod.PUT)
public String update(@Valid@ModelAttribute("book") Book book,BindingResult result
		,Model model,HttpSession session,@PathVariable("id")Long id) {
	
	if(result.hasErrors()){
		model.addAttribute("book",service.findById(id));
		return"edit.jsp";
	}else {
		service.update(id,book);
		return "redirect:/books";
	}
}
@RequestMapping("/delete/{id}")
public String delete(@PathVariable("id")Long id){
	service.delete(id);
	return "redirect:/books";
}
@RequestMapping("/borrow/{id}")
public String borrow(@PathVariable("id")Long id,HttpSession session) {
	service.setborrowed(id, userServ.findById( (Long)session.getAttribute("user_id")));
	return "redirect:/books";
}
@RequestMapping("/return/{id}")
public String retur(@PathVariable("id")Long id,HttpSession session) {
	service.setborrowed(id, null);
	return "redirect:/books";
}
}
