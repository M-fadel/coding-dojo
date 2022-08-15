package com.codingdojo.ProjectManager.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.ProjectManager.models.Project;
import com.codingdojo.ProjectManager.models.User;
import com.codingdojo.ProjectManager.repo.ProjectRepo;

@Service
public class ProjectService {
@Autowired

ProjectRepo Repo;
public Project creat(Project p,BindingResult result,User u) {
	if(p.getDueDate().before(new Date()) ){
		result.rejectValue("dueDate","past","the date cant be in the past");
		
	}
	if(result.hasErrors()){
		return null; 
	}else {
		Repo.save(p);
		return p;
	}
}

public	Project findProject(Long id) {
	Optional<Project> optionalExpense = Repo.findById(id);
	if(optionalExpense.isPresent()) {
        return optionalExpense.get();
    } else {
        return null;
    }
}
public List<Project> findProjects() {
	return Repo.findAll();
}
public void join(Project p, User u) {
	
    
    // retrieve an instance of a product using another method in the service.
    
    
    // add the product to this category's list of products
    p.getTeam().add(u);
    Repo.save(p);
    
    // Save thisCategory, since you made changes to its product list.
}
public Project update(Project p,Long id,BindingResult result) {
	if(p.getDueDate().before(new Date()) ){
		result.rejectValue("dueDate","past","the date cant be in the past");
		
	}
	if(result.hasErrors()){
		return null; 
	}
	Project pro =findProject(id);
	pro.setDes(p.getDes());
	pro.setDueDate(p.getDueDate());
	pro.setTitle(p.getTitle());
		Repo.save(pro);
		return pro;
}

public List<Project> findWith(User u){
	List<Project> p =findProjects();
	ArrayList <Project>pro = new ArrayList<>();

	for(int i=0 ; i<p.size();i++) {
		if(p.get(i).getUser() == u) {
			pro.add(p.get(i));
			
		}
		for (int j = 0; j < p.get(i).getTeam().size(); j++) {
			if(p.get(i).getTeam().get(j)== u) {
				
				 pro.add(p.get(i));
			}
			
		}
	}
	return pro;
}
public List<Project> findWithout(User u){
	List<Project> p =findProjects();
	
	for(int i=0 ; i<p.size();i++) {
		for (int j = 0; j < p.get(i).getTeam().size(); j++) {
			if(p.get(i).getTeam().get(j)== u) {
				 p.remove(i);
			}
			
		}
	}
	return p;
}
public void leave(User u,Long id) {
	Project p =findProject(id);
	for (int i = 0; i < p.getTeam().size(); i++) {
		
		if(p.getTeam().get(i)==u) {
			p.getTeam().set(i, null);
		}
	}
	Repo.save(p);
}

}

