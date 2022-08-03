package com.codingdojo.Languages.repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.Languages.model.Language;
@Repository
public interface LanguageRepo extends CrudRepository<Language,Long> {
		List<Language> findAll();
}
