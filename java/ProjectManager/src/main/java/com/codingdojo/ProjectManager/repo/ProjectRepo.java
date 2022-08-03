package com.codingdojo.ProjectManager.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.ProjectManager.models.Project;



public interface ProjectRepo extends CrudRepository<Project, Long> {
	Optional<Project> findById(Long id);
}
