package com.codingdojo.DAJ.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.DAJ.models.Dojos;
import com.codingdojo.DAJ.repo.DojoRepo;


@Service
public class DojosService {
private final DojoRepo dojoRepo;


public DojosService(DojoRepo dojoRepo) {
	
	this.dojoRepo = dojoRepo;
}
public List<Dojos> findAlDojosl(){
	return dojoRepo.findAll();
}
public Dojos creatDojo(Dojos dojo) {
	return dojoRepo.save(dojo);
}
public Dojos findById(Long id) {
	Optional<Dojos> optionalExpense = dojoRepo.findById(id);
	if(optionalExpense.isPresent()) {
        return optionalExpense.get();
    } else {
        return null;
    }
}
}
