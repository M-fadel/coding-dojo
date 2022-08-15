package com.codingdojo.javaexam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.javaexam.model.Note;
import com.codingdojo.javaexam.model.house;
import com.codingdojo.javaexam.repo.NoteRepo;

@Service
public class NoteService {
@Autowired
NoteRepo Repo;

public List<Note> findAllbyhouse(house house) {
	return Repo.findAllByHouse(house);
}
public void add(Note note) {
	Repo.save(note);
}
	
}
