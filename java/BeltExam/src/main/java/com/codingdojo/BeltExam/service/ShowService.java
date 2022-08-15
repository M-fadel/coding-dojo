package com.codingdojo.BeltExam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.BeltExam.model.Show;
import com.codingdojo.BeltExam.repo.ShowRepo;


@Service
public class ShowService {
	@Autowired
	ShowRepo Repo;
	
public Show create(Show s,BindingResult result) {
	List <Show> show =AllShows();
	for(int i =0; i<show.size();i++) {
		if(show.get(i).getTitle().equals(s.getTitle())) {
		result.rejectValue("title", "uniqe", "please enter a uniqe title");
		break;
	}}
	if(result.hasErrors()) {
		return null;
	}
	Repo.save(s);
	return s;
	
}
public List<Show> AllShows() {
	return Repo.findAll();
}
public Show findShow(Long id) {
	Optional<Show> optionalExpense = Repo.findById(id);
	if(optionalExpense.isPresent()) {
        return optionalExpense.get();
    } else {
        return null;
    }
}
public Show update(Show s,Long id,BindingResult result) {
	
	List <Show> shows =AllShows();
	for(int i =0; i<shows.size();i++) {
		if(shows.get(i).getTitle().equals(s.getTitle())) {
		result.rejectValue("title", "uniqe", "please enter a uniqe title");
		break;
	}}
	if(result.hasErrors()) {
		return null;
	}
	Show sho = findShow(id);
	sho.setDis(s.getDis());
	sho.setNetwork(s.getNetwork());
	sho.setTitle(s.getTitle());
	Repo.save(sho);
	return null;
}
public void delete(Long id) {
	Repo.deleteById(id);
}
}
