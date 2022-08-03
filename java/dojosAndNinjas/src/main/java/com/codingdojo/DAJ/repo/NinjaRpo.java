package com.codingdojo.DAJ.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.DAJ.models.Ninjas;
@Repository
public interface NinjaRpo extends CrudRepository<Ninjas, Long> {
	List<Ninjas> findAll();
	
}
