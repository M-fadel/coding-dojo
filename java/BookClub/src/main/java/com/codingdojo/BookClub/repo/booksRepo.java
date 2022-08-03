package com.codingdojo.BookClub.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.BookClub.models.book;


public interface booksRepo extends CrudRepository<book, Long> {
	Optional<book> findById(Long id);
	List<book> findAll();
}
