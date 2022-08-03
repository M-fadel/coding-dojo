package com.codingdojo.ProductsAndCategories.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.ProductsAndCategories.models.Categories;
import com.codingdojo.ProductsAndCategories.models.Products;
@Repository
public interface CategoryRepo extends CrudRepository<Categories , Long> {
	// Retrieves a list of all categories for a particular product
    List<Categories> findAllByProducts(Products product);
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
    List<Categories> findByProductsNotContains(Products product);


}
