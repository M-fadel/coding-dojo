package com.codingdojo.BookBroker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.BookBroker.model.Book;
import com.codingdojo.BookBroker.model.User;
import com.codingdojo.BookBroker.repo.bookRepo;



@Service
public class bookservice {
private bookRepo bookRepo;

public bookservice(bookRepo booksRepo) {
	
	this.bookRepo = booksRepo;
}

public List<Book> allBooks() {
	return  bookRepo.findAll();
}
public void addBook(Book book) {
	bookRepo.save(book);
}
public Book findById(Long id) {
	Optional<Book> optionalExpense = bookRepo.findById(id);
	if(optionalExpense.isPresent()) {
        return optionalExpense.get();
    } else {
        return null;
    }
}
public Book update(Long id,Book book) {
	Book b =findById(id);
	b.setAuthor(book.getAuthor());
	b.setThoughts(book.getThoughts());
	b.setTitle(book.getTitle());
	bookRepo.save(b);
	return book;
}
public void delete(Long id) {
	
	bookRepo.delete(findById(id));
}
public void setborrowed(long bid,User user) {
	Book b =findById(bid);
	b.setbUser(user);
	bookRepo.save(b);
}
}
