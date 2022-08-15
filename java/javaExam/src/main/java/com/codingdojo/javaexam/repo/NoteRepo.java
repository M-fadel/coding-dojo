package com.codingdojo.javaexam.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.javaexam.model.Note;
import com.codingdojo.javaexam.model.house;
@Repository
public interface NoteRepo extends CrudRepository<Note, Long> {
	List<Note> findAllByHouse(house house);
}
