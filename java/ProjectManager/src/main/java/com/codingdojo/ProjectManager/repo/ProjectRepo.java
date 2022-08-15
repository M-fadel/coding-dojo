package com.codingdojo.ProjectManager.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.ProjectManager.models.Project;
import com.codingdojo.ProjectManager.models.User;



public interface ProjectRepo extends CrudRepository<Project, Long> {
	Optional<Project> findById(Long id);
	List<Project> findAll();
	// Retrieves a list of all categories for a particular product
    List<Project> findAllByUser(User user);
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
    List<Project> findByUserNotContains(User user);
}
