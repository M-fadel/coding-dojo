package com.codingdojo.ProjectManager.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.ProjectManager.models.Project;
import com.codingdojo.ProjectManager.repo.ProjectRepo;

@Service
public class ProjectService {
@Autowired

ProjectRepo Repo;
public void creat(Project project) {
	Repo.save(project);
}

public	Project findProject(Long id) {
	Optional<Project> optionalExpense = Repo.findById(id);
	if(optionalExpense.isPresent()) {
        return optionalExpense.get();
    } else {
        return null;
    }
}

}
