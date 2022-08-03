package com.codingdojo.BookClub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.BookClub.models.User;
import com.codingdojo.BookClub.models.book;
import com.codingdojo.BookClub.repo.booksRepo;
@Service
public class bookservice {
private booksRepo booksRepo;

public bookservice(com.codingdojo.BookClub.repo.booksRepo booksRepo) {
	
	this.booksRepo = booksRepo;
}

public List<book> allBooks() {
	return  booksRepo.findAll();
}
public void addBook(book book) {
	booksRepo.save(book);
}
public book findById(Long id) {
	Optional<book> optionalExpense = booksRepo.findById(id);
	if(optionalExpense.isPresent()) {
        return optionalExpense.get();
    } else {
        return null;
    }
}
}
