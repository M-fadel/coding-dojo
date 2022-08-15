package com.codingdojo.BeltExam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.BeltExam.model.Ratings;
import com.codingdojo.BeltExam.model.User;
import com.codingdojo.BeltExam.repo.rateRepo;

@Service
public class RatingsService {
@Autowired
rateRepo repo;


public List<Ratings> findallrates() {
	
	return repo.findAll();
}
public Ratings findRatBy(Long id) {
	Optional<Ratings> optionalExpense = repo.findById(id);
	if(optionalExpense.isPresent()) {
        return optionalExpense.get();
    } else {
        return null;
    }
}
public void create(Ratings r,User u) {
	Long id = repo.save(r).getId();
	r =findRatBy(id);
	if(r.getRaters() ==null) {
		List<User> l=new ArrayList<User>();
		l.add(u);
		r.setRaters(l); 
	}else {
		r.getRaters().add(u);
	}
	repo.save(r);
}

}
