package com.codingdojo.PokeBook.repo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.codingdojo.PokeBook.model.Expense;

public interface PokeRepo  extends CrudRepository<Expense, Long>{
	List<Expense> findAll();
}
