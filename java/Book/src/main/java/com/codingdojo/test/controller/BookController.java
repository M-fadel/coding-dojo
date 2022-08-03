package com.codingdojo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.test.model.Book;
import com.codingdojo.test.services.BookService;
@Controller
public class BookController {
	@Autowired
	BookService booksService;
	
@GetMapping("/books/{bookId}")
public String index(Model model,@PathVariable("bookId")Long id) {
	System.out.print(id);
	Book b = booksService.findBook(id);
	System.out.print(b);
	model.addAttribute("b",b);
	return "show.jsp";
}
}
