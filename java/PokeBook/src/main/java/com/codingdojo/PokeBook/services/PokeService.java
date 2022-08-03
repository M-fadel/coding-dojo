package com.codingdojo.PokeBook.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.codingdojo.PokeBook.model.Expense;
import com.codingdojo.PokeBook.repo.PokeRepo;

@Service
public class PokeService {
	private final PokeRepo repo;
	
	public PokeService(PokeRepo repo) {
		this.repo=repo ;
	}
	public List<Expense> allExpenses() {
		return repo.findAll();
	}
	public Expense createPoke(Expense e) {
		return repo.save(e);
	}
	
	public Expense findExpenseById(Long id) {
		Optional<Expense> optionalExpense = repo.findById(id);
		if(optionalExpense.isPresent()) {
	        return optionalExpense.get();
	    } else {
	        return null;
	    }
	}
	public Expense updatd(Long id,Expense ex) {
		Expense e=findExpenseById(id);
		e.setEName(ex.getEName());
		e.setVendore(ex.getVendore());
		e.setAmount(ex.getAmount());
		e.setDes(ex.getDes());
		repo.save(e);
		return e;
	}
	public void Delete(Long Id) {
		Expense e= findExpenseById(Id);
		repo.delete(e);
		
	}
}
