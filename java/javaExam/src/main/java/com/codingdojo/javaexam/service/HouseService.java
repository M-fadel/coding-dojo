package com.codingdojo.javaexam.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.javaexam.model.User;
import com.codingdojo.javaexam.model.house;
import com.codingdojo.javaexam.repo.HouseRepo;


@Service
public class HouseService {
	@Autowired
	HouseRepo Repo;
public void create(house h,User u){
	h.setUser(u);
	Repo.save(h);
}
public house findHouse(Long id) {
	Optional<house> optionalExpense = Repo.findById(id);
	if(optionalExpense.isPresent()) {
        return optionalExpense.get();
    } else {
        return null;
    }
}
public List<house> allHouses() {
	return Repo.findAll();
}
public house update(house h,Long id,BindingResult result) {
//	if(h.getCreatedAt().after(new Date()) ){
//		result.rejectValue("CreatedAt","past","the date cant be in the future");
//		
//	}
//	if(result.hasErrors()){
//		return null; 
//	}
	house ho =findHouse(id);
	ho.setAddres(h.getAddres());
	ho.setPrice(h.getPrice());
	ho.setCreatedAt(h.getCreatedAt());
	
	Repo.save(ho);
	return h;
}
public void delete( Long id) {
	Repo.deleteById(id);
}
}
