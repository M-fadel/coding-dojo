package com.codingdojo.DAJ.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.DAJ.models.Dojos;

public interface DojoRepo extends CrudRepository<Dojos, Long>{
List<Dojos> findAll();
}
