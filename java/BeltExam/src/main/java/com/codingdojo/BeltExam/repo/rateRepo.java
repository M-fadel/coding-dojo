package com.codingdojo.BeltExam.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.BeltExam.model.Ratings;


public interface rateRepo extends CrudRepository<Ratings, Long> {

	List<Ratings> findAll();
}
