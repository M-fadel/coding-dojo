package com.codingdojo.javaexam.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.javaexam.model.house;
@Repository
public interface HouseRepo extends CrudRepository<house, Long> {
	List<house> findAll();
}
