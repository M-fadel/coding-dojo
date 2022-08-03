package com.codingdojo.ProductsAndCategories.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.ProductsAndCategories.models.Categories;
import com.codingdojo.ProductsAndCategories.models.Products;
import com.codingdojo.ProductsAndCategories.service.CategoryService;
import com.codingdojo.ProductsAndCategories.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService pS;
	private CategoryService Cs;
public ProductController(ProductService pS,CategoryService Cs) {
		this.pS = pS;
		this.Cs=Cs;
	}

@RequestMapping("/Products/new")
public String Product(@ModelAttribute("Products")Products Product) {
	return "Product.jsp";
}

@RequestMapping("/add/product")
public String add(@Valid@ModelAttribute("Products")Products Product,BindingResult result) {
	if(result.hasErrors()){
		return "";
	}
	pS.createproduct(Product);
	return"redirect:/Products/new";
}


@RequestMapping("/Products/{id}")
public String display(@PathVariable("id")Long id, Model model,@ModelAttribute("Categories")Categories cate) {
	model.addAttribute("with",Cs.findWith(pS.findById(id)));
	model.addAttribute("without",Cs.findWithout(pS.findById(id)));
	model.addAttribute("p",pS.findById(id));
	return"product1.jsp";
}
@RequestMapping("/prodjoin/{id}")
public String join(@PathVariable("id")Long id,@RequestParam(value ="catId")Long cID) {
	pS.join(Cs.findById(cID), id);
	return"redirect:/Products/"+id;
}
}
