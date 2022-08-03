package com.codingdojo.BookBroker.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.BookBroker.model.Book;




public interface bookRepo extends CrudRepository<Book, Long> {
	Optional<Book> findById(Long id);
	List<Book> findAll();
}
