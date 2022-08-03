package com.codingdojo.ProductsAndCategories.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.ProductsAndCategories.models.Categories;
import com.codingdojo.ProductsAndCategories.models.Products;
import com.codingdojo.ProductsAndCategories.repo.CategoryRepo;

@Service
public class CategoryService  {

	
	private CategoryRepo Repo;
	private ProductService ps;

	public CategoryService(CategoryRepo repo) {
		Repo = repo;
		
	}

	
	public void createcate(Categories categories) {
		Repo.save(categories);
	}
	
	public Categories findById(Long id) {
		Optional<Categories> optionalExpense = Repo.findById(id);
		if(optionalExpense.isPresent()) {
	        return optionalExpense.get();
	    } else {
	        return null;
	    }
	}
	public List<Categories> findWith(Products p) {
		return Repo.findAllByProducts(p);
	}
	
	
	public List<Categories> findWithout(Products p) {
		return Repo.findByProductsNotContains(p);
	}
	
	public void join(Products p,Long id){
	    // retrieve an instance of a category using another method in the service.
		Categories thisCategory = findById(id);
	    
	    // retrieve an instance of a product using another method in the service.
	    Products thisProduct = p;
	    
	    // add the product to this category's list of products
	    thisCategory.getProducts().add(thisProduct);
	    
	    // Save thisCategory, since you made changes to its product list.
	    Repo.save(thisCategory);
	}
}
