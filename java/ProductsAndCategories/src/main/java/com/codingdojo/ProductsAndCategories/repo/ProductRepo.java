package com.codingdojo.ProductsAndCategories.repo;

import java.util.List;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.ProductsAndCategories.models.Categories;
//import com.codingdojo.ProductsAndCategories.models.Categories;
import com.codingdojo.ProductsAndCategories.models.Products;
@Repository	
public interface ProductRepo extends CrudRepository <Products , Long> {
    List<Products> findAllByCategories(Categories cate);
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
    List<Products> findByCategoriesNotContains(Categories cate);
}