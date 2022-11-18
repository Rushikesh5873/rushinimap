package com.nimap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.modal.Category;
import com.nimap.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> getAllCategory(@RequestParam(name="page" , defaultValue = "2") String page) {
		return categoryService.getAllCategory();
	}
	
	@PostMapping("/categories")
	public String addProducts(@RequestBody Category category) {
		categoryService.addCategory(category);
		return "product added successfully";
	}
	
	@GetMapping("/categories/{id}")
	public Optional<Category> getCategoryById(@PathVariable int cid) {
		return categoryService.getCategoryByID(cid);
	}
	
	@DeleteMapping("/categories/{id}")
	public String deleteProductByID(@PathVariable int cid) {
		categoryService.deleteProductByID(cid);
		 return "Category Deleted Successfully";
	}

}
