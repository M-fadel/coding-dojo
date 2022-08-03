package com.codingdojo.DAJ.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.DAJ.models.Ninjas;
import com.codingdojo.DAJ.repo.NinjaRpo;

@Service
public class NinjasService {
private final NinjaRpo ninjaRepo;

public NinjasService(NinjaRpo ninjaRepo) {
	
	this.ninjaRepo = ninjaRepo;
} 
public List<Ninjas> allNinjas() {
	return ninjaRepo.findAll();
}
public Ninjas creatNinja(Ninjas ninja) {
	return ninjaRepo.save(ninja);
}
public List<Ninjas> findByDojo(Long id) {
	List<Ninjas> ninjas = ninjaRepo.findAll();
	
	for (int i = 0 ; i<ninjas.size();i++) {
		if(ninjas.get(i).getDojo().getId()!=id) {
			ninjas.remove(i);
		}
			
	}
	return ninjas;
}
}
