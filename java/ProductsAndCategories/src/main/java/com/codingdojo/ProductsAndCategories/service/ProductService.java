package com.codingdojo.ProductsAndCategories.service;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.ProductsAndCategories.models.Categories;
import com.codingdojo.ProductsAndCategories.models.Products;
import com.codingdojo.ProductsAndCategories.repo.ProductRepo;

@Service
public class ProductService {
	
	private ProductRepo Repo;
	private CategoryService CS;
	public ProductService(ProductRepo repo,CategoryService CS) {
		
		this.Repo = repo;
		this.CS = CS;
	}

	
	public void createproduct(Products product) {
		Repo.save(product);
	}
	
	public Products findById(Long id) {
		Optional<Products> optionalExpense = Repo.findById(id);
		if(optionalExpense.isPresent()) {
	        return optionalExpense.get();
	    } else {
	        return null;
	    }
	}

public List<Products> findWith(Categories c) {
	return Repo.findAllByCategories(c);
}


public List<Products> findWithout(Categories c) {
	return Repo.findByCategoriesNotContains(c);
}
public void join(Categories c , Long id) {
	Products p= findById(id);
	Categories cate = CS.findById(c.getId());
	p.getCategories().add(cate);
    
    // Save thisCategory, since you made changes to its product list.
    Repo.save(p);
}
}
