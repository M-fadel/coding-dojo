package com.codingdojo.Languages.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.Languages.model.Language;
import com.codingdojo.Languages.repo.LanguageRepo;
@Service
public class LangService {
	private final LanguageRepo repo;

	public LangService(LanguageRepo repo) {
		this.repo = repo;
	}
	public Language createlang(Language lang) {
		return repo.save(lang);
	}
	public List<Language> allLang() {
		return repo.findAll();
	}
	
	public Language findById(Long id) {
		Optional<Language> optionalExpense = repo.findById(id);
		if(optionalExpense.isPresent()) {
	        return optionalExpense.get();
	    } else {
	        return null;
	    }
	}
	public Language update(Long id,Language lang) {
		Language lan=findById(id);
		lan.setName(lang.getName());
		lan.setCreator(lang.getCreator());
		lan.setVer(lang.getVer());
		repo.save(lan);
		return lan;
	}
	public void Delete(Long Id) {
		Language lang= findById(Id);
		repo.delete(lang);
		
	}
	
	
	
}
