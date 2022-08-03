package com.codingdojo.ProductsAndCategories.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.ProductsAndCategories.models.Categories;
import com.codingdojo.ProductsAndCategories.models.Products;
import com.codingdojo.ProductsAndCategories.service.CategoryService;
import com.codingdojo.ProductsAndCategories.service.ProductService;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService CS;
	private ProductService PS;
public CategoryController(CategoryService CS,ProductService PS) {
		this.CS = CS;
		this.PS = PS;
	}

@RequestMapping("/Categories/new")
public String add(@ModelAttribute("Categories") Categories cat) {
	
	return "Cate.jsp";
}
@RequestMapping("/add/cat")
public String create(@Valid@ModelAttribute("Categories")Categories cat,BindingResult result) {
	if(result.hasErrors()) {
		return"";
	}
	CS.createcate(cat);
	return"redirect:/Categories/new";
}


@RequestMapping("/cs/{id}")
public String display(@PathVariable("id")Long id, Model model,@ModelAttribute("Products")Products products) {
	
	model.addAttribute("with",PS.findWith(CS.findById(id)));
	model.addAttribute("without",PS.findWithout(CS.findById(id)));
	model.addAttribute("c",CS.findById(id));
	return"cate1.jsp";
}
@RequestMapping("/catejoin/{id}")
public String join(@PathVariable("id")Long id,@RequestParam(value ="pID")Long pID) {
	
	CS.join(PS.findById(pID), id);
	return"redirect:/cs/"+id;
	
}
}
