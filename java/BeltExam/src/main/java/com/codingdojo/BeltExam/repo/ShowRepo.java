package com.codingdojo.BeltExam.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.BeltExam.model.Show;


public interface ShowRepo extends CrudRepository<Show, Long> {
	Optional<Show> findById(Long id);
	List<Show> findAll();
}
